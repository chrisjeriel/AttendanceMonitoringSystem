var React = require('react');

 var AppBody = require('../../../../components/AppBody');
 var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Auth = require('../../../../auth/Auth');
var SystemResponse = require('../../../../components/SystemResponse');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');

var OfficersApproval = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
	getInitialState: function () {
		return (
			{	
				dialog: <ConfirmationPrompt title="Confirmation" content="Proceed to Officer Authorization?" yes={this.confirmPrompt} no={this.props.closeModal} />,
				ready: null
			}
		);
	},
	confirmPrompt: function () {
		this.setState({
            dialog: null,
            ready: 'true'
        });
	},
	process: function () {
		this.processSuccess();
	},
	processSuccess: function () {
		this.setState({
            dialog: <SystemResponse title="System Response" content="Officer ID and password successfully validated" close={this.confirmOriginalProcess} />
        });
	},
	confirmOriginalProcess: function () {
		this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content={"Process "+this.props.processName+"?"} yes={this.continueOriginalProcess} no={this.props.closeModal} />
        });
	},
	continueOriginalProcess: function () {
		this.props.process();
		this.props.closeModal();
	},
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
	render:function(){
		return(
			<div>
				<div className={'app-border process_modal ' + (this.state.ready === null ? 'visible-xs hidden-xs' : '')}>
					<AppBody>
						<div className='col-sm-12 app-body-inner'>
							<div className="row">
								<div className="col-sm-12">
									<label>Please Enter Officer ID and Password</label>
								</div>
							</div>
							<div className="row">
								<div className="col-sm-4">
									Officer ID:
								</div>
								<div className="col-sm-8">
									<input type="text" className="form-control" value=""/>
								</div>
							</div>
							<div className="row">
								<div className="col-sm-4">
									Password:
								</div>
								<div className="col-sm-8">
									<input type="text" className="form-control" value=""/>
								</div>
							</div>
							<br />
						</div>
					</AppBody>
					<ViewFooter>
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Process' whenClicked={this.process} />
						<ButtonComponent ButtonClass='btn btn-default' ButtonName='Close' whenClicked={this.props.closeModal} />
					</ViewFooter>
				</div>
				{
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }   
			</div>
		);
	}

});

module.exports = OfficersApproval;