var React = require('react');

var AppHeaderTitle = React.createClass({
	render: function(){
		return (
				<div className='row'>
					{this.props.children}
				</div>
		)
	}
});

module.exports = AppHeaderTitle;