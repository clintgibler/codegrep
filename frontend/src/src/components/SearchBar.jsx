import * as React from "react";
import axios, {
    AxiosRequestConfig,
    AxiosResponse,
    AxiosError,
    AxiosInstance,
    AxiosAdapter,
    Cancel,
    CancelToken,
    CancelTokenSource,
    Canceler
} from "axios";

import { AutoComplete, Button, Input, Select, Form } from "antd";



class SearchBarForm extends React.Component {

    constructor(props) {
        super(props);
    }

    fetchSearchResults = (e) => {
        e.preventDefault();
        // set loading
        // make a promise 
        console.log(e.target.value);
        axios.get(`http://localhost:8080/codesearch/code/_search?content=${e.target.value}&highlight=content`).then(
            (res) => {
                this.props.setResults(res.data);
            }
        );
    }

    render() {
        let options = [
            { value: 'one', label: 'One' },
            { value: 'two', label: 'Two' }
        ];

        function logChange(val) {
            console.log("Selected: " + val);
        }
        return (
            <div className="grid nav-secondary">
                <div className="grid__col-xs-2"></div>
                <div className="grid__col-xs-8 grid__col--bleed">
                    <div className="grid">
                        <div className="grid__col-xs-12">
                            <Input onPressEnter={this.fetchSearchResults} autoFocus placeholder="Enter your search term here"></Input>
                        </div>
                        <div className="grid__col-xs-6">
                            <Select tags
                                showSearch
                                placeholder="Type"
                                optionFilterProp="children"
                                onChange={logChange}
                                >
                                <Option value="go">go</Option>
                                <Option value="java">java</Option>
                            </Select>
                        </div>
                        <div className="grid__col-xs-6">
                            <Select tags
                                showSearch
                                placeholder="Identifier Type"
                                optionFilterProp="children"
                                onChange={logChange}
                                >
                                <Option value="go">annotations</Option>
                                <Option value="java">methods</Option>
                            </Select>
                        </div>
                        <div className="grid__col-xs-6">
                            <AutoComplete placeholder="Repository" dataSource={[]}></AutoComplete>
                        </div>
                        <div className="grid__col-xs-2" id="search-button">
                            <Button type="primary" onClick={this.fetchSearchResults}>Search</Button>
                        </div>
                    </div>
                    <div className="grid__col-xs-2"></div>
                </div>
            </div>);
    }
}

export const SearchBar = Form.create()(SearchBarForm);