var React = require('react');
var Link = require('react-router').Link;
var ButtonComponent = require('../../../components/ButtonComponent');
var ViewFooter = require('../../../components/ViewFooter');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');
 var AppBody = require('../../../components/AppBody');
var Auth = require('../../../auth/Auth');
var Table = require('../../../components/TableComponent');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');



var Loa = React.createClass({
     contextTypes: {
          router: React.PropTypes.object
     },
	 getInitialState: function(){
         return ({
             dialog_enable: false,
         });
     },
	 processSuccess: function (res) {
         this.setState({
             dialog_enable: true,
             dialog: <ConfirmationPrompt title="Confirmation" content="View Interbank Letter of Authority in Screen" yes={this.closeDialogBox} no={this.closeDialogBox} />
         });
     },
	 closeDialogBox: function () {
         this.setState({dialog_enable: false});
     },
	render:function(){
		return(
			<div className='app-border process_modal'>
				<AppBody>
					<Table>
          					<thead>
          						<tr>
          							<THcomponent TitleClass='' TableTitle='LOA#' />
          							<THcomponent TitleClass='' TableTitle='Client Name'/>
          							<THcomponent TitleClass='' TableTitle='Transaction Amount'/>
          							<THcomponent TitleClass='' TableTitle='Value Date'/>
          							<THcomponent TitleClass='' TableTitle='Purchase Above Limit'/>
          							<THcomponent TitleClass='' TableTitle='Set Above Limit'/>
          						</tr>
          					</thead>
          					<tbody>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='AUD'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='3,500.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          						</tr>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='AUD'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='3,500.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          						</tr>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='AUD'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='150.00'/>
          							<TDcomponent ContentClass='' TableContent='3,500.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          							<TDcomponent ContentClass='' TableContent='1,000.00'/>
          						</tr>
          					</tbody>
          			</Table>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Prev" whenClicked={this.Prev} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next Batch" whenClicked={this.NextBatch} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Print" whenClicked={this.processSuccess} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.props.close} />
				</ViewFooter>
				{
					this.state.dialog_enable ?
						this.state.dialog
						: ''
				}
			</div>
			);
	}

});

var LoaProcess = React.createClass({

     render:function(){
          return(
               <div className='app-border'>
                    <AppHeader>
                         <AppHeaderTitle>
                              <h5>Interbank Loa Report</h5>
                         </AppHeaderTitle>
                    </AppHeader>
                    <AppBody>
                              <div className='col-sm-12 app-body-inner'>
                                   <form className='form-group no-border-content'>
                                        <div className='row app-body-content'>
                                             <div className='row'>
                                                  <div className='col-xs-12 col-sm-6 col-sm-offset-3'>
                                                       <div className='col-xs-5'>
                                                            <label>Transaction Type:</label>
                                                            </div>
                                                        <div className='col-xs-7 radio'>
                                                            <label className='radio-inline'><input className="" type="radio" name='transaction' />Purchase</label>
                                                            <label className='radio-inline'><input className="" type="radio" name='transaction'  />Sale</label>
                                                        </div>
                                                  </div>
                                             </div>
                                             <div className='row'>
                                                  <div className='col-xs-12 col-sm-6 col-sm-offset-3'>
                                                       <div className='col-xs-4'>
                                                            <label>LOA Type:</label>
                                                       </div>
                                                        <div className='col-xs-8 radio'>
                                                            <div className='radio'>
                                                                 <label><input className="" type="radio" name='LoaType' />
                                                                 New LOA</label>
                                                            </div>
                                                            <div className='radio'>
                                                                 <label><input className="" type="radio" name='LoaType' />
                                                                 Printed LOA</label>
                                                            </div>
                                                        </div>
                                                  </div>
                                             </div>
                                        </div>
                                   </form>
                              </div>
                    </AppBody>
                    <ViewFooter>
                         <ButtonComponent  ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
                         <ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
                    </ViewFooter>
               </div>
               );
     }

});

module.exports = Loa;
