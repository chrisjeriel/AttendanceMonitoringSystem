var React = require('react');
var ReactDom = require('react-dom');

var MaskInputComponent = React.createClass({
	
	componentDidMount: function() {
		var element = ReactDom.findDOMNode(this);
		$(element).mask(this.props.mask, {placeholder: this.props.placeholder});
	},

	render: function(){
		return (
			<input type="text" className={this.props.className} ref={this.props.refName} onChange={this.props.onChange}/>
		);
	}
});

module.exports = MaskInputComponent;