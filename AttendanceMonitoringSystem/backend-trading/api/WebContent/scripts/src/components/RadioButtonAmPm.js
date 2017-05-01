var React = require('react');

var RadioButtonAmPm = React.createClass({
	render: function(){
		return (
			<span className=''>
				<input type='radio' name='time' />A.M.
				<input type='radio' name='time' />P.M.
			</span>
		);
	}
});

module.exports = RadioButtonAmPm;