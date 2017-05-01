var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var ViewFooter = require('../../components/ViewFooter');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var ViewSquaringTransactionsWithTreasury = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return(
			{
				sTranType: this.props.params.sTranType
			}
		)
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({sTranType: nextProps.params.sTranType});
		}
	},
	resetState: function(){
		this.setState({
			sTranType: null
		});
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader/>
        {this.state.sTranType}
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
            <div className="app-body-inner-content">
  						<div className="row">
                <div className="col-sm-5">
                  <label className="checkbox-inline">
                    <input type="radio" value="waiting" name="fxRadio"/> Awaiting for Approval
                  </label>
                </div>
  						</div>
  						<div className="row">
  							<div className="col-sm-5">
                  <label className="checkbox-inline">
                    <input type="radio" value="done" name="fxRadio"/> Done
                  </label>
  							</div>
  						</div>
  						<div className="row">
  							<div className="col-sm-5">
                  <label className="checkbox-inline">
                    <input type="radio" value="disapproved" name="fxRadio"/> Disapproved
                  </label>
  							</div>
  						</div>
              <br/>
  						<div className="row">
  							<div className="col-sm-2 text-right">
  								<label htmlFor="tranType"><h5>Transaction Type:</h5></label>
  							</div>
  							<div className="col-sm-5">
                  <select className="form-control" id="tranType">
                    <option name="">SALE</option>
                  </select>
  							</div>
  						</div>
  						<div className="row">
  							<div className="col-sm-2 text-right">
  								<label htmlFor="dealWith"><h5>Deal With:</h5></label>
  							</div>
  							<div className="col-sm-5">
                  <select className="form-control" id="dealWith">
  									<option name="">BPI TREASURY SPOT DESK 2</option>
  								</select>
  							</div>
  						</div>
  						<div className="row">
  							<div className="col-sm-2 text-right">
  								<label htmlFor="referenceNo"><h5>Reference No.:</h5></label>
  							</div>
  							<div className="col-sm-5">
  								<input type="text" className="form-control" id="referenceNo"/>
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

module.exports = ViewSquaringTransactionsWithTreasury;
