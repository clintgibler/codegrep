import * as React from "react";
import axios from "axios";
import _ from 'lodash';



import { Header } from './Header';
import { SearchBar } from './SearchBar';
import { SearchResults } from './SearchResults';

export class Search extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            results: undefined,
            loading: false,
            failed: false
        };
    }

    componentWillMount = () => {
        this.update(this.props.location.query)
    }

    update = (values) => {
        console.log("update called with", values);
        this.setState({ "loading": true });
        this.setState({ "failed": false });
        let params = {};
        if (values.type) {
            params["tokens.text"] = values.search;
            params["tokens.type"] = values.type;
        } else {
            params["content"] = values.search;
            params["highlight"] = "content";
        }
        if (values.repository) {
            params["repository"] = values.repository;
        }
        if (values.language) {
            params["language"] = values.language;
        }
        axios.get(`http://localhost:8080/codesearch/code/_search`, { params: params }).then(
            (res) => {
                console.log("State updated!");
                this.setState({ "loading": false, "results": res.data });
            }
        ).catch(
            (error) => {
                this.setState({ "loading": false });
                this.setState({ "failed": true });
            });
    }

    componentWillReceiveProps(nextProps) {
        if(!_.isEqual(nextProps.location.query, this.props.location.query)) {
            this.update(nextProps.location.query);
        }
    }

    render() {
        console.log("Render called!");
        return (
            <div>
                <Header />
                <SearchBar p={this.props.location.query}/>
                <SearchResults results={this.state.results} />
            </div>
        );
    }
}