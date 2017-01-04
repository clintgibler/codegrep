import axios from "axios";
import * as React from "react";
import { Header } from "../Header";
import {
	Button,
	Breadcrumb,
	Icon,
	Input,
	Tabs,
	Tree
} from "antd";
import AceEditor from "react-ace";
import { Link } from "react-router";

import 'brace/mode/java';
import 'brace/mode/golang';
import 'brace/theme/solarized_light'

export class Outline extends React.Component {

	constructor(props) {
		super(props);
		this.state = {
			declByType: new Map()
		}
	}

	updateTokenInfo = (token, repo) => {
		axios.get('http://localhost:8080/codesearch/code/_search', {
			"params": {
				"tokens.text": token.text,
				"repository": repo
			}
		}).then((res) => {
			let declByType = new Map();
			res.data.hits.hits.forEach((hit) => {
				hit._source.tokens.forEach((t) => {
					if (t.text === token.text) {
						// declaration
						if (t.type !== "identifier") {
							if (!declByType.get(t.type)) {
								declByType.set(t.type, []);
							}
							declByType.get(t.type).push({
								filename: hit._source.filename,
								id: hit._id,
								token: t
							})
						}
					}
				})
			})
			this.setState({ declByType: declByType })
		}).catch((err) => {
			console.log(err);
		})
	}

	componentDidMount() {
		this.updateTokenInfo(this.props.token, this.props.repository)
	}

	componentWillReceiveProps(nextProps) {
		this.updateTokenInfo(nextProps.token, nextProps.repository)
	}

	render() {
		let declElem = [];
		for (let [type, decl] of this.state.declByType.entries()) {
			let declElemByType = decl.map((d) => {
				return (<div>
					<Link  to={
						{
							pathname: '/browse',

							query: {
								filename: d.filename,
								repository: this.props.repository,
								id: d.id,
								line: d.token.line,
								char: 0
							}
						}}
						>{d.filename.split("/").pop()}#{d.token.line}</Link></div>);
			})
			declElem.push(
				<div className="sidebar-decl">
					<p>{type}</p>
					<hr />
					{declElemByType}
				</div>
			)
		}
		let TabPane = Tabs.TabPane;

		console.log("Sidebar render called", declElem)
		if (this.props.token) {
			return (
				<div>
					<span>{this.props.token.text}</span>
					<hr />
					{declElem}</div>
			);
		}
		else {
			return (<div />)
		}
	}
}