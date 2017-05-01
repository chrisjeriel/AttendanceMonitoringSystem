'use strict';

var React = require('react');
var Router =  require('react-router').Router;

var App = React.createClass({
    propTypes: {
        routes: React.PropTypes.object.isRequired,
        history: React.PropTypes.object.isRequired
    },
    render: function(){
        return (
            <Router
                routes={this.props.routes}
                history={this.props.history} />
        );
    }
});

module.exports = App;
