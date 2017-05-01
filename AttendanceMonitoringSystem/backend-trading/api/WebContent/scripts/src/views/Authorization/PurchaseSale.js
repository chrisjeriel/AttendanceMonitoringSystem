var React = require('react');

var AppBody = require('../../components/AppBody');
var ViewFooter = require('../../components/ViewFooter');
var AppHeader = require('../../components/AppHeader');
var AppHeaderTitle = require('../../components/AppHeaderTitle');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var PurchaseSale = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return(
			{
				inquiryType: this.props.params.inquiryType,
				tranType: null,
				viewOption: null
			}
		)
	},
	componentWillMount: function(){
		switch (this.props.params.tranType) {
			case 'special':
				this.setState({tranType: 'Special Rate'});
				break;
			case 'error':
				this.setState({tranType: 'Error Correct'});
				break;
			case 'override':
				this.setState({tranType: 'Trader Override'});
				break;
		}
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			$('.app-body-inner-content input[type=radio]').prop('checked', false);
			this.resetState();
			this.setState({inquiryType: nextProps.params.inquiryType});
			switch (nextProps.params.tranType) {
  			case 'special':
  				this.setState({tranType: 'Special Rate'});
  				break;
  			case 'error':
  				this.setState({tranType: 'Error Correct'});
  				break;
  			case 'override':
  				this.setState({tranType: 'Trader Override'});
  				break;
			}
		}
	},
	resetState: function(){
		this.setState({
			inquiryType: null,
			tranType: null,
			viewOption: null
		});
	},
	radioCheck: function(e){
		var opt = $(e.target).val();

		this.setState({viewOption: opt});
	},
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							{this.state.inquiryType =='purchase' ? 'PURCHASE' : 'SALE'} {this.state.tranType} Authorization<br/>
							BPI FOREX COPR.
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-12 app-body-inner'>
            <div className="app-body-inner-content">
  						<div className="row">
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
    								<input type="radio" onChange={this.radioCheck} value="all" name="specialRateRadio"/> All Transactions
                  </label>
  							</div>
  							<div className="col-sm-3">
                  <label className="checkbox-inline">
    								<input type="radio" onChange={this.radioCheck} value="reference" name="specialRateRadio"/> Per Reference No.
                  </label>
  							</div>
  						</div>
  						<div className="row">
                <div className="col-sm-5">
                  <div className="form-inline">
                    <div className="form-group">
                      <label htmlFor="referenceNo"><h5>Reference No.</h5></label>
        							<input type="text" className="form-control" disabled={this.state.viewOption=='all' ? "disabled" : ""} id="referenceNo" value=""/>
                    </div>
                  </div>
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

module.exports = PurchaseSale;
