import * as React from "react";
import { Link } from "react-router";

function Highlight(arg) {
    let pattern = /(<em>[^]*?<\/em>)/mg;
    let res = arg.snippet.split(pattern);
    console.log(res);
    let components = [];
    for (let part of res) {
        var found = part.match(/<em>([^]*?)<\/em>/);
        if (found) {
            components.push(<span className="code code-highlight">{found[1]}</span>)
        } else {
            components.push(
                <span className="code">{part}</span>
            )
        }
    }
    return (
        <div className="code-container">{components} </div>
    )
}

function SearchList(hits) {
    const listItems = hits.hits.hits.map((hit) =>
        // Correct! Key should be specified inside the array.
        <li className="search-result" key={hit._id} value={hit._source.filename} >
            <Link to={{ pathname: '/browse', query: { filename: hit._source.filename, repository: hit._source.repository, id: hit._id } }}>{hit._source.filename}</Link>
            <hr className="divider" />
            <a href={hit._source.repository}>{hit._source.repository}</a>
            <Highlight snippet={hit.highlight["content"][0]} />
        </li>
    );
    return (
        <ul className="pt-list-unstyled">
            {listItems}
        </ul>
    );
}


export class SearchResults extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        if (!this.props.results) {
            return (<div></div>);
        }
        return (
            <div className="grid">
                <div className="grid__col-xs-2">
                </div>
                <div className="grid__col-xs-8">
                    <p> Returned {this.props.results.hits.total} results in {this.props.results.took} milliseconds </p>
                    <SearchList hits={this.props.results.hits} />
                </div>
            </div>
        );
    }
}
