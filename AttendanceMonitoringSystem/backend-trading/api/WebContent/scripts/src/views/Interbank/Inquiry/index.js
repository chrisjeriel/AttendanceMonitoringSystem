var React = require('react');

var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var List = require('./list');
var Details = require('./details');

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
			referenceNumberVal: '',
		});
	},
	getInitialState: function(){
		return ({
			iType: this.props.params.iType,
			process_mode: false,
			buttons_disabled: true,
			referenceNumberVal: ''
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
	  console.log(this.state.referenceNumberVal);

			if(this.state.referenceNumberVal.length == 0 && process_mode != 'details')
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<List close={this.closeProcessModal} details={this.Process.bind(this, 'details')}/>
									<div className="overlay" />
								</div>
				};
			}
			else
			{
			 	state = { 	process_mode: true,
							process_modal: 
								<div>
									<Details close={this.closeProcessModal} fail={this.processFail} success={this.processSuccess} bankCode={this.state.bankCodeVal} referenceNumber={this.state.referenceNumberVal}/>
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
	updateReferenceNumber: function(e){
      var val = e.target.value;
      this.setState({referenceNumberVal: val})
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
												<label><h5>Reference Number:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input id="referenceNumber" value={this.state.referenceNumberVal} onChange={this.updateReferenceNumber} className="form-control" type="text" placeholder="" />
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
