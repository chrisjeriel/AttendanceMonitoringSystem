'use strict';

var React = require('react');
var ModalContainerNoTitle = require('../../components/ModalContainerNoTitle');
var InputDate = require('../../components/InputDate');

var BeneficiaryData = React.createClass({
    saveBeneficiaryData: function () {
        var address1 = this.refs.address1.value,
            address2 = this.refs.address2.value,
            birth_date = this.refs.birth_date.value,
            tin = this.refs.tin.value;

        if (address1 && address2 && birth_date && tin) {
            this.props.saveBeneficiaryData(
                address1,
                address2,
                birth_date,
                tin
            );
        }

    },
    componentDidMount: function () {
        $(this.refs.tin).mask('000-000-000');
        $(this.refs.birth_date).mask('00/00/00');
    },
    render: function () {
        return (
            <ModalContainerNoTitle className="beneficary_data_modal" title = "Beneficiarys's Data">
            <br />
                <div className = "row">
                    <div className="col-md-2">
                        <label>Name:</label>
                    </div>
                    <div className="col-md-10">
                        {this.props.name}
                    </div>
                </div>
                <div className = "row">
                    <div className="col-md-2">
                        <label>Address:</label>
                    </div>
                    <br />
                    <div className="col-md-10">
                        <input className="form-control"
                            type="text"
                            placeholder="Address"
                            maxLength='60'
                            ref='address1'/>
                    </div>
                    <div className=" col-md-offset-2 col-md-10">
                        <input className="form-control"
                            type="text"
                            placeholder="Address"
                            maxLength='60'
                            ref='address2'/>
                    </div>
                </div>
                <br />
                <div className = "row">
                    <div className="col-md-2">
                        <label>Birthdate:</label>
                    </div>
                    <div className="col-md-10">
                        <input className="form-control"
                            type="text"
                            placeholder="MM/DD/YYYY"
                            maxLength='10'
                            ref='birth_date' />
                    </div>
                </div>
                <br />
                <div className = "row">
                    <div className="col-md-2">
                        <label>TIN#:</label>
                    </div>
                    <div className="col-md-10">
                        <input className="form-control"
                            type="text"
                            placeholder="000-000-000"
                            maxLength='11'
                            ref='tin' />
                    </div>
                </div>
                <br />
                <div className = "row">
                    <button className = "col-md-offset-4 backg" onClick={this.saveBeneficiaryData}><h5>(Proceed)</h5></button>
                    <button className = "backg" onClick={this.props.closeBeneficiaryModal}><h5>(eXit)</h5></button>
                </div>
            </ModalContainerNoTitle>
        );
    }
});

module.exports = BeneficiaryData;
