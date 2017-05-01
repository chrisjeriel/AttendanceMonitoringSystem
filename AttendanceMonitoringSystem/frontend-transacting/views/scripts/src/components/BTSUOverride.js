'use strict';

var React = require('react');
var ModalContainer = require('./ModalContainer');
var SeparatorComponent = require('./SeparatorComponent');
var Auth = require('../auth/Auth');

var BTSUOverride = React.createClass({
    render: function() {
        return(
            <ModalContainer title = "1ST OFFICER OVERRIDE FACILITY">
                <div className = "row">
                    <div className="col-md-offset-1 col-md-3">
                        <label>OFFICERS USER ID:</label>
                    </div>
                    <div className="col-md-6">
                        <input className="form-control"
                            type="text"
                            placeholder="USER ID"
                            maxLength='8'
                            ref='officeCode'
                            onChange={this.updateOfficeCode} />
                    </div>
                </div>
                <br/>
                <div className = "row">
                    <div className="col-md-offset-1 col-md-3">
                        <label>OFFICERS PASSWORD:</label>
                    </div>
                    <div className="col-md-6">
                        <input className="form-control"
                            type="password"
                            placeholder="PASSWORD"
                            maxLength='8'
                            ref='officeCode'
                            onChange={this.updateOfficeCode} />
                    </div>
                </div>
                <br/>
                <div className = "row">
                    <button className = "col-md-offset-4 backg"><h5>(<mark className = "bgcolor"><b>A</b></mark>CCEPT)</h5></button>
                    <button className = "backg"><h5>(<mark className = "bgcolor"><b>R</b></mark>ETRY)</h5></button>
                    <button className = "backg"><h5>(<mark className = "bgcolor"><b>C</b></mark>ANCEL)</h5></button>
                </div>
            </ModalContainer>
        )
    };
});

module.exports = BTSUOverride;
