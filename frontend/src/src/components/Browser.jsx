import axios from "axios";
import * as React from "react";
import { Header } from "./Header";
import {Outline} from "./Browser/Outline"
import {
	Button,
	Breadcrumb,
	Icon,
	Input,
	Tree
} from "antd";
import AceEditor from "react-ace";
import { Link } from "react-router";
import 'brace/mode/java';
import 'brace/mode/golang';
import 'brace/theme/solarized_light';


export class Browser extends React.Component {

	constructor(props) {
		super(props);
		this.state = { "data": {}, "error": false, "loading": true, selectedToken: undefined };
		this.token_by_type = new Map();
		this.token_by_name = new Map();
	}

	update = (id) => {
		axios.get(`http://localhost:8080/codesearch/code/${id}`).then(
			(res) => {
				this.setState({ data: res.data });
				this.setState({ loading: false });
			},
			(error) => {
				console.log("Error", error);
			}
		);
	}

	handleTreeClick = (arg) => {
		let parts = arg[0].split(":");
		this.editor.gotoLine(parts[0], parts[1], true);
	}

	handleSelectionChange = (arg) => {
		if (this.token_by_name.has(arg)) {
			this.setState({ selectedToken: this.token_by_name.get(arg)[0] });
			console.log("Selection changed: ", this.token_by_name.get(arg));
		}
	}


	componentWillMount() {
		this.update(this.props.location.query.id)
	}

	componentWillReceiveProps(nextProps) {
		if(nextProps.location.query.id != this.props.location.query.id) {
			this.update(nextProps.location.query.id)
		}
	}

	render() {
		if (this.state.loading) {
			return (<h1>Loading</h1>)
		}
		if (this.state.error) {
			return (<h1>error</h1>)
		}
		else {
			let language = this.state.data._source.language;
			if (language === "go") {
				language = "golang";
			}
			let breadcrumbs = this.state.data._source.filename.split("/").map((part) => {
				return <Breadcrumb.Item>{part}</Breadcrumb.Item>
			})

			this.state.data._source.tokens.forEach((token) => {

				if (!this.token_by_name.get(token.text)) {
					this.token_by_name.set(token.text, []);
				}

				if (!this.token_by_type.get(token.type)) {
					this.token_by_type.set(token.type, []);
				}
				this.token_by_type.get(token.type).push(token);
				this.token_by_name.get(token.text).push(token);
			});
			let treeNodes = [];
			for (let [key, value] of this.token_by_type.entries()) {
				if (key === "identifier") {
					continue;
				}
				let leafNodes = value.map((token) => {
					return (<Tree.TreeNode title={<span>{token.text}</span>} key={`${token.line}:${token.char}`} />);
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
								{/*
								<form className="grid" onSubmit={this.formsubmitted}>
									<div className="grid__col-xs-10">
										<Input defaultValue={this.state.data._source.repository} type="text" placeholder="Enter repository url here" dir="auto" />
									</div>
									<div className="grid__col-xs-2" id="search-button">
										<Button type="primary">Browse</Button>
									</div>
								</form>
							*/}
							</div>
							<div className="grid__col-xs-2"></div>
						</div>
						<div className="grid">
							<div className="grid__col-xs-2 grid--align-center">
							</div>
							<div className="grid__col-xs-8">
								<Breadcrumb>
									<Breadcrumb.Item href={this.state.data._source.repository}>{this.state.data._source.repository}</Breadcrumb.Item>
									{breadcrumbs}
								</Breadcrumb>

							</div>
						</div>
					</div>

					<div className="grid grid--bleed" id="browser-content">
						<div className="grid__col-xs-2 ace-solarized-light">

							<Tree onSelect={this.handleTreeClick} className="myCls" defaultExpandedKeys={["0-0"]} >
								{treeNodes}
							</Tree>
						</div>
						<div className="grid__col-xs-8">
							<AceEditor showPrintMargin={false} width="100%" height="100%" mode={language} theme="solarized_light" name="editor"
								value={this.state.data._source.content} readOnly={true}
								onLoad={(editor) => {
									this.editor = editor;
									editor.gotoLine(this.props.location.query.line, this.props.location.query.char, true);
									editor.focus();
									editor.getSession().setUseWrapMode(true);
									editor.getSelection().on("changeSelection", () => {
										this.handleSelectionChange(editor.getSelectedText());
									})
								} }
								/>
						</div>
						<div className="grid__col-xs-2 ace-solarized-light" id="browser-right-side">
							<Outline token={this.state.selectedToken} repository={this.props.repository} />
						</div>
					</div>
				</div>
			);
		}
	}
}