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
		Path  string `json:"path"`
		Query struct {
			Bool struct {
				Filter []interface{} `json:"filter"`
			} `json:"bool"`
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
  Size int `json:"size"`
  From int `json:"from"`
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
	}
	essProxy := &httputil.ReverseProxy{Director: director}

	http.HandleFunc("/repositories/repository/_search", func(w http.ResponseWriter, r *http.Request) {
		if r.Method != "GET" {
			http.Error(w, "Method not supported", http.StatusForbidden)
			return
		}
		essProxy.ServeHTTP(w, r)
		return
	})

	http.HandleFunc("/codesearch/code/_search", func(w http.ResponseWriter, r *http.Request) {

		if r.Method != "GET" {
			http.Error(w, "Method not supported", http.StatusForbidden)
			return
		}

		var query essQuery
    query.Size = 100
		nestedQueries := make(map[string]essNestedTermQuery)

		highlightFields := make(map[string]map[string]string)

		for k, values := range r.URL.Query() {
			for _, v := range values {
				// handle highlights
				if k == "highlight" {
					highlightFields[v] = map[string]string{}
					continue
				}
				// content field is analyzed by ESS and default tokenizer lower cases
				if k == "content" {
					v = strings.ToLower(v)
				}
				// detect if we need a nested query
				parts := strings.Split(k, ".")
				if len(parts) > 1 {
					var nestedQuery essNestedTermQuery
					if val, ok := nestedQueries[parts[0]]; ok {
						nestedQuery = val
					} else {
						nestedQuery.Nested.Path = parts[0]
					}
					var termQuery essTermQuery
					termQuery.Term = map[string]string{k: v}
					nestedQuery.Nested.Query.Bool.Filter = append(nestedQuery.Nested.Query.Bool.Filter, termQuery)
					nestedQueries[parts[0]] = nestedQuery
					continue
				}
				var termQuery essTermQuery
				termQuery.Term = map[string]string{k: v}
				query.Query.Bool.Filter = append(query.Query.Bool.Filter, termQuery)
			}
		}
		// nested queries
		values := make([]essNestedTermQuery, 0, len(nestedQueries))
		for _, v := range nestedQueries {
			values = append(values, v)
		}
		if len(values) > 0 {
			query.Query.Bool.Filter = append(query.Query.Bool.Filter, values)
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
	http.Handle("/css/", http.StripPrefix("/css/", http.FileServer(http.Dir("./build/css"))))
	http.Handle("/static/js/", http.StripPrefix("/static/js/", http.FileServer(http.Dir("./build/static/js"))))

	// serve index.html for everything else and let react handle it
	http.HandleFunc("/index.html", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./build/index.html")
	})

	// serve index.html for everything else and let angular handle it
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./build/index.html")
	})

	http.HandleFunc("/robots.txt", func(w http.ResponseWriter, r *http.Request) {
		http.ServeFile(w, r, "./build/robots.txt")
	})

	log.Fatal(http.ListenAndServe(listenAddress, nil))
}
