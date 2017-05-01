'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');


var DetailRecord = React.createClass({
    getInitialState: function () {
        return {};
    },
    render: function() {
        return(
            <TransactionContainer title = "CLIENT DETAIL RECORD">
                <div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-2">
                            <label><h5>Client Name:</h5></label>
                        </div>
                        <div className="col-md-3">
                            <label><h5>CRUZ, EDITA SANTOS</h5></label>
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-2">
                            <label><h5>Address:</h5></label>
                        </div>
                        <div className="col-md-3">
                            <label><h5>15/F BFB MAIN BLDG.</h5></label>
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-3 col-md-3">
                            <label><h5>MAKATI CITY</h5></label>
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-2">
                            <label><h5>Birthday:</h5></label>
                        </div>
                        <div className="col-md-2">
                            {this.state.birthday || ''}
                        </div>
                        <div className="col-md-offset-1 col-md-2">
                            <label><h5>TIN Number:</h5></label>
                        </div>
                        <div className="col-md-2">
                            {this.state.tin || ''}
                        </div>
                    </div>
                </div>
                <TransactionContainer title="HISTORICAL DATA">
                    <div className="table-scroll table-responsive table-fixed">
                        <table className="table  table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th><h5><b>TRAN DATE</b></h5></th>
                                    <th><h5><b>TRAN UNIT</b></h5></th>
                                    <th><h5><b>REF. NO.</b></h5></th>
                                    <th><h5><b>FROM</b></h5></th>
                                    <th><h5><b>TO</b></h5></th>
                                    <th><h5><b>TRAN AMOUNT</b></h5></th>
                                </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </TransactionContainer>
            </TransactionContainer>
        );
    }
});

module.exports = DetailRecord;
