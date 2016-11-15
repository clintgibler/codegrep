package main

import (
	"bytes"
	"encoding/json"
	"flag"
	"io/ioutil"
	"log"
	"net/http"
	"net/http/httputil"
	"net/url"
	"strings"
)

type essTermQuery struct {
	Term map[string]string `json:"term"`
}

type essNestedTermQuery struct {
	Nested struct {
		Path string  `json:"path"`
		Query struct {
			Term map[string]string `json:"term"`
		} `json:"query"`
	} `json:"nested"`
}

type essQuery struct {
	Query struct {
		Bool struct {
			Filter []interface{} `json:"filter"`
		} `json:"bool"`
	} `json:"query"`
	Highlight struct {
		Fields map[string]map[string]string `json:"fields"`
	} `json:"highlight"`
}

var essURLInput string
var listenAddress string

func init() {
	flag.StringVar(&essURLInput, "essURL", "http://localhost:9200", "Elasticsearch URL")
	flag.StringVar(&listenAddress, "listen", "localhost:8080", "Address to listen on")
}
func main() {

	flag.Parse()
	essURL, err := url.Parse(essURLInput)
	if err != nil {
		log.Fatalf("Unable to parse elasticsearch URL: %#v\n", essURLInput)
	}
	director := func(r *http.Request) {
		r.Host = essURL.Host
		r.URL.Host = r.Host
		r.URL.Scheme = essURL.Scheme
		r.URL.RawQuery = ""
	}
	essProxy := &httputil.ReverseProxy{Director: director}

	http.HandleFunc("/codesearch/code/_search", func(w http.ResponseWriter, r *http.Request) {

		if r.Method != "GET" {
			http.Error(w, "Method not supported", http.StatusForbidden)
			return
		}

		var query essQuery
		highlightFields := make(map[string]map[string]string)

		for k, values := range r.URL.Query() {
			for _, v := range values {
				// handle highlights
				if k == "highlight" {
					highlightFields[v] = map[string]string{}
					continue
				}
				// detect if we need a nested query
				parts := strings.Split(k, ".")
				if(len(parts) > 1) {
					var nestedQuery essNestedTermQuery
					nestedQuery.Nested.Path = parts[0]
					nestedQuery.Nested.Query.Term = map[string]string{k: strings.ToLower(v)}
					query.Query.Bool.Filter = append(query.Query.Bool.Filter, nestedQuery)
					continue
				}
				var termQuery essTermQuery
				termQuery.Term = map[string]string{k: strings.ToLower(v)}
				query.Query.Bool.Filter = append(query.Query.Bool.Filter, termQuery)
			}
		}
		query.Highlight.Fields = highlightFields
		b, err := json.Marshal(query)
		if err != nil {
			http.Error(w, "Invalid request", http.StatusForbidden)
			return
		}
		log.Printf("Query sent to ess: %#v", string(b))
		rdr := ioutil.NopCloser(bytes.NewBuffer(b))
		r.Body = rdr
		if err != nil {
			http.Error(w, "Invalid request", http.StatusForbidden)
			return
		}
		essProxy.ServeHTTP(w, r)
		return
	})

	http.HandleFunc("/codesearch/code/", func(w http.ResponseWriter, r *http.Request) {
		if r.Method != "GET" {
			http.Error(w, "Method not supported", http.StatusForbidden)
			return
		}
		essProxy.ServeHTTP(w, r)
		return
	})


	// serve assets
	http.Handle("/css/", http.StripPrefix("/css/", http.FileServer(http.Dir("./static/css"))))
	http.Handle("/js/", http.StripPrefix("/js/", http.FileServer(http.Dir("./static/js"))))
	http.Handle("/partials/", http.StripPrefix("/partials/", http.FileServer(http.Dir("./static/partials"))))

	// serve index.html for everything else and let angular handle it
	http.HandleFunc("/index.html", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./static/index.html")
	})

	// serve index.html for everything else and let angular handle it
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./static/index.html")
	})

	http.HandleFunc("/robots.txt", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./static/robots.txt")
	})

	log.Fatal(http.ListenAndServe(listenAddress, nil))
}
