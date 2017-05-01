var React = require('react');

var DateComponent = require('./DateComponent');
var TimeComponent = require('./TimeComponent');
var PageTitle	  = require('./AppHeaderTitle');
var AppHeader = React.createClass({
	render: function(){
		return (
			<div className='AppHeader container-fluid'>
				<div className='col-xs-12'>
					<div className='row'>
						<div className='col-xs-2'>
							<div className='row'>
								<h5>{this.props.formCode ? this.props.formCode : 'Syscon17'}</h5>
							</div>
							<div className='row'>
								<h5>{this.props.form ? this.props.form : 'Form1'}</h5>
							</div>
						</div>
						<div className='col-xs-8 a-center'>
							{this.props.children}
						</div>
						<div className='col-xs-2'>
							<div className='row align-right'>
								<h5><DateComponent /></h5>
							</div>
							<div className='row align-right'>
								<h5><TimeComponent /></h5>
							</div>
						</div>
					</div>
				</div>
			</div>
		)
	}
});

module.exports = AppHeader;
