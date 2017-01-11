import * as React from "react";
import axios from "axios";
import { AutoComplete, Button, Form, Input, Select } from "antd";
import { withRouter } from 'react-router';


// TODO(syamp): Fetch these from backend
const languages = ["java", "go"];
const type = ["annotation", "class", "import", "method", "package", "variable"];

class SearchBarForm extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            repositoryOptions: [],
            languageOptions: languages.map((l) => { return <Select.Option key={l}>{l}</Select.Option> }),
            typeOptions: type.map((t) => { return <Select.Option key={t}>{t}</Select.Option> }),
        };
    }

    updateRepositoryList = (e) => {
        axios.get(`/repositories/repository/_search?q=${e}*`).then(
            (res) => {
                const children = res.data.hits.hits.map((hit) => {
                    return <Select.Option key={hit._source.uri}>{hit._source.uri}</Select.Option>;
                });
                this.setState({ "repositoryOptions": children });
            }
        )
    }

    serialize = (obj) => {
        var str = [];
        for (let p in obj)
            if (obj[p] !== undefined && obj.hasOwnProperty(p)) {
                str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
            }
        return str.join("&");
    }

    handleSearch = (e) => {
        e.preventDefault();
        this.props.form.validateFields((err, values) => {
            this.props.router.push(`/search?${this.serialize(values)}`);
        });
    }

    render() {
        const { getFieldDecorator } = this.props.form;
        console.log(this.props.p);
        return (
            <Form onSubmit={this.handleSearch}>
                <div className="grid nav-secondary">
                    <div className="grid__col-xs-2"></div>
                    <div className="grid__col-xs-8 grid__col--bleed">
                        <div className="grid">
                            <div className="grid__col-xs-12">
                                {getFieldDecorator(`search`, { initialValue: this.props.p.search })(
                                    <Input autoFocus placeholder="Enter your search term here"></Input>
                                )}
                            </div>
                            <div className="grid__col-xs-6">
                                {getFieldDecorator(`language`, { initialValue: this.props.p.language })(

                                    <Select
                                        showSearch
                                        placeholder="Language"
                                        optionFilterProp="children"
                                        >
                                        {this.state.languageOptions}
                                    </Select>
                                )}
                            </div>
                            <div className="grid__col-xs-6">
                                {getFieldDecorator(`type`, { initialValue: this.props.p.type })(
                                    <Select
                                        showSearch
                                        placeholder="Identifier Type"
                                        optionFilterProp="children"
                                        >
                                        {this.state.typeOptions}
                                    </Select>
                                )}
                            </div>
                            <div className="grid__col-xs-6">
                                {getFieldDecorator(`repository`, { initialValue: this.props.p.repository })(
                                    <AutoComplete onChange={this.updateRepositoryList} placeholder="Repository">
                                        {this.state.repositoryOptions}
                                    </AutoComplete>
                                )}
                            </div>
                            <div className="grid__col-xs-2" id="search-button">
                                <Button type="primary" htmlType="submit">Search</Button>
                            </div>
                        </div>
                        <div className="grid__col-xs-2"></div>
                    </div>
                </div>
            </Form>
        );
    }
}


export const SearchBar = withRouter(Form.create()(SearchBarForm));
