var React = require('react');
var Link = require('react-router').Link;

var ButtonComponent = require('../../../../../components/ButtonComponent');
var ViewFooter = require('../../../../../components/ViewFooter');
var THcomponent = require('../../../../../components/THcomponent');
var TDcomponent = require('../../../../../components/TDcomponent');
var AppBody = require('../../../../../components/AppBody');
var AppHeader = require('../../../../../components/AppHeader');
var Auth = require('../../../../../auth/Auth');


var BuyingSellingRatesForThirds = React.createClass({
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
        <AppHeader formCode="FXFRMEXRT03" form="Form3">
        </AppHeader>
  			<AppBody>
  				<div className='col-sm-12 app-body-inner'>
  					<table className="full-width">
              <thead>
                <tr>
                  <th colSpan="1"></th>
                  <th className="align-center" colSpan="3">3RDS vs PHP</th>
                  <th className="align-center" colSpan="2">3RDS vs USD</th>
                </tr>
              </thead>
              <thead>
                <tr>
                  <th>Currency</th>
                  <th>Notes Buying</th>
                  <th>DD-TT Buying</th>
                  <th>Selling</th>
                  <th>FCDU Buying</th>
                  <th>FCDU Selling</th>
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
                <ButtonComponent ButtonName="Refresh" ButtonClass="btn btn-default" whenClicked={this.Refresh} />&nbsp;
                <ButtonComponent ButtonName="Close" ButtonClass="btn btn-default" whenClicked={this.Close} />
            </div>
          </div>
				</ViewFooter>
			</div>
		);
	}
});

module.exports = BuyingSellingRatesForThirds;
