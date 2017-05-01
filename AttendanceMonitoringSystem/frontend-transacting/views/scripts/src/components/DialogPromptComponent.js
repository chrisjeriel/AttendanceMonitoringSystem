'use strict';

var React = require('react');

var DialogPromptComponent = React.createClass({
    getDefaultProps: function () {
        return ({
            confirmMessage: 'Yes',
            cancelMessage: 'No',
        });
    },
    propTypes: {
        title: React.PropTypes.string.isRequired,
        confirmMessage: React.PropTypes.string.isRequired,
        cancelMessage: React.PropTypes.string.isRequired,
        keyListener: React.PropTypes.object,
        getResult: React.PropTypes.func.isRequired,
    },
    getInitialState: function () {
        return ({onClickHandler: null});
    },
    focus : function(){

    },
    componentDidMount: function () {
        var keyLeft = {
            keys: 'left',
            is_exclusive: true,
            on_keydown: function(e) {
                console.log("left")
                $("#acceptButton,#cancelButton").removeClass()
                $("#acceptButton").addClass("btn btn-primary col-md-12")
                $("#cancelButton").addClass("btn btn-default col-md-12")
            }
        };

        var keyRight = {
            keys: 'right',
            is_exclusive: true,
            on_keydown: function(e) {
                console.log("right")
                $("#acceptButton,#cancelButton").removeClass()
                $("#cancelButton").addClass("btn btn-primary col-md-12")
                $("#acceptButton").addClass("btn btn-default col-md-12")
            }
        };

        var keyEnter = {
            keys: 'enter',
            is_exclusive: true,
            on_keydown: function(e) {
                console.log("enter")
                let result;
                var getResult = this.props.getResult
                let className = this.refs.acceptButton.className
                if (className === "btn btn-default col-md-12") {
                  result = false
                }
                else {
                  result = true
                }
                getResult(result)
            }.bind(this)
        };

        this.props.keyListener.register_many([keyLeft,keyRight,keyEnter])
    },
    confirmClicked: function () {
        var getResult = this.props.getResult
        getResult(true)
    },
    cancelClicked: function () {
        var getResult = this.props.getResult
        getResult(false)
    },
    componentWillUnmount: function(){
        this.props.keyListener.unregister_combo("left");
        this.props.keyListener.unregister_combo("right");
        this.props.keyListener.unregister_combo("enter");
    },
    componentWillReceiveProps: function(){

    },
    componentWillReceiveContext: function(){

    },
    render: function(){
        return (
            <div className="row">
                <div id='dialog-prompt' className='a-center col-md-offset-3 col-md-6'>
                    <label className="col-md-12">{this.props.title}</label>
                    <br/>
                    <div className="col-md-12">
                        <div className="col-md-6">
                            <button id="acceptButton" onClick={this.confirmClicked} ref="acceptButton" type="button" className="btn btn-default col-md-12">{this.props.confirmMessage}</button>
                        </div>
                        <div className="col-md-6">
                            <button id="cancelButton" onClick={this.cancelClicked} ref="cancelButton" type="button" className="btn btn-primary col-md-12">{this.props.cancelMessage}</button>
                        </div>
                    </div>
                </div>
            </div>
        );
  }
});

module.exports = DialogPromptComponent;
