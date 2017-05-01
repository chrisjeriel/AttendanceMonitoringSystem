var React = require('react');

var AppContainer = React.createClass({
	render: function(){
		return (
			<div className=''>
				{this.props.children}
			</div>
		)
	}
});

module.exports = AppContainer;
