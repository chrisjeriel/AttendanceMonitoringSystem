'use strict';

var React = require('react');

var PrintViewContainer = React.createClass({
    propTypes: {
        title: React.PropTypes.string.isRequired
    },
    render: function(){
        return (
            <div className='panel-body view-container-print'>
                <div className='container-title'>
                    <h4 className='test-left'>{this.props.title}</h4>
                </div>
                <div className='container-content-print'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = PrintViewContainer;
