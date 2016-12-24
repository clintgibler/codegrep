import * as React from "react";

import { Header } from './Header';
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

import {
	Button,
	Breadcrumb,
	Select,
	Tree,
	Input
} from "antd";

import brace from 'brace';
import AceEditor from 'react-ace';

import 'brace/mode/java';
import 'brace/mode/golang';
import 'brace/theme/github';
import 'brace/theme/tomorrow';
import 'brace/theme/solarized_light';


export class Browser extends React.Component {
	constructor(props) {
		super(props);
		this.state = { "data": {}, "error": false, "loading": true };
		axios.get(`http://localhost:8080/codesearch/code/${this.props.location.query.id}`).then(
			(res) => {
				this.setState({ data: res.data });
				console.log(res.data);
				this.setState({ "loading": false });
			}
		)
			.catch(
			(error) => {
				this.setState({ "loading": false });
				this.setState({ "error": true });
			}
			)
	}
	formsubmitted = (e) => {
		console.log("stuff");
	}

	render() {
		if (this.state.loading) {
			return (<h1>Loading</h1>)
		}
		if (this.state.error) {
			return (<h1>error</h1>)
		}
		else {
			console.log(this.state);
			let breadcrumbs = [];
			this.state.data._source.filename.split("/").map((part) => {
				breadcrumbs.push(<Breadcrumb.Item>{part}</Breadcrumb.Item>)
			})
			let token_by_type = new Map();
			this.state.data._source.tokens.map((token) => {
				if (!token_by_type.get(token.type)) {
					token_by_type.set(token.type, []);
				}
				token_by_type.get(token.type).push(token);
			});
			let treeNodes = [];
			for (let [key, value] of token_by_type.entries()) {
				if (key === "identifier") {
					continue;
				}
				let leafNodes = [];
				value.forEach((token) => {
					leafNodes.push(<Tree.TreeNode title={<span>{token.text}</span>} key={token.char} />);
				});
				treeNodes.push(<Tree.TreeNode title={key} key={key}>{leafNodes}</Tree.TreeNode>);
				console.log(key + " = " + value.length);
			}




			return (
				<div>
					<Header />
					<div className="nav-secondary">
						<div className="grid">
							<div className="grid__col-xs-2"></div>
							<div className="grid__col-xs-8 grid__col--bleed">
								<form className="grid" onSubmit={this.formsubmitted}>
									<div className="grid__col-xs-10">
										<Input type="text" value={this.props.location.query.repository} dir="auto" />
									</div>
									<div className="grid__col-xs-2" id="search-button">
										<Button type="primary">Browse</Button>
									</div>
								</form>
							</div>
							<div className="grid__col-xs-2"></div>
						</div>
						<div className="grid">
							<div className="grid__col-xs-2 grid--align-center">
							</div>
							<div className="grid__col-xs-8">
								<Breadcrumb>
									{breadcrumbs}
								</Breadcrumb>

							</div>
						</div>
					</div>

					<div className="grid grid--bleed" id="browser-content">
						<div className="grid__col-xs-2 ace-solarized-light">

							<Tree className="myCls" defaultExpandedKeys={["0-0"]} >
								{treeNodes}
							</Tree>
						</div>
						<div className="grid__col-xs-8">
							<AceEditor showPrintMargin={false} width="100%" height="100%" mode={this.state.data._source.language} theme="solarized_light" readonly="true" name="UNIQUE_ID_OF_DIV"
								value={this.state.data._source.content} readOnly={false}
								onLoad={(editor) => {
									editor.focus();
									editor.getSession().setUseWrapMode(true);
									editor.getSelection().on("changeSelection", () => console.log("selection changed"))
								} }
								/>
						</div>
						<div className="grid__col-xs-2 ace-solarized-light" id="browser-right-side">
							<p>Definition</p>
							<p><a><small>main</small></a></p>
							<p> References </p>
							<p><a><small>osmain/main.go</small></a></p>
							<p><a><small>someotherplace/main.go</small></a></p>
							<p> Find channel definition </p>
						</div>

					</div>
				</div>
			);
		}
	}
}