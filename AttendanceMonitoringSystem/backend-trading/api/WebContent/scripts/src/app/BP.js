var React = require('react');
var Router = require('react-router');

var AppContainer = require('../components/AppContainer');
var CBGFXCancellation = require('../views/CBGFXCancellation');

var BP = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render: function() {
		return (
			<AppContainer>
				{this.props.children}
			</AppContainer>
		);
	}
});

module.exports = BP;
