var React = require('react');

var TDcomponent = React.createClass({
	
	render: function(){
		return (

			<td className={this.props.ContentClass}>
				{this.props.TableContent}
			</td>
		);
	}
});

module.exports = TDcomponent;