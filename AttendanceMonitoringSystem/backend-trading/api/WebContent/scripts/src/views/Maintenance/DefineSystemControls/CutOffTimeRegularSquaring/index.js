var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var ViewFooter = require('../../../../components/ViewFooter');
var Table = require('../../../../components/TableComponent');
var AppBody = require('../../../../components/AppBody');
var Auth = require('../../../../auth/Auth');
var API = require('../../../../api');
var TableComponent = require('../../../../components/TableComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var CutOffTimeRegularSquaringModify = require('./modify');

var CutOffTimeRegularSquaring = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},

	getInitialState: function () {
		return (
			{	
				mode: this.props.params.mode,
				dialog: null,
				modal: null,
				output: null,
                selected: 0,
                data: null, 
                output: null
			}
		);
	},
	componentDidMount: function() {
		this.loadData();	
	},
	componentWillMount: function(){
		this.setState({mode: this.props.params.mode});
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.setState({mode: this.props.params.mode});
		}
	},
	
	loadData: function () {
		var data = {};

		API.sys_ref.getByCode ("0131", function (res) {
			var trdrTable = res.data;

			console.log("load reference table sucess");
			API.maintenance_defsyscontrols.cutoff_squaring_list(null,
				function (res) {
					var data = res.data;
					console.log("load list success");

					var output = [];

					for (var x = 0; x < data.length; x++) {
						var time = Number(data[x].SCUT_TIME);
						var trdrFi = data[x].TRDR_FI;

						var period = " A.M.";
						if (time >= 1300) {
							time = time - 1200;
							period = " P.M.";
						} 
						time = ("0000" + time.toString()).slice(-4);
						time = time.slice(0, 2) + ":" + time.slice(-2) + period;

						var desc = "NO DESCRIPTION AVAILABLE - " + trdrFi;	
						for (var y = 0; y < trdrTable.length; y++) {
							if (trdrTable[y].trdrFi === trdrFi) {
								desc = trdrTable[y].trdrDesc;
								break;
							}
						}

						data[x] = {TRDR_FI: trdrFi, SCUT_TIME: data[x].SCUT_TIME, TRDR_DESC: desc};

						output.push ({Col1: desc, Col2: time});
					}
					this.setState({data: data, output: output});

				}.bind(this),
				function (res) {
	                this.setState({
	                    dialog: <SystemResponse 
	                                title="Error"
	                                content="Cannot connect to middleware"
	                                close={this.closeDialogBox} />
	                });
				}.bind(this));


			}.bind(this),
			function (res) {
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			}.bind(this));

	}, 
	showModifyModal: function() {
		var mode = this.state.mode;
		console.log(mode);
		if (mode == "update") {
			this.setState ({ modal: <CutOffTimeRegularSquaringModify data={this.state.data[this.state.selected]} CloseAndUpdate={this.closeAndUpdateModal} Close={this.closeModal} /> });
		}
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    closeModal: function () {
        this.setState({modal: null});
    },
    Refresh: function () {
    	location.reload();
    },
    closeAndUpdateModal: function () {
    	console.log("this");
        this.setState({modal: null});
		this.Refresh();
    },
	Close:function(){
		this.context.router.push('menu');
	},
	updateSelected: function () {
		var selected = $('tr.selected').index();

		this.setState({selected: selected});
		console.log(this.state.selected);
	},
	render:function(){
		return(
			<div className='app-border'>
                {
                    this.state.modal ?
                        this.state.modal
                        : ''
                }
				<AppHeader>
					<AppHeaderTitle>
						<h5><span className="text-capitalize">{this.state.mode}</span> Cut-Off Time per Trading Unit for Regular Squaring</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					{ this.state.output != null ? 
						<TableComponent
	                                checkBox={false}
	                                column={["Trading Unit", "Cut-Off Time"]}
	                                data={this.state.output}
	                                visible={10}
	                                ref="table"
	                                onMove={this.updateSelected}

	                                 /> : null
						
					}
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Top' />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Next' />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Bottom'  />
					<ButtonComponent ButtonClass='btn btn-default disabled' ButtonName='Add' disabled="true" />
					<ButtonComponent ButtonClass={'btn btn-default ' + (this.state.mode !== "update" ? 'disabled' : '')} ButtonName='Modify' disabled={this.state.mode !== "update"} whenClicked={this.showModifyModal} />
					<ButtonComponent ButtonClass='btn btn-default disabled' ButtonName='Delete' disabled="true" />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Refresh' whenClicked={this.Refresh} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close'  />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
	            {
	              this.state.modal ?
	                <div className='overlay'></div>
	                :''
	            }
			</div>
			);
	}

});

module.exports = CutOffTimeRegularSquaring;