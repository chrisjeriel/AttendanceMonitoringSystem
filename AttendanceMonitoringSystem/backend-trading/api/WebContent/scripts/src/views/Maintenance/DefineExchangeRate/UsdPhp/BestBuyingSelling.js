var React = require('react');

var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var AppConstants = require('../../../../AppConstants');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var OfficersApproval = require('../Shared OfficersApproval/OfficersApproval');
var API = require('../../../../api');

var BestBuyingSelling = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function() {
        return ({
            dialog: null,
            mode: null,
            modal: null
        });
    },
    componentDidMount: function() {
        API.maintenance_exchangerate.best_buy_sell({
                trdr_fi: "1"
            },
            function(data) {
                //if(data.meta.code == 200 || data.meta.code == 0){
                this.setState({
                    data: data.data
                });
                //}

                console.log(JSON.stringify(this.state.data));

            }.bind(this),
            function(data) {
                this.setState({
                    process_mode: 'list',
                    process_modal: <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
                });
            }.bind(this)
        );
    },
    process: function() {
        var data = null;
        this.processSuccess(data);
    },
    processSuccess: function(data) {
        this.setState({
            dialog: <SystemResponse title="System Response" content="Process successful"  close={this.closeDialogBox} />
        });
    },
    showApprovalModal: function(mode) {
        var state = {
            mode: mode,
            modal: <OfficersApproval processName={mode} process={this.process} closeModal={this.closeModal} />
        };
        this.setState(state);
    },
    closeModal: function() {
        this.setState({ mode: null });
    },
    close: function() {
        this.context.router.push('menu');
    },
    closeDialogBox: function() {
        this.setState({ dialog: null });
    },
    render: function() {
        return (
            <div className='app-border'>
                {
                    this.state.mode ?
                        this.state.modal
                        : ''
                }
				<AppHeader formCode="FXFRMEXRT01" form="Form2">
					<AppHeaderTitle>
						<h5>
							Update USD Bid and Offer for PHP
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-6 col-sm-push-3 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
							</div>
							<div className="col-sm-5 text-center">
								<label>Current</label>
							</div>
							<div className="col-sm-5 text-center">
								<label>New</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>Bid</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" disabled value={this.state.data ? this.state.data[0].PHP_BID : ''} />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" value={this.state.data ? this.state.data[0].PHP_BID : ''}/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>Offer</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" disabled value={this.state.data ? this.state.data[0].PHP_OFFR : ''}/>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" value={this.state.data ? this.state.data[0].PHP_OFFR : ''}/>
							</div>
						</div>
					<br />
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process'
							 whenClicked={this.showApprovalModal.bind(this, 'new USD Bid and Offer for PHP')} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
	            {
	              this.state.mode ?
	                <div className='overlay'></div>
	                :''
	            }
			</div>
        );
    }

});

module.exports = BestBuyingSelling;
