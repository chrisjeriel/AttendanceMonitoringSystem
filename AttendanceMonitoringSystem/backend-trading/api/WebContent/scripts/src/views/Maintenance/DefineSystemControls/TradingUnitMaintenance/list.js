'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var THcomponent = require('../../../../components/THcomponent');
var TDcomponent = require('../../../../components/TDcomponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var SystemResponse = require('../../../../components/SystemResponse');
var Process = require('./process');
var AppConstants = require('../../../../AppConstants');
var TableComponent = require('../../../../components/TableComponent');

var TradingUnitMaintenanceList = React.createClass({
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
    componentWillUnmount: function () {

    },
    Details: function(){
        var tradeCode = $('tr.selected').find('td:nth-child(4)').text();

        console.log("tradeCode: " + tradeCode);

        API.maintenance_defsyscontrols.trading_unit_get(
            {
                trdr_fi: tradeCode
            },
            function(data){
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.showProcessModal(data.data[0]);
                }else{
                this.setState({
                        process_mode: 'details',
                        process_modal: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.CloseProcessModal} />
                    });
                }
            }.bind(this),
            function(data){
                this.setState({   
                    process_mode: 'details',
                    process_modal: 
                        <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.CloseProcessModal}/>
                });
            }.bind(this)
        );
    },
	showProcessModal:function(data){
		this.setState({   
          process_mode: 'details',
          process_modal: 
          <div>
            <Process mode="details" data={data} close={this.CloseProcessModal}/>
            <div className="overlay"></div>
          </div>    
        });
	},
	Close:function(){
		// this.context.router.push('menu/trading_maintenance_menu');
	},
	CloseProcessModal: function(){
		this.setState({process_modal: null});
	},
	render:function(){
		return(
            <div>
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>View List of Trading Units</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<TableComponent
                                checkBox={false}
                                column={["Description", "Office Code", "Transacting Unit Code", "Trading Unit Code", "Force Unload"]}
                                data={this.state.data}
                                visible={7}
                                ref="table"
                                onSelect={this.Details}
                                 />
				</AppBody>
				<ViewFooter>
					<div className='row'>
						<ButtonComponent ButtonName='Top' ButtonClass='btn btn-default' whenClicked={this.Top} />
						<ButtonComponent ButtonName='Next' ButtonClass='btn btn-default' whenClicked={this.Next}  />
						<ButtonComponent ButtonName='Bottom' ButtonClass='btn btn-default' whenClicked={this.Bottom} />
						<ButtonComponent ButtonName='Details' ButtonClass='btn btn-default' whenClicked={this.Details} />
						<ButtonComponent ButtonName='Close' ButtonClass='btn btn-default' whenClicked={this.props.close} />
					</div>
				</ViewFooter>
			</div>
            {
                this.state.process_mode != null ?
                    this.state.process_modal
                    : ''
            }
            </div>
			);
	}

});

module.exports = TradingUnitMaintenanceList;