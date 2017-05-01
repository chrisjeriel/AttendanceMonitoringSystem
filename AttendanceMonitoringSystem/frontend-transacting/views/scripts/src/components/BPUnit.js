'use strict';

var React = require('react');

var BPUnit = React.createClass({
    propTypes: {
        isName: React.PropTypes.bool.isRequired,
        title: React.PropTypes.string.isRequired,
        name: React.PropTypes.string.isRequired,
        account: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='col-md-12 component'>
                <div className='row'>
                    <label className='col-md-2'>{this.props.title}</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-5'>
                        <span>{this.props.isName ? this.props.name : this.props.account}</span>
                    </div>
                    <div className='col-md-4'>
                        <span>{this.props.isName ? this.props.account : this.props.name}</span>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = BPUnit;
