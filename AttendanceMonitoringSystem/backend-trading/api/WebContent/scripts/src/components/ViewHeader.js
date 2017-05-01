var React = require('react');

var ViewHeader = React.createClass({
	render: function(){
		return (
			<div className="AppHeader">
				<div className='col-sm-* a-center'>
					{this.props.children}
				</div>
			</div>
		)
	}
});

module.exports = ViewHeader;
