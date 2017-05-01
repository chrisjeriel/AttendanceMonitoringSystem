'use strict';

var React = require('react');
var TransactionContainer = require('../../../components/TransactionContainer');
var ConfirmModal = require('../../../components/ConfirmModal');

var IssuedMC = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function () {
        var hash_data = window.location.hash.split('?')[0].split('/'),
            category = hash_data[4],
            self = this;

        return {
            category: category, //btsu/forex/tmu
            confirm_message: 'View Screen Layout for ' + category.toUpperCase() + ' Manager\'s Check for the Day, Continue?',
            onConfirm: self.confirmContinueToScreen
        }
    },
    confirmContinueToScreen: function (res) {
        if (!res) {
            this.showPrinterMessage()
            return;
        }

        this.setState({confirm_message: ''});
    },
    showPrinterMessage: function () {
        var self = this;

        this.setState({
            confirm_message: 'Proceed to Printing of ' + this.state.category.toUpperCase() + ' MANAGER\'S CHECKS FOR THE DAY',
            onConfirm: self.confirmProceedtoPrinting
        });
    },
    confirmProceedtoPrinting: function (res) {
        this.setState({confirm_message: ''});

        if (res) {
            //print
            alert('Printing of ' + this.state.category.toUpperCase() + ' Manager\'s Checks for the Day Successful');
        }

        this.context.router.push('/main');
    },
    componentWillReceiveProps: function () {
        this.setState(this.getInitialState());
    },
    componentDidMount: function () {
        window.addEventListener('keyup', this.exitListener);
    },
    exitListener: function (e) {
        var key = e.key.toLowerCase();

        if (key === 'escape') {
            this.showPrinterMessage();
        }
    },
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.exitListener);
    },
    render: function () {
        var category = this.state.category.toUpperCase();

        if (this.state.confirm_message) {
            return (
                <TransactionContainer title={category + " MANAGER'S CHECKS FOR THE DAY"}>
                    <ConfirmModal message={this.state.confirm_message} onConfirm={this.state.onConfirm} />
                </TransactionContainer>
            );
        }

        return (
            <TransactionContainer title={category + " MANAGER'S CHECKS FOR THE DAY"}>
                <div className='row'>
                    <div className='col-md-6 col-md-offset-3 text-center'>
                        CBG FX SYSTEM <br/>
                        LIST OF ISSUED MANAGER'S CHECKS FOR THE DAY <br/>
                        DEALT WITH {category} <br/>
                        BUENDIA CENTER BRANCH <br/>
                        October 15, 2002
                    </div>
                    <div className='col-md-1'>
                        PAGE: <br/>
                        TIME: 11:
                    </div>
                </div>
                <br/>
                <div className='row'>
                    <div className='col-xs-10 col-xs-offset-1'>
                        <div className='row'>
                            <div className='col-xs-2 dashedHeader text-center'>
                                Reference No.
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 dashedHeader'>
                                MC Serial No.
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 dashedHeader text-right'>
                                Amount
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 dashedHeader text-center'>
                                N A M E
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000022
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                001
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                19,923.43
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                ABC CORP.
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000023
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                002
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                22,252.43
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                ABC CORP.
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000024
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                003
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                26,581.24
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                ABC CORP.
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000025
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                004
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                29,910.15
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                ABC CORP.
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000044
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                005
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                67,886.90
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                CRUZ, EDITH SANTOS
                            </div>
                        </div>
                        <div className='row'>
                            <div className='col-xs-2'>
                                2P020000048
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                006
                            </div>
                            <div className='col-xs-2 col-xs-offset-1 text-right'>
                                71,283.75
                            </div>
                            <div className='col-xs-2 col-xs-offset-1'>
                                CRUZ
                            </div>
                        </div>
                    </div>
                </div>
            </TransactionContainer>
        );
    }
});

module.exports = IssuedMC;
