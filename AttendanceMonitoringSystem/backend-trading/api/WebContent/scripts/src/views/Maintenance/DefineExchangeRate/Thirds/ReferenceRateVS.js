var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var TableComponent = require('../../../../components/TableComponent');
var API = require('../../../../api');

var ReferenceRateVS = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				currCode: this.props.params.currCode,
				dialog: null
			}
		);
	},
	Process: function (res) {
		this.setState({
            dialog: <SystemResponse title="System Response" content="Process successful" close={this.closeDialogBox} />
        });
	},
	Close:function(){
		this.context.router.push('menu');
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    componentDidMount: function() {
		API.maintenance_exchangerate.ref_rate_usd(
            {
            	trdr_fi : "2"
            },
            function(data){
                if(data.meta.code == 200 || data.meta.code == 0){
                	var procData = [];
                	data.data.map(function(item, index) {
                		procData.push({"CURR_CODE" : item.CURR_CODE,"CURR_REF" : item.REFR_RATE,"NEW_REF" : item.REFR_RATE});
                	})
                    this.setState({ 	
                    	data: procData
					});
                }
            }.bind(this),
            function(data){
                this.setState({   
                    process_mode: 'list',
                    process_modal: 
                        <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
                });
            }.bind(this)
       	);

		
    },
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader formCode="FXFRMEXRT02" form={this.state.currCode == 'usd' ? 'Form1' : 'Form2'}>
					<AppHeaderTitle>
						<h5>
							Reference Rate for Thirds vs <span className="text-uppercase">{this.state.currCode}</span>
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					{ this.state.data ?
						<TableComponent
	                                checkBox={false}
	                                chkBox={true}
	                                column={["Currency", "Current", "New", "   "]}
	                                data={this.state.data}
	                                visible={7}
	                                ref="table"
	                                 />
	                    :
	                    ''
					}
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Accept' whenClicked={this.Process} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
                {
	                this.state.process_mode != null ?
	                    this.state.process_modal
	                    : ''
	            }
			</div>
			);
	}

});

module.exports = ReferenceRateVS;