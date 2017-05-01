'use strict';

var React = require('react');

var ViewContainer = React.createClass({
    propTypes: {
        title: React.PropTypes.string
    },
    render: function(){
        return (
            <div className='panel-body view-container'>
                <div className='container-content'>
                    {this.props.children}
                </div>
            </div>
        )
    }
});

module.exports = ViewContainer;
