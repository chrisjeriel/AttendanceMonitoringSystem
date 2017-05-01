'use strict';

var React = require('react');
var ModalContainer = require('../../components/ModalContainer');
var SeparatorComponent = require('../../components/SeparatorComponent');


var TellerValidation = React.createClass({
    submitTellerValidation: function (e) {
        e.preventDefault();
        this.props.validateTeller(this.refs.acceptance_validation.value, this.refs.settlement_validation.value);
    },
    render: function() {
        return (
            <ModalContainer title = "TELLER VALIDATION">
                <form onSubmit={this.submitTellerValidation}>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-4">
                            <label>Acceptance Validation:</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                            type="text"
                            placeholder="Acceptance Validation Code"
                            maxLength='8'
                            ref='acceptance_validation' />
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-4">
                            <label>Settlement Validation:</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="Settlement Validation Code"
                                maxLength='8'
                                ref='settlement_validation' />
                        </div>
                    </div>
                    <br />
                    <button type='submit' hidden></button>
                </form>
            </ModalContainer>
        );
    }
});

module.exports = TellerValidation;
