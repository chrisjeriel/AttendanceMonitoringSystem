var React = require('react');

var ApplicationCodeUpdateTextboxComponent = React.createClass({

	render:function(){
		return(
			<div className='row'>
				<div className='col-xs-12'>
					<div className='col-xs-1 a-center'>
						{this.props.children}
					</div>
					<div className='col-xs-2'>
						<input className=' form-control' type='text' />
					</div>
					<div className='col-xs-1 a-center'>
						<label className='align-label'>-</label>
					</div>
					<div className='col-xs-8'>
						<input className="form-control" type="text" />
					</div>
				</div>
			</div>
			);
	}
});
module.exports = ApplicationCodeUpdateTextboxComponent;