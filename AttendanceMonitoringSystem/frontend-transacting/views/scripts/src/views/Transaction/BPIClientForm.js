'use strict';

var React = require('react');
var ModalContainerTransparent = require('../../components/ModalContainerTransparent');

var BPIClientForm = React.createClass({
    getInitialState: function () {
        return {};
    },
    onChangeAcctNo: function (e) {
        var acct_no = e.target.value;

        if (acct_no.length === 12) {
            //request for currency name
        }
    },
    submitBPIClientForm: function (e) {
        e.preventDefault();

        this.props.save(this.refs.acct_no.value, this.state.currency, this.state.name);
    },
    render: function () {
        return(
            <ModalContainerTransparent title = "BPI Client">
                <form onSubmit={this.submitBPIClientForm}>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-4">
                            <label>BPI/BFB Account Number:</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="Account Number"
                                maxLength='12'
                                ref='acct_no'
                                onChange={this.onChangeAcctNo} />
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-4">
                            <label>Currency:</label>
                        </div>
                        <div className="col-md-6">
                            {this.state.currency}
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-4">
                            <label>Name:</label>
                        </div>
                        <div className="col-md-6">
                            {this.state.name}
                        </div>
                    </div>
                    <br />
                    <div className = "row">
                        <button className = "col-md-offset-4 backg" type='submit'><h5>(<mark className = "bgcolor"><b>A</b></mark>CCEPT)</h5></button>
                        <button className = "backg" onClick={this.props.close}><h5>(<mark className = "bgcolor"><b>C</b></mark>ANCEL)</h5></button>
                    </div>
                </form>
            </ModalContainerTransparent>
        );
    }
});

module.exports = BPIClientForm
;
