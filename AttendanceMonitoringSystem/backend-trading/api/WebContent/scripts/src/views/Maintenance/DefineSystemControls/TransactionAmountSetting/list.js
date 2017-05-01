'use strict'
var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var TableComponent = require('../../../../components/TableComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var ButtonComponent = require('../../../../components/ButtonComponent');
var Process = require('./process');

var TransactionAmountSettingList = React.createClass({
	getInitialState: function() {
		return ({
			modal: null
		})
	},
	Details: function(){
		var selected = $('tr.selected').index();
		console.log(selected);
		console.log(this.props.data[selected]);
		var data = {
			trdrFi: this.props.data[selected].TRDR_FI,
			currCode: this.props.data[selected].CURR_CODE,
			minAmnt: this.props.data[selected].MIN_AMNT,
			pabvLim: this.props.data[selected].PABV_LIM,
			sabvLim: this.props.data[selected].SABV_LIM
		}
		this.setState({
			modal: <Process data={data} close={this.CloseModal} />
		});
	},
	CloseModal: function(){
		this.setState({modal: null});
	},
	render:function(){
		return(
			<div>
			<div className='app-border process_modal'>
				<AppHeader>
					<AppHeaderTitle>
						<h5>List of Transaction Amount Settings per Currency</h5>
						<h5>BPI FOREX</h5>
					</AppHeaderTitle>
				</AppHeader>
				<AppBody>
          			<TableComponent
                        checkBox={false}
                        column={["Currency", "Trading Unit Code", "Minimum Amount", "Purchase Above Limit", "Sale Above Limit"]}
                        data={this.props.data}
                        visible={7}
                        ref="table"
                        onSelect={this.Details}
                         />
				</AppBody>
				<ViewFooter>
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Top" whenClicked={this.Top} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Next" whenClicked={this.Next} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Bottom" whenClicked={this.Bottom} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Details" whenClicked={this.Details} />
					<ButtonComponent ButtonClass='btn btn-default' ButtonName="Close" whenClicked={this.props.close} />
				</ViewFooter>
			</div>
			{
				this.state.modal?
					this.state.modal
					: null
			}
			</div>
			);
	}

});

module.exports = TransactionAmountSettingList;