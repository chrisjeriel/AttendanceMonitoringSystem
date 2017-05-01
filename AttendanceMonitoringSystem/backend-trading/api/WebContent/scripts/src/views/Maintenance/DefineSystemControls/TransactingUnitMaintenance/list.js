var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var THcomponent = require('../../../../components/THcomponent');
var TDcomponent = require('../../../../components/TDcomponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var TableComponent = require('../../../../components/TableComponent');
var SystemResponse = require('../../../../components/SystemResponse');
var Process = require('./process');

var TransactingUnitMaintenanceList = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	propTypes: {
		data: React.PropTypes.array
	},
	getInitialState: function(){
		return ({
			data: this.props.data
		});
	},
	componentDidMount:function(){
		// this.loadData();
	},

	loadData:function(){

		API.transacting_unit_maintenance.getList()
			.done(this.processSuccess)
			.fail(this.processFail);

	},

	processSuccess: function (res) {
		//need to connect this to table
	},

	processFail: function (xhr, err) {
		alert('Err: ' + err);
	},
	closeProcessModal: function(){
		this.setState({process_mode: null});
	},

	showProcessModal:function(data){
		this.setState({   
          process_mode: 'details',
          process_modal: 
          <div>
            <Process mode="details" data={data} close={this.closeProcessModal}/>
            <div className="overlay"></div>
          </div>    
        });
	},
	Details:function(event){
        var tranCode = $('tr.selected').find('td:nth-child(1)').text();

		console.log("tranCode: " + tranCode);

        API.maintenance_defsyscontrols.transacting_unit_get(
            {
                tran_fi: tranCode
            },
            function(data){
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.showProcessModal(data.data[0]);
                }else{
                this.setState({
                        process_mode: 'details',
                        process_modal: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeProcessModal} />
                    });
                }
            }.bind(this),
            function(data){
                this.setState({   
                    process_mode: 'details',
                    process_modal: 
                        <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
                });
            }.bind(this)
        );
	},
	render:function(){
		return(
			<div>
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View List of Transacting Units</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					{/*<Table>
          					<thead>
          						<tr>
          							<THcomponent TitleClass='' TableTitle='Trading Unit Code' />
          							<THcomponent TitleClass='' TableTitle='Description'/>
          							<THcomponent TitleClass='' TableTitle='Trading Unit Tag' />
          						</tr>
          					</thead>
          					<tbody>
          						<tr>
          							<TDcomponent ContentClass='' TableContent='BD'/>
          							<TDcomponent ContentClass='' TableContent='BPI DIRECT SAVING BANK'/>
          							<TDcomponent ContentClass='' TableContent='NO' />
          						</tr>
          					</tbody>
          			</Table>*/}

					<TableComponent
                                checkBox={false}
                                column={["Trading Unit Code", "Description", "Trading Unit Tag"]}
                                data={this.state.data}
                                visible={7}
                                ref="table"
                                onSelect={this.Details}
                                 />
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Top' whenClicked={this.Top} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Next' whenClicked={this.Next} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Bottom' whenClicked={this.Bottom} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Details' whenClicked={this.Details} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.close}  />
					</div>
				</ViewFooter>
			</div>
			{
				this.state.process_mode != null ?
					this.state.process_modal
					: null
			}
			</div>
			);
	}

});


module.exports = TransactingUnitMaintenanceList;
