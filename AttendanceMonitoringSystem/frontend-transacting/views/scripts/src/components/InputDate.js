'use strict';

var React = require('react');

var BPAccountNo = React.createClass({
    propTypes: {
        editMode: React.PropTypes.bool.isRequired,
        callback: React.PropTypes.func,
        label: React.PropTypes.string
    },
    getInitialState() {
        return ({editMode: false, transDate : ''});
    },
    getDefaultProps: function() {
        return({editMode: false});
    },
    componentWillMount: function() {
        if(this.props.editMode){
            this.setState({editMode: true});
        }
    },
    componentDidMount: function(){
        if(this.state.editMode){
            var callback = this.props.callback;
            $('#date-input').mask('00/00/0000');
            $('#date-input').on('keyup', function(event) {
                event.preventDefault();
                var value =  $(this).val();
                // var regex = /[0-9]{1}-[0-9]{3}-[0-9]{8}/g
                if(value.length == 10 && callback){
                    callback(value);
                }
            });
        }
    },
    focus: function(){
        this.refs.transDate.focus();
    },
    getInputNode: function(){
        return this.refs.transDate
    },
    disableEditMode: function(transDate){
        this.setState({editMode: false,transDate: transDate})
    },
    render: function(){
        return (
            <div className='col-md-6 component'>
                <div className='row'>
                    <label className='col-md-4'>{this.props.label}</label>
                    <label className='col-md-1'>:</label>
                    <div className='col-md-7'>
                        {
                            this.state.editMode ?
                                <input className='input' type='text' id='date-input'
                                    placeholder='MM/DD/YYYY' maxLength='10'
                                    ref='transDate' disabled={!this.props.editMode} />
                            :
                                <span>{this.state.transDate}</span>
                        }
                    </div>
                </div>
            </div>
        );
    }
});

module.exports = BPAccountNo;
