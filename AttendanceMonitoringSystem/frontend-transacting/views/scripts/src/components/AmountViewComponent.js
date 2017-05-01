'use strict';

var React = require('react');

var CurrencyComponent = require('./CurrencyComponent');

var AmountViewComponent = React.createClass({
    propTypes: {
        title: React.PropTypes.string.isRequired,
        amount: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='col-md-6 component'>
                <div className='row'>
                    <label className='col-md-4'>{this.props.title}</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-7'>
                        <CurrencyComponent
                            amount={this.props.amount} />
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = AmountViewComponent;
