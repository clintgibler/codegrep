import * as React from "react";

import { Header } from './Header';
import { SearchBar } from './SearchBar';
import { SearchResults } from './SearchResults';

export class Home extends React.Component {

    constructor(props) {
        super(props);
        this.state = {results: undefined};
        this.setResults = this.setResults.bind(this);
    }
    setResults(results) {
        console.log(results);
        this.setState({results: results});
    }
    render() {
        return (
            <div>
                <Header />
                <SearchBar setResults={this.setResults} />
                <SearchResults results={this.state.results} />
            </div>
        );
    }
}