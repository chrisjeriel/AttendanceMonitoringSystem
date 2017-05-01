var React = require('react');
 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var OfficersApproval = require('../Shared OfficersApproval/OfficersApproval');
var API = require('../../../../api');

var BoardRates = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{
				dialog: null,
				mode: null,
				modal: null
			}
		);
	},
  getInitialState: function(){
		return(
			{
        board_rate: null,
        new_buy_rate: '',
        new_sell_rate: '',
        data: {
          trdrFi: '',
  	      currCode: '',
          prchRate: '',
  	      saleRate: '',
          nprchRate: '',
          nsaleRate: ''
        },
        param_data : {
          trdr_fi: '1',
          tran_id: '',
          curr_code: ''
        }
			}
		)
	},
  componentDidMount:function(){
      this.loadData();
  },
  loadData:function(){
    console.log(this.state.data);
    API.maintenance_exchangerate.board_rates_get(
        this.state.param_data,
        function(data)
        {
            console.log("CHANEL");
            console.log(data);
            console.log("CHANEL");
            if(data.meta.code == 200 || data.meta.code == 0)
            {
                   this.setState({board_rate: data.data});
            }
        }.bind(this),
        function(data){

        }.bind(this)
    );
  },

  showApprovalModal: function (mode) {
      var state = {   mode: mode,
                      modal: <OfficersApproval processName={"new reference rate"} process={this.Process} closeModal={this.closeModal} />
                  };
      this.setState(state);
  },
  closeModal: function () {
      this.setState({mode: null});
  },
  updateBuyRate: function(e){
      var val = e.target.value;
      if (val.length <=9)
      {
        this.setState({new_buy_rate: val})
      }
  },
  updateSellRate: function(e){
      var val = e.target.value;
      if (val.length <=9)
      {
        this.setState({new_sell_rate: val})
      }
  },
  closeDialogBox: function () {
      this.setState({dialog: null});
  },
	process: function () {
    var trdrFi = this.state.board_rate // having problems with calling backend. new to fix this after figured out how to properly call on backend"
    var currCode = this.state.board_rate
    var prchRate = this.state.board_rate
    var saleRate = this.state.board_rate
    var nprchRate= this.state.new_buy_rate;
    var nsaleRate= this.state.new_sell_rate;

    if(nprchRate!="" && nprchRate.length == 9 && nsaleRate!="" && nsaleRate.length == 9)
    {
        this.setState({
            data:
              {
                trdrFi: trdrFi,
        	      currCode: currCode,
                prchRate: prchRate,
        	      saleRate: saleRate,
                nprchRate: nprchRate,
                nsaleRate: nsaleRate
              }
        });

        console.log(this.state.data);

        API.maintenance_exchangerate.board_rates_process(
            this.state.data,
            function(data){
                console.log('Process Success');
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.setState({
                        dialog: <SystemResponse
                                    title="Successfully Processed"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox}  />
                    });
                }else{
                    this.setState({
                        dialog: <SystemResponse
                                    title="Process Error"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox} />
                    });
                }
            }.bind(this),
            function(data){
                console.log('Process Fail');
                console.log(data);
                this.setState({
                    dialog: <SystemResponse
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
            }.bind(this)
        );
    }else{
        this.setState({
            dialog: <SystemResponse title="Error" content="Input Incomplete" close={this.closeDialogBox} />
        });
    }

	},
	processSuccess: function (data) {
		this.setState({
            dialog: <SystemResponse title="System Response" content="Process successful"  close={this.closeDialogBox} />
        });
	},
  showApprovalModal: function (mode) {
      var state = {   mode: mode,
                      modal: <OfficersApproval processName={mode} process={this.process} closeModal={this.closeModal} />
                  };
      this.setState(state);
  },
  closeModal: function () {
      this.setState({mode: null});
  },
	close:function(){
		this.context.router.push('menu');
	},
  closeDialogBox: function () {
      this.setState({dialog: null});
  },
	render:function(){
		return(
			<div className='app-border'>
                {
                    this.state.mode ?
                        this.state.modal
                        : ''
                }
				<AppHeader>
					<AppHeaderTitle>
						<h5>
							Update USD-PHP Rates
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-6 col-sm-push-3 app-body-inner'>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>RATE</label>
							</div>
							<div className="col-sm-5 text-center">
								<label>Current</label>
							</div>
							<div className="col-sm-5 text-center">
								<label>New</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>Buying</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" disabled />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" onChange={this.updateBuyRate} value={this.state.new_buy_rate}/>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2 text-right">
								<label>Selling</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" disabled />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" onChange={this.updateSellRate} value={this.state.new_sell_rate}/>
							</div>
						</div>
						<br />
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process'
							whenClicked={this.showApprovalModal.bind(this, 'new USD-PHP Reference Rate')} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.close} />
				</ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
	            {
	              this.state.mode ?
	                <div className='overlay'></div>
	                :''
	            }
			</div>
			);
	}

});

module.exports = BoardRates;
