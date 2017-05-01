var React = require('react');

var AppBody = require('../../components/AppBody');
var ViewFooter = require('../../components/ViewFooter');
var AppHeader = require('../../components/AppHeader');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var FxPositionWithAverageCost = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return(
			{
				fxType: this.props.params.fxType
			}
		)
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({fxType: nextProps.params.fxType});
		}
	},
	resetState: function(){
		this.setState({
			fxType: null
		});
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader/>
				<AppBody>
					{this.state.fxType}
					<div className='col-sm-12 app-body-inner'>
            <div className="app-body-inner-content">
  						<div className="row">
                <div className="col-sm-2 text-right text-right">
				          <label htmlFor="tradingUnit"><h5>Trading Unit:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="tradingUnit">
  									<option name="">BRANCHES TREASURY SUPPORT UNIT</option>
  								</select>
                </div>
  						</div>
  						<div className="row">
                <div className="col-sm-2 text-right">
  								<label htmlFor="bank"><h5>Bank:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="bank">
  									<option name="">(BPI) Bank of the Philippine Islands</option>
  									<option name="">(BFB) BPI Family Savings Bank</option>
  								</select>
                </div>
  						</div>
							<hr/>
  						<div className="row">
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" value="till book" name="fxRadio"/> Till Book
                  </label>
  							</div>
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" value="till fx unit" name="fxRadio"/> Till FX Unit
                  </label>
  							</div>
  						</div>
  						<div className="row">
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" value="till application" name="fxRadio"/> Till Application
                  </label>
  							</div>
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
                    <input type="radio" value="till branch" name="fxRadio"/> Till Branch
                  </label>
  							</div>
  						</div>
							<hr/>
  						<div className="row">
                <div className="col-sm-2 text-right">
				          <label htmlFor="book"><h5>Books:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="book">
  									<option name="">REGULAR</option>
  								</select>
                </div>
  						</div>
  						<div className="row">
                <div className="col-sm-2 text-right">
				          <label htmlFor="Application"><h5>Application:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="Application">
  									<option name=""></option>
  								</select>
                </div>
  						</div>
  						<div className="row">
                <div className="col-sm-2 text-right">
				          <label htmlFor="fxUnit"><h5>FX Unit:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="fxUnit">
  									<option name=""></option>
  								</select>
                </div>
  						</div>
  						<div className="row">
                <div className="col-sm-2 text-right">
				          <label htmlFor="branch"><h5>Branch:</h5></label>
                </div>
                <div className="col-sm-6">
  								<select className="form-control" id="branch">
  									<option name=""></option>
  								</select>
                </div>
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

module.exports = FxPositionWithAverageCost;
