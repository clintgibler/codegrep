import * as React from "react";

import { Header } from './Header';
import { Button, Input } from 'antd';

export class Add extends React.Component {
    onSubmit = (e) => {
        console.log("Button submitted!");
    }
    render() {
        return (
            <div>
                <Header />
                <div className="grid nav-secondary">
                    <div className="grid__col-xs-2"></div>
                    <div className="grid__col-xs-8 grid__col--bleed">
                        <div className="grid">
                            <div className="grid__col-xs-10">
                                <Input autoFocus placeholder="Enter your repository url here"></Input>
                            </div>
                            <div className="grid__col-xs-2" id="search-button">
                                <Button type="primary" onClick={this.onSubmit}>Submit</Button>
                            </div>
                        </div>
                    </div>
                    <div className="grid__col-xs-2">
                    </div>
                </div>
            </div>
        );
    }
}