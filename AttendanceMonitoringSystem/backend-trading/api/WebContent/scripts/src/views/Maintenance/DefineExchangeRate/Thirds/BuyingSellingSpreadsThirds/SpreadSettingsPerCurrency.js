var React = require('react');
var Link = require('react-router').Link;

var ButtonComponent = require('../../../../../components/ButtonComponent');
var ViewFooter = require('../../../../../components/ViewFooter');
var THcomponent = require('../../../../../components/THcomponent');
var TDcomponent = require('../../../../../components/TDcomponent');
var AppBody = require('../../../../../components/AppBody');
var AppHeader = require('../../../../../components/AppHeader');
var Auth = require('../../../../../auth/Auth');


var SpreadSettingsPerCurrency = React.createClass({
  contextTypes: {
    router: React.PropTypes.object
  },
	getInitialState: function(){
		return(
			{
				ssType: this.props.params.ssType
			}
		)
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({ssType: nextProps.params.ssType});
		}
	},
	resetState: function(){
		this.setState({
			ssType: null
		});
	},
  render:function(){
		return(
      <div className='app-border'>
        <AppHeader formCode="FXFRMEXRT03" form="Form1">
        </AppHeader>
        <div className='row no-border-bottom'>
          <div className='col-xs-12 Page-Header-Menu'>
              <div className='col-xs-6'>
                <div className='col-xs-4 col-xs-offset-8 border-line-w-padding'>
                  <h5><strong>Update spreads</strong></h5>
                  <label className='radio-inline'><input type='radio' name='UpdateSpreads' />All Currencies</label>
                  <br/>
                  <label className='radio-inline'><input type='radio' name='UpdateSpreads' />Per Currency</label>
                </div>
              </div>
              <div className='col-xs-6 align-left'>
                <div className='col-xs-7 border-line-w-padding display-inline'>
                  <div className="row">
                    <div className="col-xs-5 align-right">
                      <h6><strong>Buying Spread</strong></h6>
                    </div>
                    <div className="col-xs-5">
                      <input type='text'/>
                    </div>
                  </div>
                  <div className="row">
                    <div className="col-xs-5 align-right">
                      <h6><strong>Selling Spread</strong></h6>
                    </div>
                    <div className="col-xs-5">
                      <input type='text'/>
                    </div>
                  </div>
                </div>
              </div>
          </div>
        </div>
  			<AppBody>
  				<div className='col-sm-12 app-body-inner'>
  					<table className="full-width">
              <thead>
                <tr>
                  <th colSpan="1"></th>
                  <th className="align-center" colSpan="4">C U R R E N T</th>
                  <th className="align-center" colSpan="4">N E W</th>
                  <th colSpan="1"></th>
                </tr>
              </thead>
    					<thead>
    						<tr>
    							<th>Currency</th>
    							<th>Type</th>
    							<th>Notes Buying</th>
    							<th>FCDU Buying</th>
    							<th>FCDU Selling</th>
                  <th>Type</th>
                  <th>Notes Buying</th>
                  <th>FCDU Buying</th>
                  <th>FCDU Selling</th>
                  <th></th>
    						</tr>
    					</thead>
    					<tbody>
    						<tr>
    							<td>A</td>
    							<td>A</td>
    							<td>A</td>
    							<td>A</td>
                  <td>A</td>
                  <td>A</td>
                  <td>A</td>
                  <td>A</td>
                  <td>A</td>
                  <td><input type="checkbox" /></td>
    						</tr>
    					</tbody>
    				</table>
  				</div>
  			</AppBody>
				<ViewFooter>
          <div className='row padding-ref-no'>
            <div className='col-xs-5 border-line align-center'>
                <ButtonComponent ButtonName="Top" ButtonClass="btn btn-default" whenClicked={this.Top} />&nbsp;
                <ButtonComponent ButtonName="Next" ButtonClass="btn btn-default" whenClicked={this.Next} />&nbsp;
                <ButtonComponent ButtonName="Bottom" ButtonClass="btn btn-default" whenClicked={this.Bottom} />&nbsp;
                <ButtonComponent ButtonName="Process" ButtonClass="btn btn-default" whenClicked={this.Process} />&nbsp;
                <ButtonComponent ButtonName="Details" ButtonClass="btn btn-default" whenClicked={this.Details} />&nbsp;
                <ButtonComponent ButtonName="Close" ButtonClass="btn btn-default" whenClicked={this.Close} />
            </div>
          </div>
				</ViewFooter>
			</div>
		);
	}
});

module.exports = SpreadSettingsPerCurrency;
