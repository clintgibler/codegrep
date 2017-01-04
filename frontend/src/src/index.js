import * as React from "react";
import * as ReactDOM from "react-dom";
import { Router, Route, browserHistory } from 'react-router';
import { Add } from './components/Add';
import { Browser } from './components/Browser';
import { Home } from './components/Home';
import { Search } from './components/Search';

ReactDOM.render(
    <Router history={browserHistory}>
        <Route path="/" component={Home} />
        <Route path="/search" component={Search} />
        <Route path="/browse" component={Browser} />
        <Route path="/add" component={Add} />
    </Router>,
    document.getElementById('root'));
