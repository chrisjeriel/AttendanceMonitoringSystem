var React = require('react');

var TimeComponent = require('./TimeComponent');
var DateComponent = require('./DateComponent');
var LoginHeader = React.createClass({
	render: function(){
		return (
		<div>
			<div className='row'>
				<div className='col-sm-2'>
					{this.props.children}
				</div>
				<div className='col-sm-8'>
				</div>
				<div className='align-right col-sm-2'>
					<h5><DateComponent/></h5>
				</div>
			</div>
			<div className='row'>
				<div className='col-sm-2'>
					<h5>Form1</h5>
				</div>
				<div className='col-sm-8'>
				</div>
				<div className='align-right col-sm-2'>
					<h5><TimeComponent/></h5>
				</div>
			</div>
		</div>
		)
	}
});

module.exports = LoginHeader;
