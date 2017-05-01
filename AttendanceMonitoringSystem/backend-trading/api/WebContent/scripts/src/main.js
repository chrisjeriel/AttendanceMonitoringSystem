var React = require('react');
var ReactDOM = require('react-dom');
var Router = require('react-router');
var History = require('history');
var Routes = require('./routes');
var createHashHistory = History.createHashHistory;
var useRouterHistory = Router.useRouterHistory;
var App = require('./container/App');
var Auth = require('./auth/Auth');

var history = useRouterHistory(createHashHistory)({queryKey:false});

function requireAuth(nextState, replace) {
    if ((nextState.location.pathname != '/login') && !Auth.isLoggedIn()){
        replace('/login');
    }
    else if ((nextState.location.pathname == '/login' || nextState.location.pathname == '/') && Auth.isLoggedIn()){
        replace('/menu');
    }
}

ReactDOM.render(
    <App routes={Routes.makeMainRoutes(requireAuth)} history={history} />,
    document.getElementById('main')
);
