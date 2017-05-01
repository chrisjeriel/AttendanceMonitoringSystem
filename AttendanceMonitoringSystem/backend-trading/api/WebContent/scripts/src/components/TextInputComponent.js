'use strict';

var React = require('react');

var TextInputComponent = React.createClass({
    getDefaultProps: function() {
        return ({
            onChange: null,
            onKeyDown: null,
            mask: null,
            value: '',
            length: 'col-md-6',
            inputLength: 'col-md-3',
            labelLength: 'col-md-4',
            inputTextAlign: 'right',
            maxLength: '',
            inputType: 'text'
        });
    },
    propTypes: {
        title: React.PropTypes.string.isRequired,
        editMode: React.PropTypes.bool,
        callback: React.PropTypes.func,
        onChange: React.PropTypes.func,
        mask: React.PropTypes.string,
    },
    getInitialState: function(){
        return ({
            value: '',
            editMode: false
        });
    },
    focus : function(){
        this.refs.textinput.focus()
    },
    componentWillMount: function(){
        this.setState({editMode: this.props.editMode})
    },
    componentWillReceiveProps: function(){
    },
    componentWillReceiveContext: function(){

    },
    componentDidMount: function(){
        if (this.props.mask != null) {
            $('#' + this.props.idName ).mask(this.props.mask)
        }
        if (this.props.value != null) {
            this.setState({value: this.props.value})
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
    mask: function(mask){
        $('#'+ this.props.idName).mask(mask);

    },
    value: function(){
        return this.refs.textinput.value
    },
    currency: function(){

    },
    render: function(){
        return (
            <div className={this.props.length + " component"}>
                <div className='row'>
                    <label className={this.props.labelLength}>{this.props.title}</label>
                    <label className='col-md-1'>:</label>

                                {
                                    (this.state.editMode && this.state.value == '') ?
                                    <div className={this.props.inputLength}>
                                        <input className='input' type={this.props.inputType} id={this.props.idName}
                                            ref='textinput' disabled={!this.state.editMode} onChange={this.props.onChange}
                                            onKeyDown={this.props.onKeyDown} maxLength={this.props.maxLength}
                                            style={{textAlign: this.props.inputTextAlign}} />
                                    </div>
                                    :
                                        <div className={this.props.inputLength} >
                                            <span className='block' style={{textAlign:this.props.inputTextAlign}}>{this.state.value}</span>
                                        </div>
                                }

                </div>
            </div>
        );
    }
});

module.exports = TextInputComponent;
