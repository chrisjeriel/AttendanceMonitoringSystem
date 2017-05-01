'use strict';

var React = require('react');

var ButtonComponent = require('../../../../components/ButtonComponent');
var AppHeader = require('../../../../components/AppHeader');
var AppHeaderTitle = require('../../../../components/AppHeaderTitle');
var AppBody = require('../../../../components/AppBody');
var ViewFooter = require('../../../../components/ViewFooter');
var Auth = require('../../../../auth/Auth');
var Table = require('../../../../components/TableComponent');
var API = require('../../../../api');
var ConfirmationPrompt = require('../../../../components/ConfirmationPrompt');
var SystemResponse = require('../../../../components/SystemResponse');

var ValidCurrencyProcess = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },
    getInitialState: function(){
        return ({
            data:[],
            delete_mode: '',
            modify_mode: '',
            currencyVal: '',
            descriptionVal: '',
            bpiVal: '',
            casaVal: ''
        });
    },
    componentDidMount:function(){
        if(this.props.mode == 'add'){

        }else if(this.props.mode == 'modify'){
            this.setState({ modify_mode : 'true' });
        }else if(this.props.mode == 'delete'){
            this.setState({ delete_mode : 'true' });
        }
        else if (this.props.mode == 'details'){
                this.setState({delete_mode: true});
                this.setState({modify_mode: false});
        }

        if(this.props.mode != 'add'){
            this.setState({
                bpiVal: this.props.data.CURR_BPI,
                casaVal: this.props.data.CURR_CASA,
                currencyVal: this.props.data.CURR_CODE,
                descriptionVal: this.props.data.CURR_DESC,
            });
        }

        $("#currencyCode").mask("AAA");
        $("#bpiCode").mask("000");
        $("#casaCode").mask("00");
    },
    ConfirmYes: function(){
        this.closeDialogBox();
        switch(this.props.mode){
            case 'add':
                this.Add();
                break;
            case 'modify':
                this.Modify();
                break;
            case 'delete':
                this.Delete();
        }
    },
    ConfirmNo: function(){
        this.closeDialogBox();
        console.log("User changed mind");
    },
    Process:function(){
        var bpiVal = this.state.bpiVal;
        var casaVal = this.state.casaVal;
        var currencyVal = this.state.currencyVal;
        var descriptionVal = this.state.descriptionVal;

        if( bpiVal!="" && 
            casaVal != "" && 
            currencyVal != "" && 
            descriptionVal != "")
        {
            this.setState({
                data: {
                    currBpi: bpiVal,
                    currCasa: casaVal,
                    currCode: currencyVal,
                    currDesc: descriptionVal
                    },
                dialog: <ConfirmationPrompt 
                    title="Process" 
                    content={"Are you sure you want to "+this.props.mode+" record?"}
                    yes={this.ConfirmYes}
                    no={this.ConfirmNo}
                     />
            });
        }else{
            this.setState({
                dialog: <SystemResponse title="Error" content="Input Incomplete" close={this.closeDialogBox} />
            });
        }
    },
    Add:function(){
        console.log(this.state.data);

        API.maintenance_defsyscontrols.valid_currency_add(
            this.state.data,
            function(data){
                console.log('Add Success');
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Add Success"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox}  />
                    });
                }else{
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Add Error"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox} />
                    });
                }
            }.bind(this),
            function(data){
                console.log('Add Fail');
                console.log(data);
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
            }.bind(this)
        );
    },
    Modify:function(){
        console.log(this.state.data);

        API.maintenance_defsyscontrols.valid_currency_modify(
            this.state.data,
            function(data){
                console.log('Modify Success');
                console.log(data);
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Update Success"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox}  />
                    });
                }else{
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Update Error"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox} />
                    });
                }
            }.bind(this),
            function(data){
                console.log('Modify Fail');
                console.log(data);
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
            }.bind(this)
        );
    },
    Delete:function(){
        console.log(this.state.data);

        API.maintenance_defsyscontrols.valid_currency_modify(
            this.state.data,
            function(data){
                console.log('Delete Success');
                console.log(data);
                if(data.meta.code == 200 || data.meta.code == 0){
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Delete Success"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox}  />
                    });
                }else{
                    this.setState({
                        dialog: <SystemResponse 
                                    title="Delete Error"
                                    content={data.meta.errorMessage}
                                    close={this.closeDialogBox} />
                    });
                }
            }.bind(this),
            function(data){
                console.log('Delete Fail');
                console.log(data);
                this.setState({
                    dialog: <SystemResponse 
                                title="Error"
                                content="Cannot connect to middleware"
                                close={this.closeDialogBox} />
                });
            }.bind(this)
        );
    },
    processSuccess: function (res) {
        this.setState({
            dialog: <ConfirmationPrompt title="Confirmation" content="Are you sure you want to Delete Record?" yes={this.closeDialogBox} no={this.closeDialogBox} />
        });
    },

    processFail: function (xhr, err) {
        this.setState({
            dialog: <SystemResponse title="System Response" content="System Error" close={this.closeDialogBox} />
        });
    },
    closeDialogBox: function () {
        this.setState({dialog: null});
    },
    updateCurrencyCode: function(e){
      var val = e.target.value;
      this.setState({currencyVal: val})
    },
    updateDescription: function(e){
      var val = e.target.value;
      this.setState({descriptionVal: val})
    },
    updateBpiCode: function(e){
      var val = e.target.value;
      this.setState({bpiVal: val})
    },
    updateCasaCode: function(e){
      var val = e.target.value;
      this.setState({casaVal: val})
    },

    render:function(){
        return(
            <div className='app-border process_modal'>
                <AppHeader>
                    <AppHeaderTitle>
                        <h5>Currency Code File Maintenance</h5>
                    </AppHeaderTitle>
                </AppHeader>
                <AppBody>
                        <div className="a-center process-title">
                            <h3>&gt;&gt;&gt; {this.props.mode} MODE &lt;&lt;&lt;</h3>
                        </div>
                        <div className='col-sm-12 app-body-inner'>
                            <form className='form-group no-border-content'>
                                <div className='row app-body-content'>
                                    <div className='col-xs-8 col-xs-offset-2'>
                                        <div className='row'>
                                            <div className='col-xs-12'>
                                                <div className='col-xs-4 align-right'>
                                                    <h5>Currency Code</h5>
                                                    </div>
                                                 <div className='col-xs-8 align-left'>
                                                    <input id="currencyCode" value={this.state.currencyVal} onChange={this.updateCurrencyCode} className="form-control" type="text" placeholder="" disabled={this.state.modify_mode || this.state.delete_mode} />
                                                 </div>
                                            </div>
                                        </div>
                                        <div className='row'>
                                            <div className='col-xs-12'>
                                                <div className='col-xs-4 align-right'>
                                                    <h5>Description</h5>
                                                </div>
                                                 <div className='col-xs-8 align-left'>
                                                    <input id="description" value={this.state.descriptionVal} onChange={this.updateDescription} className="form-control" type="text" placeholder="" disabled={this.state.delete_mode} />
                                                 </div>
                                            </div>
                                        </div>
                                        <div className='row'>
                                            <div className='col-xs-6'>
                                                <div className='col-xs-4 align-right'>
                                                    <h5>BPI Code</h5>
                                                </div>
                                                 <div className='col-xs-8 align-left'>
                                                    <input id="bpiCode" value={this.state.bpiVal} onChange={this.updateBpiCode} className="form-control" type="text" placeholder="" disabled={this.state.delete_mode} />
                                                 </div>
                                            </div>
                                            <div className='col-xs-6'>
                                                <div className='col-xs-4 align-right'>
                                                    <h5>CASA Code</h5>
                                                </div>
                                                <div className='col-xs-8 align-left'>
                                                    <input id="casaCode" value={this.state.casaVal} onChange={this.updateCasaCode} className='form-control' type="text" placeholder='' disabled={this.state.delete_mode} />
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                </AppBody>
                <ViewFooter>
                    <div className='row'>
                        <ButtonComponent ButtonName='Process' ButtonClass='btn btn-default col-xs-2 col-xs-offset-4' whenClicked={this.Process} />
                        <ButtonComponent ButtonName='Close' ButtonClass='btn btn-default col-xs-2' whenClicked={this.props.close} />
                    </div>
                </ViewFooter>
                {
                    this.state.dialog != null ?
                        this.state.dialog
                        : ''
                }
            </div>
            );
    }

});

module.exports = ValidCurrencyProcess;
