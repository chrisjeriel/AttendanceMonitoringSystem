'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var THcomponent = require('../../../../components/THcomponent');
var TDcomponent = require('../../../../components/TDcomponent');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var Process = require('./process');
var TableComponent = require('../../../../components/TableComponent');
var SystemResponse = require('../../../../components/SystemResponse');

var ValidCurrency = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function(){
        return ({
            currency_code: '',
            description: '',
            bpi_code: '',
            casa_code: '',
            valid_currency:null
        });
    },
    componentDidMount:function(){
        this.loadData();
        this.SelectRow();
        window.addEventListener('keyup', this.key_listener);
    },
    Details:function(){
        console.log(this.state.valid_currency[this.state.selected]);
        this.setState({
            process_mode: 'details',
            process_modal: <Process mode='details' data={this.state.valid_currency[this.state.selected]} close={this.closeProcessModal} />
        });
    },
    loadData:function(){
      API.maintenance_defsyscontrols.valid_currency_list(
            null,
            function(data){
                  console.log("CHANEL");
                console.log(data.data);
                  console.log("CHANEL");
            if(data.meta.code == 200 || data.meta.code == 0){                 
                   this.setState({valid_currency: data.data});
                }else{
                    this.setState({
                        process_mode: 'list',
                        process_modal: <SystemResponse title="Error" content={data.meta.errorMessage} close={this.closeProcessModal} />
                    });
                }
            }.bind(this),
            function(data){
                this.setState({   
                    process_mode: 'list',
                    process_modal: 
                        <SystemResponse title="Process" content={AppConstants.ERROR_CANNOT_CONNECT} close={this.closeProcessModal}/>
                });
            }.bind(this)
           );
    //  api.valid_currency.getList()
    //      .done(this.processSuccess)
    //      .fail(this.processFail);

    // },
        // var data = {
        //         valid_currency: [
        //           {
        //               currency_code: 'AUD',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'SGD',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'USD',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'BGD',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'CAD',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'KRW',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'CNY',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'JPY',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'PHP',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'ZYW',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'ABC',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'DEF',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'GHI',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'JKL',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'MNO',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'PQR',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'STU',
        //               description: 'AUSTRALIAN DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           },
        //           {
        //               currency_code: 'VWY',
        //               description: 'SINGAPORE DOLLAR',
        //               bpi_code: '007',
        //               casa_code: '20'
        //           }
        //         ]
        // };

      //  this.setState({valid_currency: data.valid_currency});
    },

    processSuccess: function (res) {
        //need to connect this to table
    },

    processFail: function (xhr, err) {
        alert('Err: ' + err);
    },

    showProcessModal: function (process_mode) {
        var state = {   process_mode: process_mode,
                        process_modal: <Process mode={process_mode} data={this.state.valid_currency[0]} close={this.closeProcessModal}/>
                    };

        //add switch case for add edit delete

        this.setState(state);
    },

    closeProcessModal: function () {
        this.setState({process_mode: null});
    },

    Close:function(event){
        this.context.router.replace('/menu');
    },

    Refresh:function(event){

    },

    Top: function(){

    },

    SelectRow: function(){
        var selected = $('tr.selected').index();
        console.log(selected);
    },
    componentWillUnmount: function () {
        window.removeEventListener('keyup', this.key_listener);
    },

    updateSelected: function(){
        var selected = $('tr.selected').index();
        console.log("update selected: " + selected);

        this.setState({selected: selected});
    },

    render:function(){
        return(
          <div>
            <div className='app-border'>
                {
                    this.state.process_mode ?
                        this.state.process_modal
                        : ''
                }
                <AppBody>
                   
                  {this.state.valid_currency!= null ?  <TableComponent
                                checkBox={false}
                                column={["BPI CODE", "CURRENCY CODE", "CASA CODE", "DESCRIPTION"]}
                                data={this.state.valid_currency}
                                visible={10}
                                ref="table"
                                onSelect={this.Details}


                                 onMove={this.updateSelected}

                                 />  : <div>Loading Data...</div> }
                                
                     {/*}   <table id="tableId" className="table table-hover table-bordered table-fixed">
                          

                            <thead>
                                <tr>
                                    <THcomponent TitleClass='col-xs-3' TableTitle='Currency Code' />
                                    <THcomponent TitleClass='col-xs-3' TableTitle='Description'/>
                                    <THcomponent TitleClass='col-xs-3' TableTitle='BPI CODE'/>
                                    <THcomponent TitleClass='col-xs-3' TableTitle='CASA CODE'/>
                                </tr>
                            </thead>
                            <tbody>
                                {this.state.valid_currency.map(function(valid_currency){
                                    return(
                                        <tr id={valid_currency.currency_code} key={valid_currency.CURR_CODE}>
                                            <TDcomponent ContentClass='col-xs-3' TableContent={valid_currency.CURR_CODE}/>
                                            <TDcomponent ContentClass='col-xs-3' TableContent={valid_currency.CURR_DESC}/>
                                            <TDcomponent ContentClass='col-xs-3' TableContent={valid_currency.CURR_BPI}/>
                                            <TDcomponent ContentClass='col-xs-3' TableContent={valid_currency.CURR_CASA}/>
                                        </tr>
                                        )
                                    })}


                            </tbody>
                        </table>*/}
                
                </AppBody>
                <ViewFooter>
                    <div className='row'>
                        <ButtonComponent ButtonName="Top" ButtonClass='btn btn-default' whenClicked={this.Top} />
                        <ButtonComponent ButtonName="Next" ButtonClass='btn btn-default' whenClicked={this.Next} />
                        <ButtonComponent ButtonName="Bottom" ButtonClass='btn btn-default' whenClicked={this.Bottom} />
                        <ButtonComponent ButtonName="ADD" ButtonClass='btn btn-default' whenClicked={this.showProcessModal.bind(this, 'add')} />
                        <ButtonComponent ButtonName="Modify" ButtonClass='btn btn-default' whenClicked={this.showProcessModal.bind(this, 'modify')} />
                        <ButtonComponent ButtonName="Delete" ButtonClass='btn btn-default' whenClicked={this.showProcessModal.bind(this, 'delete')} />
                        <ButtonComponent ButtonName="Refresh" ButtonClass='btn btn-default' whenClicked={this.Refresh} />
                        <ButtonComponent ButtonName="Close" ButtonClass='btn btn-default' whenClicked={this.Close} />
                    </div>
                </ViewFooter>
            </div>
            {
              this.state.process_mode ?
                <div className='overlay'></div>
                :''
            }
        </div>
        );
    }

});

module.exports = ValidCurrency;
