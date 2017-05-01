'use strict';

var React = require('react');

var DateComponent = require('./DateComponent');
var TimeComponent = require('./TimeComponent');
var BPMenu = require('./BPMenu');

var AppHeader = React.createClass({

    getInitialState: function(){
        return ({userId: ''});
    },

    componentDidMount: function(){
        var data = store.get('data');
        if (data) {
            this.setState({userId: data.userId});
            this.setState({officeCode: data.officeCode});
        }
    },

    render: function(){
        return (
            <div className='panel-body app-header'>
                <div className='row'>
                    <div className='col-md-6'>
                        <h4>
                            <b>Bank of the Philippine Islands</b>
                        </h4>
                    </div>
                    <div className='dateadjust col-md-2'>
                        <h5><DateComponent /></h5>
                    </div>
                    <div className='timeadjust'>
                        <h5><TimeComponent /></h5>
                    </div>
                </div>
                <div className='row'>
                    <div className='col-md-6'>
                        <h5>CBG FX Online Purchase & Sale Data Entry Ver. 1.00</h5>
                    </div>
                    <div className='bcadjust col-md-2'>
                        <h5>{this.state.userId}</h5>
                    </div>
                    <div className='cbgadjust'>
                        <h5>BPRCTD</h5>
                    </div>
                </div>
                <div className='row'>
                    <div className='col-md-2'>
                        <h5>{this.state.officeCode}</h5>
                    </div>
                    <div className='adjustBCB col-md-4'>
                        <h5>BUENDIA CENTER BRANCH</h5>
                    </div>
                    <div className='adjustterminalID col-md-2'>
                        <h5>CXE4</h5>
                    </div>
                </div>
                <div className='row'>
                    <div className='mainmenuadjust col-md-12'>
                        <h5><BPMenu /></h5>
                    </div>
                </div>
            </div>
        )
    }
});

module.exports = AppHeader;
