var React = require('react');

var AppBody = require('../../components/AppBody');
var ViewFooter = require('../../components/ViewFooter');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ButtonComponent = require('../../components/ButtonComponent');

var ConfirmationPrompt = require('../../components/ConfirmationPrompt');
var Auth = require('../../auth/Auth');

var PurchaseSale = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return(
			{
				inquiryType: this.props.params.inquiryType,
				reportType: null
			}
		)
	},

	printReports: function(){
		this.setState({
			dialog_enable: true,
			dialog: <ConfirmationPrompt title="Report Preview" content="Do you wish to see a report preview?" yes={this.closeDialogBox} no={this.closeDialogBox} />
		});
	},
	closeDialogBox: function () {
			this.setState({dialog_enable: false});
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			$('.app-body-inner-content input[type=radio]').prop('checked', false);
			this.resetState();
			this.setState({inquiryType: nextProps.params.inquiryType});
		}
	},
	resetState: function(){
		this.setState({
			inquiryType: null,
			reportType: null
		});
	},
	radioCheck: function(e){
		var opt = $(e.target).val();

		this.setState({reportType: opt});
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							Daily Summary Report Printing
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
            <div className="app-body-inner-content">
    					<div className="row">
    						<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" onChange={this.radioCheck} value="today" name="purchaseRadio"/> Today''s Transactions
                  </label>
    						</div>
    						<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" onChange={this.radioCheck} value="cancelled" name="purchaseRadio"/> Cancelled Transactions
                  </label>
    						</div>
    					</div>
							<br/>
							<div className="row">
	    					<div className='col-sm-12 app-body-inner'>
									<div className="app-body-inner-content text-center">
	    							<label>
											<h5>
												This Program will Print
		    								<br/>
		    								BRANCHES TREASURY SUPPORT UNIT
		    								<br/>
		    								Daily Summary of {this.state.inquiryType[0].toUpperCase() + this.state.inquiryType.substring(1)} Transactions
											</h5>
	    							</label>
									</div>
	    					</div>
							</div>
            </div>
          </div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Print' whenClicked={this.printReports} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Cancel' whenClicked={this.Cancel} />
				</ViewFooter>
				{
					this.state.dialog_enable ?
						this.state.dialog
						: ''
				}
			</div>
		);
	}
});

module.exports = PurchaseSale;
