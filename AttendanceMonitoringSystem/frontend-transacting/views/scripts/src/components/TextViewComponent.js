'use strict';

var React = require('react');

var TextViewComponent = React.createClass({
    propTypes: {
        title: React.PropTypes.string.isRequired,
        value: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='col-md-6 component'>
                <div className='row'>
                    <label className='col-md-4'>{this.props.title}</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-7'>
                            <span className='block'>{this.props.value}</span>
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = TextViewComponent;
