'use strict'

var React = require('react');

var DateComponent = React.createClass({
    getInitialState: function() {
        var date = new Date();
        return ({currentDate: (date.getMonth() + 1) + '/' + date.getDate() + '/' + date.getFullYear()});
    },
    setCurrentDate: function(){
        var date = new Date();
        this.setState({currentDate: (date.getMonth() + 1) + '/' + date.getDate() + '/' + date.getFullYear()});
    },
    componentDidMount: function() {
        this.interval = setInterval(this.setCurrentDate, 60000);
    },
    componentWillUnmount: function() {
        clearInterval(this.interval);
    },
    render: function() {
        return (
            <div>{this.state.currentDate}</div>
        );
    }
});

module.exports = DateComponent;
