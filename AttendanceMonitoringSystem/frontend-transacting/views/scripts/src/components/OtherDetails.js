'use strict';

var React = require('react');
var ModalContainerNoTitle = require('./ModalContainerNoTitle');
var InputDate = require('./InputDate');

var OtherDetails = React.createClass({
    render: function () {
        return (
            <ModalContainerNoTitle className="other_details_modal" title = "Other Details">
            <br />
                <div className = "row">
                    <div className="col-md-3">
                        BPI Client:
                    </div>
                    <div className="col-md-9">
                        {this.props.is_bpi_client ? 'Yes' : 'No'}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-3">
                        With Document:
                    </div>
                    <div className="col-md-9">
                        {this.props.with_document ? 'Yes' : 'No'}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-offset-4 col-md-4">
                        Acceptance
                    </div>
                    <div className="col-md-4">
                        Settlement
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-4">
                        Deduct Net of Charges:
                    </div>
                    <div className="col-md-4">
                        {this.props.acceptance_deduct_charges ? 'Yes' : 'No'}
                    </div>
                    <div className="col-md-4">
                        {this.props.settlement_deduct_charges ? 'Yes' : 'No'}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-4">
                        Teller's Validation:
                    </div>
                    <div className="col-md-4">
                        {this.props.acceptance_deduct_charges ? 'Yes' : 'No'}
                    </div>
                    <div className="col-md-4">
                        {this.props.settlement_deduct_charges ? 'Yes' : 'No'}
                    </div>
                </div>
                <br/>
                <div className = "row">
                    <div className="col-md-4">
                        Beneficiary's Data
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-4">
                        Name:
                    </div>
                    <div className="col-md-4">
                        {this.props.beneficiary_name || ''}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-4">
                        Address:
                    </div>
                    <div className="col-md-4">
                        {this.props.beneficiary_address1 || ''}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-offset-4 col-md-4">
                        {this.props.beneficiary_address2 || ''}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-3">
                        Birthdate:
                    </div>
                    <div className="col-md-3">
                        {this.props.beneficiary_birthdate || ''}
                    </div>
                    <div className="col-md-3">
                        TIN:
                    </div>
                    <div className="col-md-3">
                        {this.props.beneficiary_tin || ''}
                    </div>
                </div>
                <div className = "row">
                    <button className = "backg col-sm-offset-5" onClick={this.props.close}><h5>(eXit)</h5></button>
                </div>
            </ModalContainerNoTitle>
        );
    }
});

module.exports = OtherDetails;
