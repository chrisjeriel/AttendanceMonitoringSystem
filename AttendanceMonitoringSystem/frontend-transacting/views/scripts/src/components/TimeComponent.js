'use strict';

var React = require('react');

var TimeComponent = React.createClass({
    getInitialState: function() {
        var date = new Date();
        var h = this.format(date.getHours()%12);
            h = (h == '00') ? '12' : h;
        var m = this.format(date.getMinutes());
        var s = this.format(date.getSeconds());

        var suffix = (date.getHours() >= 12) ? 'PM' : 'AM';
        var currentTime = h + ':' + m + ':' + s + ' ' + suffix;

        return ({currentTime: currentTime});
    },
    setCurrentTime: function(){
        var date = new Date();
        var h = this.format(date.getHours()%12);
            h = (h == '00') ? '12' : h;
        var m = this.format(date.getMinutes());
        var s = this.format(date.getSeconds());

        var suffix = (date.getHours() >= 12) ? 'PM' : 'AM';
        var currentTime = h + ':' + m + ':' + s + ' ' + suffix;

        this.setState({currentTime: currentTime});
    },
    format: function(input){
        return ((input < 10) ? '0'+input : input);
    },
    componentDidMount: function() {
        this.interval = setInterval(this.setCurrentTime, 1000);
    },
    componentWillUnmount: function() {
        clearInterval(this.interval);
    },
    render: function() {
        return (
            <div>{this.state.currentTime}</div>
        );
    }
});

module.exports = TimeComponent;
