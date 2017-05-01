var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var ViewFooter = require('../../components/ViewFooter');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var DataEntry = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	render:function(){
		return(
			<div className='app-border'>
        <AppHeader/>
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
    										<div className='col-xs-6'>
                          <label className='radio-inline'>
                            <input className="" type="radio" name='transaction' />Interbank Purchase
                          </label>
                        </div>
    										<div className='col-xs-6'>
                          <label className='radio-inline'>
                            <input className="" type="radio" name='transaction'  />Interbank Sale
                          </label>
                        </div>
                      </div>
										</div>
									</div>
                  <hr/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Counter Party:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Contact Person:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Bank Address:</h5></label>
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
                  <br/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Currency:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Transaction Amount:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Exchange Rate:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
                  <br/>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Equivalent Amount:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Value Date:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Receiving Account No.(PDDTS):</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Other Instructions:</h5></label>
												</div>
											 <div className='col-xs-7'>
											 	<input className='form-control' type='text' />
											 </div>
										</div>
									</div>
									<div className='row'>
										<div className='col-xs-12 col-sm-8 col-sm-offset-2'>
											<div className='col-xs-5 align-right'>
												<label><h5>Remarks:</h5></label>
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
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Clear' whenClicked={this.Clear} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
				</ViewFooter>
			</div>
		);
	}
});

module.exports = DataEntry;
