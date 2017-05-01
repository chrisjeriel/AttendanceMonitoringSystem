'use strict';

var React = require('react');
var ModalContainer = require('./ModalContainer');
var SeparatorComponent = require('./SeparatorComponent');
var Auth = require('../auth/Auth');

var SpecialRequestRefNo = React.createClass({
    render: function() {
        return(
            <ModalContainer title = "FOREX PURCHASE FINAL UPDATE on Special Request">
                <br />
                <br />
                <div className = "row">
                    <div className="col-md-offset-1 col-md-3">
                        <label>REFERENCE NO. :</label>
                    </div>
                    <div className="col-md-6">
                        <input className="form-control"
                            type="text"
                            placeholder="Reference No."
                            maxLength='8'
                            ref='officeCode'
                            onChange={this.updateOfficeCode} />
                    </div>
                </div>
                <br />
                <br />
                <br />
            </ModalContainer>
        );
    }
});

module.exports = SpecialRequestRefNo;
