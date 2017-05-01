'use strict';

var React = require('react');
var Router = require('react-router');

var AppBody = React.createClass({
    render: function() {
        return (
            <div className='app-body'>
                {this.props.children}
            </div>
        );
    }
});

module.exports = AppBody;
