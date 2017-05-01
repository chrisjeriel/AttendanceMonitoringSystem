var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');

var OtcRates = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				mode: null,
				modal: null
			}
		);
	},
    showSpreadsModal: function () {
        var state = {   mode: "spreads",
                        modal: <OtcRatesUpdate />
                    };
        this.setState(state);
    },
    showRatesModal: function () {
        var state = {   mode: "spreads",
                        modal: <OtcRatesView />
                    };
        this.setState(state);
    },
    closeProcessModal: function () {
        this.setState({mode: null});
    },
	close:function(){
		this.context.router.push('menu');
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	render:function(){
		return(
			<div className='app-border'>
                {
                    this.state.mode ?
                        this.state.modal
                        : ''
                }
				<AppBody>
					<div className='col-sm-4 col-sm-push-4 app-body-inner'>
						<div className="row">
							<div className="col-sm-12">
								<label>Select Transacting Unit</label>
							</div>
						</div>
							<div className="row">
								<div className="col-sm-12">
									<input type="radio" name="branch" value="1" />BPI/BFP Branches
								</div>
							</div>
							<div className="row">
								<div className="col-sm-12">
									<input type="radio" name="branch" value="2" />BPI Direct
								</div>
							</div>

					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonName='Spreads' whenClicked={this.showSpreadsModal} />
					<ButtonComponent ButtonName='Rates' whenClicked={this.showRatesModal} />
					<ButtonComponent ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

var OtcRatesUpdate = React.createClass({

	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Update OTC Rate Spreads for BPI/BFB Branches</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>With SPREAD for: </label>
							</div>
							<div className="col-sm-2">
								<label>CURRENT</label>
							</div>
							<div className="col-sm-2">
								<label>NEW</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<input type="checkbox"/>
								<label>Buying</label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<input type="checkbox"/>
								<label>Selling</label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});

var OtcRatesView = React.createClass({

	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View OTC Rates for BPI/BFB Branches</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
								<label>Buying Rate</label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Selling Rate</label>
							</div>
							<div className="col-sm-2">
								<input type="text" className="form-control" value=""/>
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
			</div>
			);
	}

});


module.exports = OtcRates;