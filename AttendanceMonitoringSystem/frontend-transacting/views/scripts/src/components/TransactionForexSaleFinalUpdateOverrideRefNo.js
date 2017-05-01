'use strict';

var React = require('react');
var ModalContainer = require('./ModalContainer');
var SeparatorComponent = require('./SeparatorComponent');
var Auth = require('../auth/Auth');

var TFSFinalUpdateOverrideRefNo= React.createClass({
    render: function() {
        return(
            <ModalContainer title = "FOREX SALE FINAL UPDATE on Override">
                <br />
                <br />
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-3">
                            <label>REFERENCE NO. :</label>
                        </div>
                        /*note: for the input of reference number its optional meaning you can input a reference number
                        or you will just press enter to proceed to the list of reference numbers due for final
                        udpdate-forex override*/
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

module.exports = TFSFinalUpdateOverrideRefNo;
