var React = require('react');
var Router = require('react-router');


var Navigation = require('../components/NavigationMenu');


var CBGFXTrading = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render: function() {
		return (
			<Navigation>
				{this.props.children}
			</Navigation>
		);
	}
});

module.exports = CBGFXTrading;
