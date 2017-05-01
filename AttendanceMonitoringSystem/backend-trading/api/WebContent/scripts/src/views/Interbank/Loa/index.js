var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var List = require('./list');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');

var Inquiry = React.createClass({
	contextTypes: {
		router: React.PropTypes.object,
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({iType: nextProps.params.iType});
		}
	},
	resetState: function(){
		this.setState({
			iType: null,
			loa: ''
		});
	},
	getInitialState: function(){
		return ({
			iType: this.props.params.iType,
			process_mode: false,
			buttons_disabled: true,
			loa: ''
		});
	},
	processFail: function(){
		this.setState({process_mode: 'fail'});
	},
	processSuccess: function(){
		this.setState({process_mode: 'success'});
	},
	Process: function (process_mode) {
	  var state = null;

			if(this.state.loa == 'printedLoa')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<List close={this.closeProcessModal} details={this.Process.bind(this, 'details')}/>
									<div className="overlay" />
								</div>
				};
			}
			else if (this.state.loa == 'newLoa')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<ConfirmationPrompt title="Confirmation" content="Proceed with the Printing
of Interbank Letter of Authority" yes={this.closeProcessModal} no={this.closeProcessModal} />
								</div>
				};
			}
	  //add switch case for add edit delete

	  this.setState(state);
	},
	closeProcessModal: function () {
	  this.setState({process_mode: false});
	},
	updateLoa: function(e){
      var val = e.target.id;
      this.setState({loa: val})
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
            {this.state.iType}
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-5'>
												<label>Transaction Type:</label>
												</div>
											 <div className='col-xs-7'>
											 	<label className='radio-inline'><input className="" type="radio" name='transaction' />Purchase</label>
											 	<label className='radio-inline'><input className="" type="radio" name='transaction'  />Sale</label>
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-6 col-sm-offset-3'>
											<div className='col-xs-5'>
												<label>Loa Type:</label>
												</div>
											 <div className='col-xs-7'>
											 	<div>
													<label className='radio-inline'><input className="" type="radio" name='loa' id="newLoa" onChange={this.updateLoa} />New LOA</label>
												</div>
												<div>
													<label className='radio-inline'><input className="" type="radio" name='loa' id="printedLoa" onChange={this.updateLoa}  />Printed LOA</label>
												</div>
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

module.exports = Inquiry;
