var React = require('react');

var AppBody = require('../../components/AppBody');
var AppHeader = require('../../components/AppHeader');
var ViewFooter = require('../../components/ViewFooter');
var ButtonComponent = require('../../components/ButtonComponent');
var Auth = require('../../auth/Auth');

var Inquiry = React.createClass({
	contextTypes: {
		router: React.PropTypes.object
	},
  getInitialState: function(){
		return(
			{
				iType: this.props.params.iType
			}
		)
	},
	componentWillReceiveProps: function(nextProps){
		if(nextProps!=this.props){
			this.resetState();
			this.setState({iType: nextProps.params.iType});
		}
	},
	resetState: function(){
		this.setState({
			iType: null
		});
	},
	render:function(){
		return(
			<div className='app-border'>
        <AppHeader/>
				<AppBody>
            {this.state.iType}
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
												<label><h5>Reference Number:</h5></label>
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

module.exports = Inquiry;
