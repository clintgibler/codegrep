import * as React from "react";

import { Header } from './Header';
import { SearchBar } from './SearchBar';
import { SearchResults } from './SearchResults';

export class Home extends React.Component {

    render() {
        return (
            <div>
                <Header />
                <SearchBar p={this.props.location.query}/>
            </div>
        );
    }
}