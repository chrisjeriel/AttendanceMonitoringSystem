'use strict';
var React = require('react');

var Util = require('../util');

var AmountInputComponent = React.createClass({
    getDefaultProps: function() {
        return ({ //default values
            onKeyDown: null,
            length: 'col-md-6',
            inputLength: 'col-md-3',
            labelLength: 'col-md-4',
            inputTextAlign: 'right',
            maxLength: '',
            inputType: 'text',
            placeholder:'',
            mask:null, 
            idName:'',
            value: 0
        });
    },
    propTypes: {
        editMode: React.PropTypes.bool,
        callback: React.PropTypes.func,
        onKeyDown: React.PropTypes.func,
        mask: React.PropTypes.string,
        idName: React.PropTypes.string,
        maxLength: React.PropTypes.string,
        placeholder: React.PropTypes.string,
        defVal: React.PropTypes.string
    },
    getInitialState: function(){
        return ({
            editMode: false
        });
    },
    focus : function(){
        this.refs.textinput.focus()
    },
    componentWillMount: function(){
        this.setState({ editMode: this.props.editMode,
                        mask: this.props.mask,
                        idName: this.props.idName})
    },
    componentDidMount: function() {
      if(this.props.editMode!=null){
          this.setState({editMode: this.props.editMode})
      }
      if(this.props.maxLength!=null){
          this.setState({maxLength: this.props.maxLength})
      }
      if(this.props.placeholder!=null){
          this.setState({placeholder: this.props.placeholder})
                             }
      if(this.props.defVal != null){
         this.parseValue(this.props.defVal);
      }
    },
    disableEditMode: function(value){
        this.setState({value: value})
    },
    enableEditMode: function(value){
        this.setState({editMode: true,value:''},function(){
            this.refs.textinput.value = value
        })
    },
    validateNumber: function(num){
      if(!Util.checkIfNumerical(num)){
         return false;
      }
      if(Util.getDecimalPlaces(num) > 2){
         return false;
      }

      return true;
    },
    parseValue: function(num){
      if(this.validateNumber(num)){
         var val = num.replace(/\,/g,'');
         val = Util.removeLeadingZeros(val);
         val = Util.decimalNumber(val);
         this.setState({value: val}); 
         return Util.removeCommas(val);
      }
      return this.state.value;
    },
    handleValue: function(e){
      this.props.onChange(e,this.parseValue(e.target.value));
    },
    render: function(){
        return (
            <div>
                <input className='form-control text-right' type="text" id={this.state.idName}
                    ref='textinput' disabled={!this.props.editMode} onChange={this.handleValue}
                    onKeyDown={this.state.onKeyDown} maxLength={this.state.maxLength}
                    value={this.state.value?this.state.value:0}/>
            </div>
        );
    }
});

module.exports = AmountInputComponent;
