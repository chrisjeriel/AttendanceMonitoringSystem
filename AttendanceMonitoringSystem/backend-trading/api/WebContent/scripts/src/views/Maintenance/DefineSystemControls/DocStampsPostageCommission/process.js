var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppHeader = require('../../../../components/AppHeader');
var AppConstants = require('../../../../AppConstants');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');


var DocStampsAndCommissionsProcess = React.createClass({

	getInitialState: function() {
	
			API.maintenance_defsyscontrols.get_docstamp_values(
	    	 {modeCode:this.props.modeCode},
	    		function(data){
	    
	    			if(data.meta.code == 200 || data.meta.code == 0){
	    					this.setState({
	    					sdoc_perc: data.data[0].SDOC_PERC,
	    					sdoc_indc: data.data[0].SDOC_INDC,
	    					sdoc_amnt: data.data[0].SDOC_AMNT,
	    					scom_perc: data.data[0].SCOM_PERC, 
	    					scom_amnt: data.data[0].SCOM_AMNT,
	    					scom_indc: data.data[0].SCOM_INDC,
	    					adoc_perc: data.data[0].ADOC_PERC,
	    					adoc_indc: data.data[0].ADOC_INDC,
	    					adoc_amnt: data.data[0].ADOC_AMNT,
	    					acom_perc: data.data[0].ACOM_PERC, 
	    					acom_amnt: data.data[0].ACOM_AMNT,
	    					acom_indc: data.data[0].ACOM_INDC,
	    					mode_code: data.data[0].MODE_CODE,
	    					trdr_fi: data.data[0].TRDR_FI, 
	    					tc_post: data.data[0].TC_POST 
	    				});


	    			}else{

						console.log("cant get data");
	    			}
	    		}.bind(this),
	    		function(data){
	    			console.log(data);
	    		}.bind(this)
	    	);
		return (
		{
			commissionsCheck: null,
			mode: null,
			showModal: true
		})
	},

	Close: function() {
		this.setState({showModal:false});
	},
	updateMode:function(e){
  		var val = e.target.value;
   		this.setState({mode: val})
	},


	onChangeTextMode:function(e){
	this.setState({
		mode_code:e.target.value
	});
	},

	onChangeAdocPerc:function(e){
	this.setState({
		adoc_perc:e.target.value
	});
	},

	onChangeAdocAmnt:function(e){
			this.setState({
		adoc_amnt:e.target.value
	});
	},
	onChangeAcomAmnt:function(e){
			this.setState({
		acom_amnt:e.target.value
	});
	},
	onChangeAcomPerc:function(e){
			this.setState({
		acom_perc:e.target.value
	});
	},

	onChangeSdocPerc:function(e){
	this.setState({
		sdoc_perc:e.target.value
	});
	},

	onChangeSdocAmnt:function(e){
			this.setState({
		sdoc_amnt:e.target.value
	});
	},
	onChangeScomAmnt:function(e){
			this.setState({
		scom_amnt:e.target.value
	});
	},
	onChangeScomPerc:function(e){
			this.setState({
		scom_perc:e.target.value
	});
	},
	onChangeAdocIndc:function(e){
				this.setState({
			adoc_indc: e.target.value
			});
	},
	onChangeAcomIndc:function(e){
				this.setState({
			acom_indc: e.target.value
			});
	},
	onChangeSdocIndc:function(e){
				this.setState({
			sdoc_indc: e.target.value
			});
	},
	onChangeScomIndc:function(e){
				this.setState({
			scom_indc: e.target.value
			});
	},
	onChangeScomCheck:function(e){
		if (e.target.checked ==true ){
			this.setState({
				scom_check:true
			});
		}
		else{
					this.setState({
				scom_check:false
			});
			}
		
	},
	onChangeSdocCheck:function(e){
		if (e.target.checked ==true ){
			this.setState({
				sdoc_check:true
			});
		}
		else{
					this.setState({
				sdoc_check:false
			});
			}
		
	},
	onChangeAcomCheck:function(e){
		if (e.target.checked ==true ){
			this.setState({
				acom_check:true
			});
		}
		else{
					this.setState({
				acom_check:false
			});
			}
		
	},
	onChangeTcPostAmnt:function(e){
				this.setState({
		tc_post:e.target.value
	});
	},
	onChangeAdocCheck:function(e){
		if (e.target.checked ==true ){
			this.setState({
				adoc_check:true
			});
		}
		else{
					this.setState({
				adoc_check:false
			});
			}
		
	},


	// update:function(e){
 //  		var val = e.target.value;
 //   		this.setState({mode: val})
	// },
	Process:function(){
			API.maintenance_defsyscontrols.post_docstamp(
	    	 {
	    					sdocPerc: this.state.sdoc_perc,
	    					sdocIndc: this.state.sdoc_indc,
	    					sdocAmnt: this.state.sdoc_amnt,
	    					scomPerc: this.state.scom_perc, 
	    					scomAmnt: this.state.scom_amnt,
	    					scomIndc: this.state.scom_indc,
	    					adocPerc: this.state.adoc_perc,
	    					adocIndc: this.state.adoc_indc,
	    					adocAmnt: this.state.adoc_amnt,
	    					acomPerc: this.state.acom_perc, 
	    					acomAmnt: this.state.acom_amnt,
	    					acomIndc: this.state.acom_indc,
	    					modeCode: this.state.mode_code,
	    					trdrFi: this.state.trdr_fi, 
	    					tcPost: this.state.tc_post 
	    				},
	    		function(data){
	    			console.log(data.meta.code);
	    	
	    			if(data.meta.code == 200 || data.meta.code == 0){
	    					this.props.processScreen(true);
	    			}else{

							this.props.processScreen( false);
	    			}
	    		}.bind(this),
	    		function(data){
	    			console.log(data);
	    				this.props.processScreen.bind(this, false);
	    		}.bind(this)
	    	);
	},
	

	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Update DOC Stamps and Commissions</h5>
						<h5>BPI BTSU</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-1">
								<label>Mode: </label>
							</div>
							<div className="col-sm-5">
								<input className="form-control docs_stamp_input" disabled="true"   value={this.state.mode_code!=null? this.state.mode_code + " - " + this.props.desc :""} onChange={this.onChangeTextMode}  type="text" placeholder="" />
							</div>
						</div>
						<br/>
						<div>
							<div className="row">
								<div className="col-sm-2">
									<label>TC POSTAGE</label>
								</div>
								<div className = "col-sm-10">
								<div className="row radioButtonsHolder">
								<div className="col-sm-4">
									<label>Charge per</label>
								</div>
								<div className="col-sm-4">
									<label><input type="radio" disabled="true"  name="chargeper1" value="1" />Transaction</label>
								</div>
								<div className="col-sm-4">
				  					<input type="radio" disabled="true"  name="chargeper1" value="0" />Check
				  				</div>
				  				</div>
		  					</div>
		  					</div>
		  				</div>
		  				<div className="row">
		  					<div className="col-sm-2">
			  					<label>Amount</label>
			  				</div>
			  				<div className="col-sm-4">
			  					<input className="form-control docs_stamp_input" type="text"  value={this.state.tc_post!=null? this.state.tc_post:""} onChange={this.onChangeTcPostAmnt}   placeholder="" />
		  					</div>
						</div>
						<br/>
						<div className="docsStampPartHolder">
						<div className="row docStampPartHeader">
							<div className="col-sm-3 headTitle">
								<label>ACCEPTANCE</label>
							</div>
							<div className="col-sm-4">
								<label>PERCENTAGE (%)</label>
							</div>
							<div className="col-sm-5">
								<label>PER AMOUNT</label>
							</div>
						</div>


						<div  className = "docsStampInputHolder" >
						<div className="row">
								<div className="col-sm-2">
									<label>DOCUMENT STAMPS</label>
								</div>
								<div className= "col-sm-10">
									<div className="row radioButtonsHolder">
									<div className="col-sm-4">
										<label>Charge per</label>
									</div>
									<div className="col-sm-4">
										<input type="radio" onChange={this.onChangeAdocIndc} checked={this.state.adoc_indc==1?true:false} name="chargeper2" value="1" />Transaction
									</div>
									<div className="col-sm-4">
					  					<input type="radio" onChange={this.onChangeAdocIndc} checked={this.state.adoc_indc==0?true:false} name="chargeper2" value="0" />Check
					  				</div>
					  				</div>
				  				</div>
				  		</div>
				  		<div className="row">
							<div className="col-sm-3">
	  							<input type="checkbox" name="isfixedamount"  checked = {this.state.adoc_check} onChange={this.onChangeAdocCheck}  value="" />
	  							Fixed Amount
	  						</div>
	  						<div className="col-sm-9">
	  						<div className="col-sm-3">
	  							<input className="form-control docs_stamp_input" type="text" disabled= {this.state.adoc_check} value={this.state.adoc_perc!=null? this.state.adoc_perc:""} onChange={this.onChangeAdocPerc} placeholder="" />
	  						</div>
	  						<div className="col-sm-9">
	  							<input className="form-control docs_stamp_input" type="text" value={this.state.adoc_amnt!=null? this.state.adoc_amnt:""} onChange={this.onChangeAdocAmnt} placeholder="" />
	  						</div>
	  						</div>
						</div>
						</div>
						<br/>
							<div  className = "docsStampInputHolder" >
						<div className="row">
								<div className="col-sm-2">
									<label>COMMISSION</label>
								</div>
								<div className="col-sm-10">
									<div className="row radioButtonsHolder">
										<div className="col-sm-4">
											<label>Charge per</label>
										</div>
										<div className="col-sm-4">
											<input type="radio" name="chargeper3"  checked={this.state.acom_indc==1?true:false} value="1" onChange={this.onChangeAcomIndc}  />Transaction
										</div>
										<div className="col-sm-4">
						  					<input type="radio" name="chargeper3"  checked={this.state.acom_indc==0?true:false}  value="0" onChange={this.onChangeAcomIndc}  />Check
						  				</div>
					  				</div>
				  				</div>
				  		</div>
				  		<div className="row">
							<div className="col-sm-3">
	  							<input type="checkbox" name="isfixedamount" checked = {this.state.acom_check} onChange={this.onChangeAcomCheck} value="" />
	  							Fixed Amount
	  						</div>
	  						<div className="col-sm-9">
	  						<div className="col-sm-3">
	  							<input className="form-control docs_stamp_input"  disabled={this.state.acom_check} value={this.state.acom_perc!=null? this.state.acom_perc:""} onChange={this.onChangeAcomPerc}  type="text" placeholder="" />
	  						</div>
	  						<div className="col-sm-9">
	  							<input className="form-control docs_stamp_input"  value={this.state.acom_amnt!=null? this.state.acom_amnt:""} onChange={this.onChangeAcomAmnt} type="text" placeholder="" />
	  						</div>
	  						</div>
	  						</div>
						</div>
					</div>
					
						<br/>
						<div className="docsStampPartHolder">
						<div className="row docStampPartHeader">
							<div className="col-sm-3 headTitle">
								<label >Settlement</label>
							</div>
							<div className="col-sm-4">
								<label>PERCENTAGE (%)</label>
							</div>
							<div className="col-sm-5">
								<label>PER AMOUNT</label>
							</div>
						</div>


						<div  className = "docsStampInputHolder" >
						<div className="row">
								<div className="col-sm-2">
									<label>DOCUMENT STAMPS</label>
								</div>
								<div className= "col-sm-10">
									<div className="row radioButtonsHolder">
									<div className="col-sm-4">
										<label>Charge per</label>
									</div>
									<div className="col-sm-4">
										<input type="radio" name="chargeper4"  checked={this.state.sdoc_indc==1?true:false}  onChange={this.onChangeSdocIndc} value="1"/>Transaction
									</div>
									<div className="col-sm-4">
					  					<input type="radio" name="chargeper4"  checked={this.state.sdoc_indc==0?true:false} onChange={this.onChangeSdocIndc} value="0" />Check
					  				</div>
					  				</div>
				  				</div>
				  		</div>
				  		<div className="row">
							<div className="col-sm-3">
	  							<input type="checkbox" name="isfixedamount"  checked = {this.state.sdoc_check} onChange={this.onChangeSdocCheck}  value="" />
	  							Fixed Amount
	  						</div>
	  						<div className="col-sm-9">
	  						<div className="col-sm-3">
	  							<input className="form-control docs_stamp_input" type="text" disabled={this.state.sdoc_check} value={this.state.sdoc_perc!=null? this.state.sdoc_perc:""} onChange={this.onChangeSdocPerc} placeholder="" />
	  						</div>
	  						<div className="col-sm-9">
	  							<input className="form-control docs_stamp_input" type="text"  value={this.state.sdoc_amnt!=null? this.state.sdoc_amnt:""} onChange={this.onChangeSdocAmnt} placeholder="" />
	  						</div>
	  						</div>
						</div>
						</div>
						<br/>
							<div  className = "docsStampInputHolder" >
						<div className="row">
								<div className="col-sm-2">
									<label>COMMISSION</label>
								</div>
								<div className="col-sm-10">
									<div className="row radioButtonsHolder">
										<div className="col-sm-4">
											<label>Charge per</label>
										</div>
										<div className="col-sm-4">
											<input type="radio" name="chargeper5" value="1"  checked={this.state.scom_indc==1?true:false}  onChange={this.onChangeScomIndc}   />Transaction
										</div>
										<div className="col-sm-4">
						  					<input type="radio" name="chargeper5"  value="0"  checked={this.state.scom_indc==0?true:false} onChange={this.onChangeScomIndc}  />Check
						  				</div>
					  				</div>
				  				</div>
				  		</div>
				  		<div className="row">
							<div className="col-sm-3">
	  							<input type="checkbox" name="isfixedamount"  checked = {this.state.scom_check} onChange={this.onChangeScomCheck}  value="" />
	  							Fixed Amount
	  						</div>
	  						<div className="col-sm-9">
	  						<div className="col-sm-3">
	  							<input className="form-control docs_stamp_input" type="text" disabled={this.state.scom_check} value={this.state.scom_perc!=null? this.state.scom_perc:""} onChange={this.onChangeScomPerc}  placeholder="" />
	  						</div>
	  						<div className="col-sm-9">
	  							<input className="form-control docs_stamp_input" type="text"  value={this.state.scom_amnt!=null? this.state.scom_amnt:""} onChange={this.onChangeScomAmnt}  placeholder="" />
	  						</div>
	  						</div>
	  						</div>
						</div>
					</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close} />
				</ViewFooter>
			</div>
			);
	}

});


module.exports = DocStampsAndCommissionsProcess;