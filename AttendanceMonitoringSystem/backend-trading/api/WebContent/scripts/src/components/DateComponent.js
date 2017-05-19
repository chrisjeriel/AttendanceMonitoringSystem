var React = require('react');

var DateComponent = React.createClass({
	getInitialState: function() {
		var date = new Date();
		return ({currentDate: this.format(date.getMonth() + 1) + '/' + this.format(date.getDate()) + '/' + this.format(date.getFullYear())});
	},
	setCurrentDate: function(){
		var date = new Date();
		this.setState({currentDate: this.format(date.getMonth() + 1) + '/' + this.format(date.getDate()) + '/' + this.format(date.getFullYear())});
	},
	componentDidMount: function() {
		this.interval = setInterval(this.setCurrentDate, 60000);
	},
	componentWillUnmount: function() {
		clearInterval(this.interval);
	},
	format: function(input){
		return ((input < 10) ? '0'+input : input);
	},
	render: function() {
		return (
			<span>{this.state.currentDate}</span>
		);
	}
});

module.exports = DateComponent;
