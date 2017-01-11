import * as React from "react";
import { Link } from "react-router";
import _ from "lodash";
import {Spin} from "antd";


class Highlight extends React.Component {
    render() {
        let pattern = /(<em>[^]*?<\/em>)/mg;
        let keyIdx = 0;
        let res = this.props.snippet.split(pattern);
        let components = [];
        for (let part of res) {
            var found = part.match(/<em>([^]*?)<\/em>/);
            if (found) {
                components.push(<span key={keyIdx++} className="code code-highlight">{found[1]}</span>)
            } else {
                components.push(
                    <span key={keyIdx++} className="code">{part}</span>
                )
            }
        }
        return (
            <div className="code-container">{components}</div>
        )
    }
}

class SearchListItem extends React.Component {
    render() {
        return (
            <div>
                <Link to={
                    {
                        pathname: '/browse',
                        query: {
                            filename: this.props.filename,
                            repository: this.props.repository,
                            id: this.props.id,
                            line: 0,
                            char: 0
                        }
                    }}
                    >{this.props.filename}</Link>
                <hr className="divider" />
                <a href={this.props.repository}>{this.props.repository}</a>
                <Highlight snippet={this.props.highlight} />
            </div>
        );
    }
}

class SearchList extends React.Component {
    extractSnippet = (lines, line) => {
        var output = [];
        // antlr4 line number starts from 1
        if (lines.length >= line - 1) {
            output.push(lines[line - 1]);
            if (line - 2 > 0) {
                output.push(lines[line - 2]);
            }
        }
        if (lines.length >= line) {
            output.push(lines[line]);
        }
        return output.join("\n");
    }
    render() {
        const listItems = this.props.hits.map((hit) => {
            let highlight = "";
            if (_.has(hit, "highlight") && _.has(hit["highlight"], "content")) {
                highlight = hit["highlight"]["content"][0];
            }
            return (
                <li className="search-result" key={hit._id}>
                    <SearchListItem filename={hit._source.filename} repository={hit._source.repository}
                        id={hit._id} highlight={highlight} />
                </li>);
        }
        );
        return (
            <ul> {listItems} </ul>
        );
    }
}


export class SearchResults extends React.Component {
    render() {
        let results = null;
        if (!this.props.results) {
            results = <div> <Spin tip="Loading..."></Spin> </div>
        } else {
            results = <div>
                    <p> Returned {this.props.results.hits.total} results in {this.props.results.took} milliseconds </p>
                    <SearchList hits={this.props.results.hits.hits} />
                    </div>
        }
        return (
            <div className="grid">
                <div className="grid__col-xs-2"> </div>
                <div className="grid__col-xs-8"> {results} </div>
                <div className="grid__col-xs-2"> </div>
            </div>
        );
    }
}
