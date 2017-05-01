var React = require('react');

var ViewFooter = React.createClass({
	render: function(){
		return (
			<div className='footer'>
				<div className='col-sm-* a-center'>
					{this.props.children}
				</div>
			</div>
		)
	}
});

module.exports = ViewFooter;
