var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var Process = require('./process');
var AppConstants = require('../../../../AppConstants');
var SystemResponse = require('../../../../components/SystemResponse');

var API = require('../../../../api');
var DocStampsPostageCommission = React.createClass({

	getInitialState: function() {
		
	API.maintenance_defsyscontrols.get_options(
	    	
	    		function(data){
	    			console.log(data);
	    			if(data.meta.code == 200 || data.meta.code == 0){
	    					this.setState({
	    					modeOptions: data.data
	    				});
	    			}else{

						console.log("cant get data");
	    			}
	    		}.bind(this),
	    		function(data){
	    			this.setState({
							process_mode: process_mode, 	
							process_modal: 
							<SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
					});
	    		}.bind(this)
	    	);

		
		return (
		{
			selectedValue: null,
			process_modal: null
		})
		
	
	},



	contextTypes: {
		router: React.PropTypes.object
	},
	Inquire: function () {
		 this.setState({ 	
                   
		 				process_modal: 
						<Process modeCode={this.state.selectedValue} desc={this.state.selectedDesc}  close={this.closeProcessModal} processScreen={this.showProcessStatus}/>
					});
	},
	handleChange: function (c) {
		 this.setState({ 	
		 				selectedValue: c.target.value.split("{")[0],
		 				selectedDesc:c.target.value.split("{")[1]
					});
		console.log(this.state.selectedValue);
	},

	  closeProcessModal: function () {
        this.setState({process_modal: null});
    },
   	showProcessStatus: function (success) {
   		if (success==true){
        this.setState({process_modal: 	<SystemResponse title="Successful Update" content={AppConstants.SUCCESS_UPDATE} close={this.closeProcessModal}/>});
    }
    else {
    		  this.setState({process_modal: 	<SystemResponse title="Update Failed" content={AppConstants.FAIL_UPDATE} close={this.closeProcessModal}/>});
    }
    },
	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group'>
							<div className='row'>
								<div className="col-xs-12">
									<div className='col-xs-2'>
										<label>Mode:</label>	
									</div>
									<div className='col-xs-2'>
										<select onChange={this.handleChange}>
										{
												this.state.modeOptions!=null ? 
													this.state.modeOptions.map(function(x){

														return <option value={x.modeCode +"{"+x.modeDesc.trim()} >{x.modeCode}</option>	
													})
												:<option>loading...</option>
											//insert here
										}
										
										
										</select>
									</div>
									<div className='col-xs-8'>
										<input type='text' value={this.state.selectedDesc} disabled="true" className='form-control' />
									</div>
								</div>
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Inquire' whenClicked={this.Inquire} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>

				{
					this.state.process_modal!=null ? this.state.process_modal:'' 
				}
			</div>

			)
	},
	}

);



module.exports = DocStampsPostageCommission;