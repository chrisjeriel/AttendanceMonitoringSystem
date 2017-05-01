'use strict';

var React = require('react');
var ModalContainer = require('./ModalContainer');
var SeparatorComponent = require('./SeparatorComponent');


var RefNoInputModal = React.createClass({
    submitRefNo: function (e) {
        e.preventDefault();
        this.props.submitRefNo(this.refs.ref_no.value);
    },
    render: function () {
        return (
            <ModalContainer title={this.props.title}>
                <br />
                <br />
                <form onSubmit={this.submitRefNo}>
                    <div className = "row">
                        <div className="col-md-offset-1 col-md-3">
                            <label>REFERENCE NO. :</label>
                        </div>
                        <div className="col-md-6">
                            <input className="form-control"
                                type="text"
                                placeholder="Reference No."
                                maxLength='8'
                                ref='ref_no' />
                        </div>
                    </div>
                    <button type='submit' hidden></button>
                </form>
                <br />
                <br />
                <br />
            </ModalContainer>
        );
    }
});

module.exports = RefNoInputModal;
