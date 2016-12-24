import * as React from "react";
import * as ReactDOM from "react-dom";
import { Router, Route, hashHistory, browserHistory } from 'react-router';
import { Home } from './components/Home';
import { Browser } from './components/Browser';
import { Add } from './components/Add';

ReactDOM.render(
    <Router history={hashHistory}>
        <Route path="/" component={Home} />
        <Route path="/search" component={Home} />
        <Route path="/browse" component={Browser} />
        <Route path="/add" component={Add} />
    </Router>,
    document.getElementById('root'));
