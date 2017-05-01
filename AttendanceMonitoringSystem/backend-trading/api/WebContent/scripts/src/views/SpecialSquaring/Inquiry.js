var React = require('react');
var Link = require('react-router').Link;

var ButtonComponent = require('../../components/ButtonComponent');
var ViewFooter = require('../../components/ViewFooter');
var THcomponent = require('../../components/THcomponent');
var TDcomponent = require('../../components/TDcomponent');
var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var Auth = require('../../auth/Auth');


var Inquiry = React.createClass({
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
        <AppHeader formCode="FXFRMBTSUIN" form="Form1">
        </AppHeader>
        <div className='row no-border-bottom'>
          <div className='col-xs-12 Page-Header-Menu'>
            <div className='col-xs-5'>
              <div className='col-xs-4'>
                <h5><strong>Deal With:</strong></h5>
              </div>
              <div className='col-xs-8 border-line-w-padding'>
                <label className='radio-inline'><input type='radio' name='DealWith' />Spot Desk1</label>
                <label className='radio-inline'><input type='radio' name='DealWith' />Spot Desk2</label>
              </div>
            </div>
            <div className='col-xs-5'>
              <div className='col-xs-6'>
                <h5><strong>Transaction Type:</strong></h5>
              </div>
              <div className='col-xs-6 border-line-w-padding'>
                <label className='radio-inline'><input type='radio' name='DealWith' />Purchase</label>
                <label className='radio-inline'><input type='radio' name='DealWith' />Sale</label>
              </div>
            </div>
            <div className='col-xs-2 align-right'>
              <ButtonComponent ButtonName='Inquire' ButtonClass="btn btn-default" whenClicked={this.InquireButton} />
            </div>
        </div>
      </div>
			<AppBody>
				<div className='col-sm-12 app-body-inner search-table-outter'>
					<table className="search-table inner">
  					<thead>
  						<tr>
  							<THcomponent TitleClass='' TableTitle='Reference No.' />
  							<THcomponent TitleClass='' TableTitle='Stat'/>
  							<THcomponent TitleClass='' TableTitle='Bank'/>
  							<THcomponent TitleClass='' TableTitle='Book'/>
  							<THcomponent TitleClass='' TableTitle='Curr From'/>
  							<THcomponent TitleClass='' TableTitle='Curr To'/>
                <THcomponent TitleClass='' TableTitle='Transaction Amount'/>
                <THcomponent TitleClass='' TableTitle='Grant Rate'/>
                <THcomponent TitleClass='' TableTitle='Equivalent Amount'/>
  						</tr>
  					</thead>
  					<tbody>
  						<tr>
  							<TDcomponent ContentClass='' TableContent='A'/>
  							<TDcomponent ContentClass='' TableContent='A'/>
  							<TDcomponent ContentClass='' TableContent='A'/>
  							<TDcomponent ContentClass='' TableContent='A'/>
                <TDcomponent ContentClass='' TableContent='A'/>
                <TDcomponent ContentClass='' TableContent='A'/>
                <TDcomponent ContentClass='' TableContent='A'/>
                <TDcomponent ContentClass='' TableContent='A'/>
                <TDcomponent ContentClass='' TableContent='A'/>
  						</tr>
  					</tbody>
  				</table>
				</div>
			</AppBody>
				<ViewFooter>
          <div className='row'>
            <div className='col-xs-9 border-line'>
              <div className='col-xs-2 align-left'>
                <ButtonComponent ButtonName="NEW INQUIRY" ButtonClass="btn btn-default" whenClicked={this.NewInquiry} />
              </div>
              <div className='col-xs-5 align-center'>
                <ButtonComponent ButtonName="Top" ButtonClass="btn btn-default" whenClicked={this.Top} />&nbsp;
                <ButtonComponent ButtonName="Prev" ButtonClass="btn btn-default" whenClicked={this.Prev} />&nbsp;
                <ButtonComponent ButtonName="Next" ButtonClass="btn btn-default" whenClicked={this.Next} />&nbsp;
                <ButtonComponent ButtonName="Bottom" ButtonClass="btn btn-default" whenClicked={this.Bottom} />
              </div>
              <div className='col-xs-5 align-right'>
                <ButtonComponent ButtonName="Next Batch" ButtonClass="btn btn-default" whenClicked={this.NextBatch} />&nbsp;
                <ButtonComponent ButtonName="Details" ButtonClass="btn btn-default" whenClicked={this.Details} />&nbsp;
                <Link to='/'><ButtonComponent ButtonName="Close" ButtonClass="btn btn-default" whenClicked={this.Close} /></Link>
              </div>
            </div>
            <div className='col-xs-3'>
              <div className='row'>
                <div className="col-xs-12">
                  <label className='checkbox-inline'>
                    <input type='checkbox' /> Automatic Refresh
                  </label>
                </div>
              </div>
              <div className='row'>
                <div className="col-xs-4">
                  <h7><strong>Refresh Time:</strong></h7>
                </div>
                <div className="col-xs-4">
                  <label>
                    <select className='form-control'>
                      <option>99</option>
                    </select>
                  </label>
                </div>
                <div className="col-xs-4">
                  <h7><strong>Minute(s)</strong></h7>
                </div>
              </div>
            </div>
          </div>
				</ViewFooter>
			</div>
		);
	}
});

// var TreasuryWithApproval = React.createClass({
//      render:function(){
//           return(
//           <div className='app-border'>
//                <div className='row no-border-bottom'>
//                     <div className='col-xs-4'>
//                          <h3>INQUIRY OPTIONS</h3>
//                     </div>
//                     <div className='col-xs-8'>
//                          <AppHeader>
//                               <AppHeaderTitle>
//                                   <h5>Inquiry on BTSU Transactions with Treasury (for Approval)</h5>
//                               </AppHeaderTitle>
//                           </AppHeader>
//                     </div>
//                     <div className='col-xs-12 Page-Header-Menu'>
//                          <div className='col-xs-5'>
//                               <div className='col-xs-4'>
//                                    <label>Deal With:</label>
//                               </div>
//                               <div className='col-xs-8'>
//                                    <label className='radio-inline'><input type='radio' name='DealWith' />Spot Desk1</label>
//                                    <label className='radio-inline'><input type='radio' name='DealWith' />Spot Desk2</label>
//                               </div>
//                          </div>
//                          <div className='col-xs-5'>
//                               <div className='col-xs-6'>
//                                    <label>Transaction Type:</label>
//                               </div>
//                               <div className='col-xs-6'>
//                                    <label className='radio-inline'><input type='radio' name='DealWith' />Purchase</label>
//                                    <label className='radio-inline'><input type='radio' name='DealWith' />Sale</label>
//                               </div>
//                          </div>
//                          <div className='col-xs-2'>
//                               <ButtonComponent myText='Inquire' whenClicked={this.InquireButton} />
//                          </div>
//                     </div>
//                </div>
//                     <AppBody>
//                          <div className='col-sm-12 app-body-inner search-table-outter'>
//                               <table className="search-table inner">
//                                    <thead>
//                                         <tr>
//                                              <THcomponent TitleClass='' TableTitle='Ref Number' />
//                                              <THcomponent TitleClass='' TableTitle='Counter Party'/>
//                                              <THcomponent TitleClass='' TableTitle='Contact Person'/>
//                                              <THcomponent TitleClass='' TableTitle='Value Date'/>
//                                              <THcomponent TitleClass='' TableTitle='Purchase Above Limit'/>
//                                              <THcomponent TitleClass='' TableTitle='Set Above Limit'/>
//                                         </tr>
//                                    </thead>
//                                    <tbody>
//                                         <tr>
//                                              <TDcomponent ContentClass='' TableContent='AUD'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='3,500.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                         </tr>
//                                         <tr>
//                                              <TDcomponent ContentClass='' TableContent='AUD'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='3,500.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                         </tr>
//                                         <tr>
//                                              <TDcomponent ContentClass='' TableContent='AUD'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='150.00'/>
//                                              <TDcomponent ContentClass='' TableContent='3,500.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                              <TDcomponent ContentClass='' TableContent='1,000.00'/>
//                                         </tr>
//                                    </tbody>
//                               </table>
//                          </div>
//                     </AppBody>
//                     <ViewFooter>
//                       <div className='row'>
//                          <div className='col-xs-9'>
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="New Inquiry" whenClicked={this.NewInquiry} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Prev" whenClicked={this.Prev} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Next Batch" whenClicked={this.NextBatch} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.Details} />
//                               <ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
//                          </div>
//                          <div className='col-xs-3'>
//                               <div className='row'>
//                                    <label className='checkbox-inline'>
//                                         <input type='checkbox' />
//                                              Automatic Refresh
//                                    </label>
//                               </div>
//                               <div className='row'>
//                                    <label>Refresh Time:<input className='width-20' min='1' max='99' type='number'/>Minute(s)</label>
//                               </div>
//                          </div>
//                       </div>
//                     </ViewFooter>
//                </div>
//                );
//      }
//
// });

module.exports = Inquiry;
