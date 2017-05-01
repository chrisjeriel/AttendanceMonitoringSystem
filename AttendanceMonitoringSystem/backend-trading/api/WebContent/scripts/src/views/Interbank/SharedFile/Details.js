var React = require('react');

 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');

var CBGFXInterbankTransactionInquiryProcess = React.createClass({

	render:function(){
		return(
			<div className='app-border'>
				<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<form className='form-group no-border-content'>
								<div className='row app-body-content'>
									<div className='row'>
										<div className='col-xs-12 col-sm-10 col-sm-offset-1'>
											<div className='col-xs-4 align-right'>
												<label>Transaction Type:</label>
												</div>
											 <div className='col-xs-8'>
											 	<div className='col-xs-6'><label className='radio-inline'><input className="" type="radio" name='transaction' />Interbank Purchase</label></div>
											 	<div className='col-xs-6'><label className='radio-inline'><input className="" type="radio" name='transaction'  />Interbank Sale</label></div>
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Counter Party:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Contact Person:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Bank Address:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5'>
												
											</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Currency:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Transaction Amount:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Exchange Rate:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Equivalent Amount:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Value Date:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Receiving Account No.(PDDTS):</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Other Instructions:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label>Remarks:</label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
								</div>
							</form>
						</div>
				</AppBody>
				<ViewFooter>
					<span className='margin-right-40'>
						<label>Reference No <input type='text' /></label>
					</span>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

module.exports = CBGFXInterbankTransactionInquiryProcess;