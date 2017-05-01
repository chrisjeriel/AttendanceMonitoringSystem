var React = require('react');

var AppHeader = require('../../../components/AppHeader');
var AppHeaderTitle = require('../../../components/AppHeaderTitle');
 var AppBody = require('../../../components/AppBody');
 var ViewFooter = require('../../../components/ViewFooter');
var ButtonComponent = require('../../../components/ButtonComponent');
var Auth = require('../../../auth/Auth');
var API = require('../../../api');
var SystemResponse = require('../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../components/ConfirmationPrompt');

var BulletinBoard = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				specialMessage: null,
				trdrFi: "2",
				trdrDesc: null
			}
		)
	},
	loadDesc: function () {
		API.sys_ref.getByCode ("0131", function (res) {
			var trdrTable = res.data;
			var trdrFi = this.state.trdrFi;
			console.log("load reference table sucess");
			
			var desc = "NO DESCRIPTION AVAILABLE - " + trdrFi;	
				for (var y = 0; y < trdrTable.length; y++) {
					if (trdrTable[y].trdrFi === trdrFi) {
						desc = trdrTable[y].trdrDesc;
						break;
					}
				}

            this.setState({
                trdrDesc: desc 
            });

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
	confirmEdit: function () {
       this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content={"No Bulletin Board Message for " + this.state.trdrDesc + ". Would you like to add?"} yes={this.closeDialogBox} no={this.Close} />
        })
	},
	loadData: function () {
		var data = {};
		var that = this;

		API.maintenance_defsyscontrols.bulletin_board_get(this.state.trdrFi,
			function (res) {
				var data = res.data;
				var meta = res.meta;
				console.log("success");

				if (meta.code === 0 && meta.errorMessage === "No data received!") {
					this.confirmEdit();
				} else {
					var specialMessage = "";

					for (var i = 1; i <= 4; i++) {
						specialMessage = specialMessage.concat(data[0]['SPCL_MSG'+i]);
					}

	                this.setState({
	                    specialMessage: specialMessage
	                });
				}	
			}.bind(this),
			function (res) {
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
			}.bind(this))
	}, 
	componentDidMount:function(){
        this.loadDesc();
		this.loadData();
	},
	Process: function (e) {
		this.closeDialogBox;
		e.preventDefault();
		API.maintenance_defsyscontrols.bulletin_board_encode(this.state.trdrFi, this.state.specialMessage)
			.done(this.processSuccess)
			.fail(this.processFail);
	},
	processSuccess: function () {
		this.setState({
            dialog: <SystemResponse title="System Response" content="FFF1VRBL BULLETIN BOARD UPDATED" close={this.closeDialogBox} />
        });
	},
	processFail: function (xhr, err) {
		this.setState({
            dialog: <SystemResponse title="Error" content={err} close={this.closeDialogBox} />
        });
	},
	confirmProcess: function () {
        this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to save changes?" yes={this.Process} no={this.closeDialogBox} />
        })
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	Close:function(){
		this.context.router.push('menu');
	},
    handleChange: function (e) {
    	var name = e.target.name;
    	var val = e.target.value;
    	var obj = {};
    	obj[name] = val;

    	this.setState (obj);
    },
	render:function(){
		return(
			<div className='app-border'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>Bulletin Board Update</h5>
						{this.state.trdrDesc}
					</AppHeaderTitle>
				</AppHeader>
				<AppBody className="text-center">
					<div className="row">
						<div className="col-sm-6 col-sm-push-3">
							<textarea rows="12" cols="70" maxLength='240' onChange={this.handleChange} name="specialMessage" value={this.state.specialMessage}>

							</textarea>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.confirmProcess} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.Close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
			</div>
			);
	}

});

module.exports = BulletinBoard;