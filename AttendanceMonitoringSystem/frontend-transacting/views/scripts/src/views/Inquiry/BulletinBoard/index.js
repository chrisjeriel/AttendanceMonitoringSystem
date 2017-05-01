'use strict';

var React = require('react');
var defaultData = require('../../../components/defaultData');
var TransactionContainer = require('../../../components/TransactionContainer');
var TableComponent = require('../../../components/TableComponent');
var ModalContainer = require('../../../components/ModalContainer');

var BulletinBoard = React.createClass({
    getInitialState: function () {
        defaultData.storeBulletinBoard();
        var data = store.get('bulBoard', null);
    // var listener = new window.keypress.Listener();
        return({tableData: data});
    },
    render: function () {
        return(
            <TransactionContainer>
                <ModalContainer className="bulletin_board_modal" title="TODAY'S BULLETIN BOARD">
                    <TableComponent
                        //  keyListener={this.state.keyListener}
                        checkBox={true}
                        column={['Special Messages']}
                        data={this.state.tableData}
                        ref="table"/>
                </ModalContainer>
            </TransactionContainer>
        );
   }
  });


module.exports = BulletinBoard;
