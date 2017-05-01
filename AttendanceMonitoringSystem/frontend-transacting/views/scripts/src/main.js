'use strict';

var React = require('react');
var ReactDOM = require('react-dom');
var Router = require('react-router');

var Routes = require('./routes');
var App = require('./container/App');
var Auth = require('./auth/Auth');

function requireAuth(nextState, replace) {
    if (nextState.location.pathname !== '/login' && !Auth.isLoggedIn()){
        replace('/login');
    }
    else if ((nextState.location.pathname === '/login' || nextState.location.pathname === '/') && Auth.isLoggedIn()){
        replace('/main');
    }
}

ReactDOM.render(
    <App routes={Routes.makeMainRoutes(requireAuth)} history={Router.hashHistory} />,
    document.getElementById('main')
);

