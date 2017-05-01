var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');

var BtsuInitializationBid = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				dialog: null
			}
		);
	},
	Process: function (res) {
		this.setState({
            dialog: <SystemResponse title="System Response" content="Process successful" close={this.closeDialogBox} />
        });
	},
	Close:function(){
		this.context.router.push('menu');
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
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
								<input type="text" className="form-control text-right" disabled />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right"  />
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>Offer</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" disabled />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" />
							</div>
						</div>
						<br />
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Accept' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
			</div>
			);
	}

});

module.exports = BtsuInitializationBid;