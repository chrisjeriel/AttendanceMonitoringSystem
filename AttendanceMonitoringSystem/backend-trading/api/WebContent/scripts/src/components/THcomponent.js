var React = require('react');

var THcomponent = React.createClass({
	
	render: function(){
		return (

			<th className={this.props.TitleClass}>
				{this.props.TableTitle}
			</th>
		);
	}
});

module.exports = THcomponent;