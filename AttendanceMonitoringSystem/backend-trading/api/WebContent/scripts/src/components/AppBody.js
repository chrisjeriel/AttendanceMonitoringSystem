var React = require('react');
var Router = require('react-router');

var AppBody = React.createClass({
	render: function() {
		return (
			<div className='app-body container-fluid'>
					{this.props.children}
			</div>
		);
	}
});

module.exports = AppBody;
