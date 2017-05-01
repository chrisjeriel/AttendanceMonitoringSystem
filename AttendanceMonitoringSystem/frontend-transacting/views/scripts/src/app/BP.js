'use strict';

var React = require('react');
var Router = require('react-router');

var AppContainer = require('../components/AppContainer');
var AppHeader = require('../components/AppHeader');

var BP = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    render: function() {
        return (
            <AppContainer>
                <AppHeader />
                {this.props.children}
            </AppContainer>
        );
    }
});

module.exports = BP;
