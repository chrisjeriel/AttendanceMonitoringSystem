var React = require('react');
var Link = require('react-router').Link;
var ButtonComponent = require('../../../components/ButtonComponent');
var ViewFooter = require('../../../components/ViewFooter');
var THcomponent = require('../../../components/THcomponent');
var TDcomponent = require('../../../components/TDcomponent');
var AppBody = require('../../../components/AppBody');
var AppHeader = require('../../../components/AppHeader');
var Auth = require('../../../auth/Auth');
var Table = require('../../../components/TableComponent');


var ErrorCorrect = React.createClass({
     contextTypes: {
          router: React.PropTypes.object
     },
	render:function(){
		return(
			<div className='app-border  process_modal'>
				<AppHeader/>
				<AppBody>
					<Table>
          					<thead>
          						<tr>
          							<THcomponent TitleClass='' TableTitle='Ref Number' />
          							<THcomponent TitleClass='' TableTitle='Counter Party'/>
          							<THcomponent TitleClass='' TableTitle='Contact Person'/>
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
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.props.details} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.props.close} />
				</ViewFooter>
			</div>
			);
	}

});

var ErrorCorrectProcess = React.createClass({

     render:function(){
          return(
               <div className='app-border'>
                    <AppHeader>
                         <AppHeaderTitle>
                              <h5>Interbank Error Correct</h5>
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
                                                        <div className='col-xs-7'>
                                                            <label className='radio-inline'><input className="" type="radio" name='transaction' />Purchase</label>
                                                            <label className='radio-inline'><input className="" type="radio" name='transaction'  />Sale</label>
                                                        </div>
                                                  </div>
                                             </div>
                                             <div className='row'>
                                                  <div className='col-xs-12 col-sm-6 col-sm-offset-3'>
                                                       <div className='col-xs-5'>
                                                            <label>Reference Number:</label>
                                                            </div>
                                                        <div className='col-xs-7'>
                                                            <input className='form-control' type='text' />
                                                        </div>
                                                  </div>
                                             </div>
                                        </div>
                                   </form>
                              </div>
                    </AppBody>
                    <ViewFooter>
                         <ButtonComponent ButtonClass='btn btn-default' ButtonName="Process" whenClicked={this.Process} />
                         <ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.Close} />
                    </ViewFooter>
               </div>
               );
     }

});

module.exports = ErrorCorrect;
