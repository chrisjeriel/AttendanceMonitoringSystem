var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
var ViewFooter = require('../../../components/ViewFooter');
var Navigation = require('../../../components/NavigationMenu');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');
var Table = require('../../../components/TableComponent');
var List = require('./list');
var Details = require('./details');

var DefineInterbankFile = React.createClass({
	contextTypes: {
		router: React.PropTypes.object,
	},
	getInitialState: function(){
		return ({
			process_mode: false,
			buttons_disabled: true,
			bankCodeVal: ''
		});
	},
	processFail: function(){
		this.setState({process_mode: 'fail'});
	},
	processSuccess: function(){
		this.setState({process_mode: 'success'});
	},
	showProcessModal: function (process_mode) {
	  var state = null;
			console.log("showProcessModal:"+process_mode);

			if(process_mode == 'list')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<List mode={process_mode} close={this.closeProcessModal} details={this.showProcessModal.bind(this, 'details')}/>
									<div className="overlay" />
								</div>
				};
			}
			else if(process_mode == 'details')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<Details mode={process_mode} close={this.closeProcessModal} fail={this.processFail} success={this.processSuccess} bankCode={this.state.bankCodeVal}/>
									<div className="overlay" />
								</div>
				};
			}
			else
			{
				var trading_data = this.state.process_data;
				state = { 	process_mode: true,
							process_modal: 
								<div>
									<Process mode={process_mode} data={this.state.data} close={this.closeProcessModal}/>
									<div className="overlay" />
								</div>
				};
			}
	  //add switch case for add edit delete

	  this.setState(state);
	},
	closeProcessModal: function () {
	  this.setState({process_mode: false});
	},
	enableButtons: function (evt) {
	  var val = evt.target.value;
      this.setState({bankCodeVal: val})
	  if (evt.target.value.length>0) {
		this.setState({buttons_disabled: false});
	  } else  {
		this.setState({buttons_disabled: true});
	  }
	},
	render:function(){
		return(
			<div className='app-border'>
			{
				this.state.process_mode ?
					this.state.process_modal
					: ''
			}
        <AppHeader/>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-12'>
												<label><h5>Please Enter Bank ID:</h5></label>
											</div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-4'>
												<label htmlFor="bankCode"><h5>Bank Code:</h5></label>
											</div>
											 <div className='col-xs-8'>
											 	<input value={this.state.bankCodeVal} type='text' className="form-control" id="bankCode" onChange={this.enableButtons}  />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonName="Add" ButtonClass="btn btn-default" whenClicked={this.showProcessModal.bind(this, 'details')} Disable={this.state.buttons_disabled} />
					<ButtonComponent ButtonName="Modify" ButtonClass="btn btn-default" whenClicked={this.showProcessModal.bind(this, 'details')} Disable={this.state.buttons_disabled} />
					<ButtonComponent ButtonName="Delete" ButtonClass="btn btn-default" whenClicked={this.showProcessModal.bind(this, 'details')} Disable={this.state.buttons_disabled} />
					<ButtonComponent ButtonName="Display" ButtonClass="btn btn-default" whenClicked={this.showProcessModal.bind(this, 'list')} />
					<ButtonComponent ButtonName="Print" ButtonClass="btn btn-default" whenClicked={this.Print} />
					<ButtonComponent ButtonName="Close" ButtonClass="btn btn-default" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

module.exports = DefineInterbankFile;
