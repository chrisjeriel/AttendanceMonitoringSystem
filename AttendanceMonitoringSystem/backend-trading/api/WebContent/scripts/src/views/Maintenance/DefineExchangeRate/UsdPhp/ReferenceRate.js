var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../../components/SystemResponse');
var OfficersApproval = require('../Shared OfficersApproval/OfficersApproval');
var API = require('../../../../api');

var ReferenceRate = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function(){
		return(
			{
				tranType: this.props.params.tranType,
        reference_rate: null,
        ref_rate_value: null,
        newReferenceRateVal: '',
        data: {
          trdrFi: '',
  	      currCode: '',
          refrRate: '',
  	      nefrRate: ''
        },
        trdr_fi : '1'
			}
		)
	},
  componentDidMount:function(){
      this.loadData();
  },
  loadData:function(){
    console.log(this.state.data);
    API.maintenance_exchangerate.reference_rate_view(
        {
          trdr_fi: this.state.trdr_fi
        },
        function(data){
            console.log("CHANEL");
            console.log(data);
            console.log("CHANEL");
        if(data.meta.code == 200 || data.meta.code == 0){
               this.setState({reference_rate: data.data, ref_rate_value: data.data[0].REFR_RATE});
            }
        }.bind(this),
        function(data){

        }.bind(this)
    );
  },
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({tranType: nextProps.params.tranType});
		}
	},
	resetState: function(){
		this.setState({
			tranType: null
		});
	},
  Process:function(){
      var trdrFi = this.state.reference_rate[0].TRDR_FI;
      var currCode = this.state.reference_rate[0].CURR_CODE;
      var refrRate = this.state.reference_rate[0].REFR_RATE;
      var nefrRate = this.state.newReferenceRateVal;

      if( nefrRate!="" && nefrRate.length == 9)
      {
          this.setState({
              data: {
                  trdrFi: trdrFi,
                  currCode: currCode,
                  refrRate: refrRate,
                  nefrRate: nefrRate
                  },
              dialog: <ConfirmationPrompt
                  title="Process"
                  content={"Proceed to Officer Authorization?"}
                  yes={this.ConfirmYes}
                  no={this.ConfirmNo}
                   />
          });
      }else{
          this.setState({
              dialog: <SystemResponse title="Error" content="Input Incomplete" close={this.closeDialogBox} />
          });
      }
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
  ConfirmYes: function(){
      console.log(this.state.data);

      API.maintenance_exchangerate.reference_rate_update(
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
                                  title="Add Error"
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
  },
  ConfirmNo: function(){
      this.closeDialogBox();
      console.log("User changed mind");
  },
  updateNewReferenceRate: function(e){
      var val = e.target.value;
      if (val.length <=9)
      {
        this.setState({newReferenceRateVal: val})
      }

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
							<span className="text-capitalize">{this.state.tranType}</span> USD Reference Rate for PHP
						</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
					<div className='col-sm-6 col-sm-push-3 app-body-inner'>
						<div className="row">
							<div className="col-sm-2">
							</div>
							<div className="col-sm-5 text-center">
								<label>Current</label>
							</div>
							<div className="col-sm-5 text-center">
								<label>New</label>
							</div>
						</div>
						<div className="row">
							<div className="col-sm-2">
								<label>Reference Rate</label>
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" value={this.state.ref_rate_value} disabled />
							</div>
							<div className="col-sm-5">
								<input type="text" className="form-control text-right" onChange={this.updateNewReferenceRate} value={this.state.tranType === "view" ? '' : this.state.newReferenceRateVal} disabled={this.state.tranType === "view" ? 'true' : '' }/>
							</div>
						</div>
					</div>
				</AppBody>
				<ViewFooter>
					<ButtonComponent
						ButtonClass={'btn btn-default ' + (this.state.tranType === 'view' ? "disabled" : '') }
						disabled={(this.state.tranType === 'view' ? "true" : '') }
						ButtonName='Process' whenClicked={this.showApprovalModal} />
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

module.exports = ReferenceRate;
