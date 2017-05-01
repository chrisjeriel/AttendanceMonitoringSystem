var React = require('react');

var ButtonComponent = React.createClass({
	propTypes: {
		whenClicked: React.PropTypes.func
	},
	render: function(){
		return (

			<button onClick={this.props.whenClicked} className={this.props.ButtonClass} disabled={this.props.Disable}>
				{this.props.ButtonName}
			</button>
		);
	}
});

module.exports = ButtonComponent;