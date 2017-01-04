import * as React from "react";
import {Link} from "react-router";

export class Header extends React.Component {
    render() {
        return (
            <div className="grid grid__align-center" id="navbar">
                <div className="grid__col-xs-2 grid--align-center">
                    <Link to="/" className="brand-title navbar-link">codegrep</Link>
                </div>
                <div className="grid__col-xs-4">
                    <div className="grid grid--bleed">
                        <Link to="/search" className="grid__col-auto navbar-link">Search</Link>
                        {/*
                        <Link to="/browse" className="grid__col-auto navbar-link">Browse</Link>
                        <Link to="/add" className="grid__col-auto navbar-link">Add</Link>
                        */}
                    </div>
                </div>
                <div className="grid__col-xs-4">
                </div>
                <div className="grid__col-xs-2 grid--align-end">
                    <i className="fa fa-github fa-lg"></i>
                </div>
            </div>);
    }
}