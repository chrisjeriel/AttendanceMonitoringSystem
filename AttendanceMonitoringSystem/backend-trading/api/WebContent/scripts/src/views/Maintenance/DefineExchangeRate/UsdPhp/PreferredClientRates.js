var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');

var PreferredClientRates = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	componentDidMount:function(){
		this.loadData();
	},
	loadData: function () {
		var data = {};
		res = API.maintenance_exchangerate.prefrate_load();
				data = res.data;
				console.log(data);
			    $('#buyingRate').val(data.buyingRate);
			    $('#sellingRate').val(data.sellingRate);
	/*	API.maintenance_exchangerate.prefrate_load(null,
			function (res) {
				data = res.data;
				console.log(data);
			    $('#buyingRate'+(i+1)).val(data.buyingRate);
			    $('#sellingRate'+(i+1)).val(data.sellingRate);
			},
			function (res) {
				data = res.data;
				console.log(data);
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			});*/

	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							View Current rates for Preferred Client
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-4 col-sm-push-4 app-body-inner'>
						<div className="row">
							<div className="col-sm-5">
								<label>Buying Rate</label>
							</div>
							<div className="col-sm-7">
								<input type="text" id="buyingRate" className="form-control text-right" value=""/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-5">
								<label>Selling Rate</label>
							</div>
							<div className="col-sm-7">
								<input type="text" id="sellingRate" className="form-control text-right" value=""/>
							</div>
						</div>
						<br />
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

module.exports = PreferredClientRates;