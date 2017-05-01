'use strict';

var React = require('react');

var BPCustomer = React.createClass({
    propTypes: {
        name: React.PropTypes.string.isRequired,
        account: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='col-md-12 component'>
                <div className='row'>
                    <label className='col-md-2'>Customer Name</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-5'>
                        <span>{this.props.name}</span>
                    </div>
                    <div className='col-md-4'>
                        <span>{this.props.account}</span>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = BPCustomer;
