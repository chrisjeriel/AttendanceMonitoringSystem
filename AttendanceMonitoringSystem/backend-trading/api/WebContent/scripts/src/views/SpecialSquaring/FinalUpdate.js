var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ViewFooter = require('../../components/ViewFooter');
var Navigation = require('../../components/NavigationMenu');
var Auth = require('../../auth/Auth');
var ButtonComponent = require('../../components/ButtonComponent');


var FinalUpdate = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
  getInitialState: function(){
		return(
			{
				tranType: this.props.params.tranType
			}
		)
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({tranType: nextProps.params.tranType});
		}
	},
	resetState: function(){
		this.setState({
			tranType: null
		});
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader formCode="FXFRMBTSUIN" form="Form2">
					<AppHeaderTitle>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<form className='form-group'>
							<div className='row app-body-content padding-content'>
								<div className='col-xs-3'>
									<div className='col-xs-4'>
										<h6><strong>Deal With:</strong></h6>
									</div>
									<div className='col-xs-8 border-line-w-padding'>
										<div className='radio '>
											<label><input type='radio' name='deal'/>Spot Desk1</label>
										</div>
										<div className='radio'>
											<label><input type='radio' name='deal'/>Spot Desk2</label>
										</div>
									</div>
								</div>
								<div className='col-xs-3'>
									<div className='col-xs-5'>
										<h6><strong>Transaction Type:</strong></h6>
									</div>
									<div className='col-xs-7 border-line-w-padding'>
										<div className='radio'>
											<label><input type='radio' name='transaction'/>Purchase</label>
										</div>
										<div className='radio'>
											<label><input type='radio' name='transaction'/>Sale</label>
										</div>
									</div>
								</div>
								<div className='col-xs-3'>
									<div className='col-xs-5'>
										<h6><strong>Bank:</strong></h6>
									</div>
									<div className='col-xs-7 border-line-w-padding'>
										<div className='radio'>
											<label><input type='radio' name='bank'/>BPI</label>
										</div>
										<div className='radio'>
											<label><input type='radio' name='bank'/>BFB</label>
										</div>
									</div>
								</div>								
								<div className='col-xs-3'>
									<div className='col-xs-5'>
										<h6><strong>Book:</strong></h6>
									</div>
									<div className='col-xs-7 border-line-w-padding'>
										<div className='radio'>
											<label><input type='radio' name='book'/>Regular</label>
										</div>
										<div className='radio'>
											<label><input type='radio' name='book'/>FCDU</label>
										</div>
									</div>
								</div>
							</div>
							<div className='row app-body-content padding-content'>
								<div className='col-xs-10 col-xs-offset-1'>
									<div className='col-xs-6'>
										<label htmlFor="currency"><h5>Currency Pair:</h5></label>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='col-xs-10 col-xs-offset-1'>
									<div className='col-xs-6'>
										<h5>Acceptance / Settlement Mode:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
							</div>
							<div className='row padding-content'>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Client Name:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Transaction Amount in</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control width-20 display-inline' value="USD" disabled type='text'/><input className='form-control width-50 display-inline' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Exchange Rate:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Grant Rate:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control width-50 display-inline' type='text' /> <ButtonComponent ButtonClass="btn btn-default" ButtonName='Compute' onClick={this.Compute} />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Equivalent Amount in</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control width-20 display-inline' value="PHP" disabled type='text'/><input className='form-control width-50 display-inline'type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Invisible Code:</h5>
									</div>
									<div className='col-xs-4'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>BTSU Remarks:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Treasury Approval Status:</h5>
									</div>
									<div className='col-xs-3'>
										<select className='form-control'>
											<option></option>
										</select>
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Treasury Remarks:</h5>
									</div>
									<div className='col-xs-6'>
										<input className='form-control' type='text' />
									</div>
								</div>
								<div className='row'>
									<div className='col-xs-4 col-xs-offset-1 text-right'>
										<h5>Final Update Status:</h5>
									</div>
									<div className='col-xs-3'>
										<select className='form-control'>
											<option></option>
										</select>
									</div>
								</div>
							</div>
						</form>
					</div>
				</AppBody>
				<ViewFooter>
					<div className='row padding-ref-no'>
						<div className='col-xs-6 border-line'>
							<div className='col-xs-4'>
								<h5>Reference No:</h5>
							</div>
							<div className='col-xs-8'>
								<input type='text' className='form-control'/>
							</div>
						</div>
						<div className='col-xs-4'>
						</div>
						<div className='col-xs-2 align-center border-line'>
							<ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />&nbsp;
							<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
						</div>
					</div>
				</ViewFooter>
			</div>
		);
	}
});

module.exports = FinalUpdate;
