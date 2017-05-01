'use strict';

var React = require('react');
var ModalContainer = require('../../components/ModalContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');

var FirstOverride = React.createClass({
    submitOfficerOverride: function (e) {
        e.preventDefault();
        var user_id = this.refs.user_id.value,
            password = this.refs.password.value

        if (user_id && password) {
            //send request if success
            this.props.then();
        }
    },
    render: function () {
        return (
            <ModalContainer title = "1ST OFFICER OVERRIDE FACILITY">
                <form onSubmit={this.submitOfficerOverride}>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-3">
                            <label>OFFICERS USER ID:</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="USER ID"
                                maxLength='8'
                                ref='user_id' />
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-3">
                            <label>OFFICERS PASSWORD:</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="password"
                                placeholder="PASSWORD"
                                maxLength='8'
                                ref='password' />
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <button type="submit" className = "col-md-offset-4 backg"><h5>(<mark className = "bgcolor"><b>A</b></mark>CCEPT)</h5></button>
                        <button onClick={this.props.closeFirstOfficerOverride} className = "backg"><h5>(<mark className = "bgcolor"><b>C</b></mark>ANCEL)</h5></button>
                    </div>
                </form>
            </ModalContainer>
        );
    }
});

module.exports = FirstOverride;
