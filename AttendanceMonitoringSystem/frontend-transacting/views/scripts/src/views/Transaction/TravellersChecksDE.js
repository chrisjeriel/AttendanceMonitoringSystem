'use strict';

var React = require('react');

var ModalContainerTransparent = require('../../components/ModalContainerTransparent');
var ModalContainerNoTitle = require('../../components/ModalContainerNoTitle');
var ViewFooter = require('../../components/ViewFooter');
var CBGKey = require('../../components/CBGKey');
var SeparatorComponent = require('../../components/SeparatorComponent');


var TravellersChecksDE = React.createClass({
    getInitialState: function () {
        return {count: 0};
    },
    updateCount: function () {
        var i, check_no_input, count = 0;

        for (i = 0; i < 5; i++) {
            check_no_input = this.refs['check_no' + i];
            if (check_no_input.value) {
                count++;
            }
        }

        this.setState({count: count});
    },
    computeTotal: function () {
        var i, check_amnt_input, total = 0, count = 0;

        for (i = 0; i < 5; i++) {
            check_amnt_input = this.refs['check_amnt' + i];
            if (check_amnt_input.value) {
                total += +check_amnt_input.value;
                count++;
            }
        }

        this.setState({
            total: total,
            amnt_count: count
        });
    },
    save: function (e) {
        e.preventDefault();

        if (this.state.amnt_count !== this.state.count) {
            alert('Check No. and Check Amount does not match');
            return;
        }

        if (this.state.total > this.props.tran_amnt) {
            alert('Total amount entered exceeds transaction amount by ' + (this.state.total - +this.props.tran_amnt));
        }
        else if (this.state.total < this.props.tran_amnt) {
            alert('Total amount entered is less than the transaction amount by ' + (+this.props.tran_amnt - this.state.total));
        }

        this.props.save();
    },
    render: function () {
        return (
            <ModalContainerTransparent title = "Travellers Checks Data Entry">
                <form onSubmit={this.save}>
                    <div className = 'table-scroll table-responsive'>
                        <table className ="table table-fixed table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th><h5><b>Seq</b></h5></th>
                                    <th><h5><b>Check No.</b></h5></th>
                                    <th><h5><b>Check Amount</b></h5></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><h5>1</h5></td>
                                    <td><input ref='check_no0' onChange={this.updateCount} type="number"/></td>
                                    <td><input ref='check_amnt0' onChange={this.computeTotal} type="number"/></td>
                                </tr>
                                <tr>
                                    <td><h5>2</h5></td>
                                    <td><input ref='check_no1' onChange={this.updateCount} type="number"/></td>
                                    <td><input ref='check_amnt1' onChange={this.computeTotal} type="number"/></td>
                                </tr>
                                <tr>
                                    <td><h5>3</h5></td>
                                    <td><input ref='check_no2' onChange={this.updateCount} type="number"/></td>
                                    <td><input ref='check_amnt2' onChange={this.computeTotal} type="number"/></td>
                                </tr>
                                <tr>
                                    <td><h5>4</h5></td>
                                    <td><input ref='check_no3' onChange={this.updateCount} type="number"/></td>
                                    <td><input ref='check_amnt3' onChange={this.computeTotal} type="number"/></td>
                                </tr>
                                <tr>
                                    <td><h5>5</h5></td>
                                    <td><input ref='check_no4' onChange={this.updateCount} type="number"/></td>
                                    <td><input ref='check_amnt4' onChange={this.computeTotal} type="number"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <label>Count:</label>
                        </div>
                        <div className="col-md-2">
                            {this.state.count || 0}
                        </div>
                        <div className="col-md-offset-1 col-md-1">
                            <label>TOTAL=>:</label>
                        </div>
                        <div className="col-md-4">
                            {this.state.total || 0}
                        </div>
                    </div>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-1">
                            <label>Total</label>
                        </div>
                        <div className="col-md-offset-3 col-md-1">
                            <label>Amount=>:</label>
                        </div>
                        <div className="col-md-4">
                            {this.props.tran_amnt || 0}
                        </div>
                    </div>
                    <div className="row">
                        <button type="submit" className="btn btn-default col-sm-offset-1 col-sm-2">
                            Save
                        </button>
                        <button type="button" onClick={this.props.close} className="btn btn-default col-sm-offset-1 col-sm-2">
                            Cancel
                        </button>
                    </div>
                </form>
            </ModalContainerTransparent>
        );
    }
});

module.exports = TravellersChecksDE;
