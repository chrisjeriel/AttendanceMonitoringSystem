var React = require('react');

var UpdateApprovingAuthorityLimitTextboxComponent = React.createClass({

	render:function(){
		return(
									<div className='row'>

										<div className='col-xs-1 no-padding'>
											{this.props.children}
										</div>
										<div className='col-xs-2 no-padding'>
											<input type='text' name={'php'+this.props.formObj.id} value={this.props.formObj.php} 
											onChange={this.props.handleChange} className="text-right" />

										</div>
										<div className='col-xs-2 no-padding'>
											<input type='text' name={'usd'+this.props.formObj.id} value={this.props.formObj.usd} 
											onChange={this.props.handleChange} className="text-right" />
										</div>

										<div className='col-xs-2 no-padding'>
											<div className='row'>
												<div className='col-xs-12 padding-bottom'>
													[<input type='checkbox' name={'officerselected1'+this.props.formObj.id}
														checked={this.props.formObj.officerselected1 }
														onClick={this.props.handleClick}
														/>
														<label>Officer 1 </label>
												</div>
												<div className='col-xs-12 padding-bottom'>
													[<input type='checkbox' name={'officerselected2'+this.props.formObj.id}
														checked={this.props.formObj.officerselected2 } 
														onClick={this.props.handleClick} />
														<label>Officer 2 </label>
												</div>
											</div>
										</div>

										<div className='col-xs-3 no-padding'>
											<div className='row'>
												<div className='col-xs-12 padding-bottom'>
													<input className='full-width' type='text' value={this.props.formObj.officerselected1 ? this.props.formObj.officer1 : ''} />
												</div>
												<div className='col-xs-12 padding-bottom'>
													<input className='full-width' type='text' value={this.props.formObj.officerselected2 ? this.props.formObj.officer2 : ''} />
												</div>
												<div className='col-xs-12 align-right'>
													<label>Total Override Points</label>
												</div>
											</div>
										</div>

										<div className='col-xs-2 no-padding'>
											<div className='row'>
												<div className='col-xs-11 no-padding padding-bottom' >
													<input type='text' value={this.props.formObj.officerselected1 ? this.props.formObj.officeroverride1 : ''} />]
												</div>
												<div className='col-xs-11 no-padding padding-bottom'>
													<input type='text' value={this.props.formObj.officerselected2 ? this.props.formObj.officeroverride2 : ''} />]
												</div>
												<div className='col-xs-11 no-padding'>
													<input type='text' value={this.props.formObj.override} />
												</div>
											</div>
										</div>

									</div>
			);
	}
});
module.exports = UpdateApprovingAuthorityLimitTextboxComponent;