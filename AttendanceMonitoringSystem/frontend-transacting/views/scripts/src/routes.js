'use strict';

var React = require('react');
var Router = require('react-router');
var Route = Router.Route;
var IndexRoute = Router.IndexRoute;
var IndexRedirect = Router.IndexRedirect;
var Redirect = Router.Redirect;
var BP = require('./app/BP');
/**
 * Views
 */
var Login = require('./views/Login');

// utility/printing_setup
var AddPrinter = require('./views/Utility/PrintingSetup/AddPrinter');
var DeletePrinter = require('./views/Utility/PrintingSetup/DeletePrinter');
var ChangeDefaultPrinter = require('./views/Utility/PrintingSetup/ChangeDefaultPrinter');
var ChangeDefaultPrinterForm = require('./views/Utility/PrintingSetup/ChangeDefaultPrinterForm');
var PrintingSetup = require('./views/Utility/PrintingSetup/PrintingSetup');

// utility/download_ref_file
var DownloadRefFile = require('./views/Utility/DownloadRefFiles/DownloadRefFile');
var DownloadRefFileTable = require('./views/Utility/DownloadRefFiles/DownloadRefFileTable');

// utility/user_file_maintenance
var UtilityUFMFinancial = require('./views/Utility/UserFileMaintenance/UtilityUFMFinancial');
var UtilityUFMInquiry = require('./views/Utility/UserFileMaintenance/UtilityUFMInquiry');
var UtilityUserFile = require('./views/Utility/UserFileMaintenance/UtilityUserFile');

// transaction/deal_(btsu|forex|tmu)/(purchase|sale)
var AcceptanceSettlementModeCodes = require('./views/Transaction/AcceptanceSettlementModeCodes');
var DataEntry = require('./views/Transaction/DataEntry');
var FinalUpdateCAS = require('./views/Transaction/FinalUpdateCAS');
var FinalUpdateCASDataEntry = require('./views/Transaction/FinalUpdateCASDataEntry');
var FinalUpdateFO = require('./views/Transaction/FinalUpdateFO');
var FinalUpdateFODataEntry = require('./views/Transaction/FinalUpdateFODataEntry');
var FinalUpdateMC = require('./views/Transaction/FinalUpdateMC');
var FinalUpdateMCDataEntry = require('./views/Transaction/FinalUpdateMCDataEntry');
var FinalUpdateSR = require('./views/Transaction/FinalUpdateSR');
var FinalUpdateSRDataEntry = require('./views/Transaction/FinalUpdateSRDataEntry');
var InvisibleCodeDescription = require('./views/Transaction/InvisibleCodeDescription');
var MTSCodeDescription = require('./views/Transaction/MTSCodeDescription');

// reports/(accepted_tc|cancelled_transactions|daily_summary_of_transactions|issued_mc)/(btsu|forex|tmu)
var AcceptedTCReports = require('./views/Reports/AcceptedTC');
var CancelledTransactionsReports = require('./views/Reports/CancelledTransactions');
var DailySummaryofTransactionsReports = require('./views/Reports/DailySummaryofTransactions');
var IssuedMCReports = require('./views/Reports/IssuedMC');

// inquiry/accepted_tc/(btsu|forex|tmu)
var AcceptedTC = require('./views/Inquiry/AcceptedTC');

// inquiry/bulletin_board/(btsu|forex|tmu)
var BulletinBoard = require('./views/Inquiry/BulletinBoard');

// inquiry/clients_historical_records/(purchase|sale)
var ClientsHistoricalRecords = require('./views/Inquiry/ClientsHistoricalRecords');
var DetailRecord = require('./views/Inquiry/ClientsHistoricalRecords/DetailRecord');

// inquiry/invisible_codes/(btsu|forex|tmu)
var InvisibleCodes = require('./views/Inquiry/InvisibleCodes');

// inquiry/issued_mcs/(btsu|forex|tmu)
var IssuedMCs = require('./views/Inquiry/IssuedMCs');

// inquiry/(purchase|sale)/(btsu|forex|tmu)
var Inquiry = require('./views/Inquiry/PurchaseSale/Inquiry');
var InquiryDataEntry = require('./views/Inquiry/PurchaseSale/InquiryDataEntry');

// inquiry/rates/(btsu|forex|tmu)
var RateInquiry = require('./views/Inquiry/Rates');

// inquiry/income/(btsu|forex|tmu)
var IncomeInquiry = require('./views/Inquiry/Income');

exports.makeMainRoutes = function (auth) {
    return (
        <Route path='/' onEnter={auth}>
            <IndexRedirect to="login" />
            <Route path='main' component={BP}>
                <IndexRoute onEnter={auth}/>
                <Route path='utility'>
                    <Route path='printing_setup'>
                        <IndexRoute component={PrintingSetup} onEnter={auth} />
                        <Route path='add_printer' component={AddPrinter} onEnter={auth} />
                        <Route path='delete_printer' component={DeletePrinter} onEnter={auth} />
                        <Route path='change_default_printer' component={ChangeDefaultPrinter} onEnter={auth} />
                        <Route path='change_default_printer_form' component={ChangeDefaultPrinterForm} onEnter={auth} />
                    </Route>
                    <Route path='download_ref_file'>
                        <IndexRoute component={DownloadRefFileTable} onEnter={auth} />
                        <Route path='file' component={DownloadRefFile} onEnter={auth} />
                    </Route>
                    <Route path='user_file_maintenance'>
                        <IndexRoute component={UtilityUserFile} onEnter={auth} />
                        <Route path='financial' component={UtilityUFMFinancial} onEnter={auth} />
                        <Route path='inquiry' component={UtilityUFMInquiry} onEnter={auth} />
                    </Route>
                </Route>
                <Route path='transaction'>
                    <Route path='deal_btsu'>
                        <Route path='purchase'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                        <Route path='sale'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                    </Route>
                    <Route path='deal_forex'>
                        <Route path='purchase'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                        <Route path='sale'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                    </Route>
                    <Route path='deal_tmu'>
                        <Route path='purchase'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                        <Route path='sale'>
                            <Route path='acceptance_settlement_mode_codes' component={AcceptanceSettlementModeCodes} onEnter={auth} />
                            <Route path='data_entry' component={DataEntry} onEnter={auth} />
                            <Route path='final_update_cas' component={FinalUpdateCAS} onEnter={auth} />
                            <Route path='final_update_cas/:ref_no' component={FinalUpdateCASDataEntry} onEnter={auth} />
                            <Route path='final_update_sr' component={FinalUpdateSR} onEnter={auth} />
                            <Route path='final_update_sr/:ref_no' component={FinalUpdateSRDataEntry} onEnter={auth} />
                            <Route path='final_update_fo' component={FinalUpdateFO} onEnter={auth} />
                            <Route path='final_update_fo/:ref_no' component={FinalUpdateFODataEntry} onEnter={auth} />
                            <Route path='final_update_mc' component={FinalUpdateMC} onEnter={auth} />
                            <Route path='final_update_mc/:ref_no' component={FinalUpdateMCDataEntry} onEnter={auth} />
                            <Route path='invisible_code_description' component={InvisibleCodeDescription} onEnter={auth} />
                        </Route>
                    </Route>
                </Route>
                <Route path='reports'>
                    <Route path='accepted_tc'>
                        <Route path='btsu' component={AcceptedTCReports} onEnter={auth} />
                        <Route path='forex' component={AcceptedTCReports} onEnter={auth} />
                        <Route path='tmu' component={AcceptedTCReports} onEnter={auth} />
                    </Route>
                    <Route path='cancelled_transactions'>
                        <Route path='btsu'>
                            <Route path='purchase' component={CancelledTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={CancelledTransactionsReports} onEnter={auth} />
                        </Route>
                        <Route path='forex'>
                            <Route path='purchase' component={CancelledTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={CancelledTransactionsReports} onEnter={auth} />
                        </Route>
                        <Route path='tmu'>
                            <Route path='purchase' component={CancelledTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={CancelledTransactionsReports} onEnter={auth} />
                        </Route>
                    </Route>
                    <Route path='daily_summary_of_transactions'>
                        <Route path='btsu'>
                            <Route path='purchase' component={DailySummaryofTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={DailySummaryofTransactionsReports} onEnter={auth} />
                        </Route>
                        <Route path='forex'>
                            <Route path='purchase' component={DailySummaryofTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={DailySummaryofTransactionsReports} onEnter={auth} />
                        </Route>
                        <Route path='tmu'>
                            <Route path='purchase' component={DailySummaryofTransactionsReports} onEnter={auth} />
                            <Route path='sale' component={DailySummaryofTransactionsReports} onEnter={auth} />
                        </Route>
                    </Route>
                    <Route path='issued_mc'>
                        <Route path='btsu' component={IssuedMCReports} onEnter={auth} />
                        <Route path='forex' component={IssuedMCReports} onEnter={auth} />
                        <Route path='tmu' component={IssuedMCReports} onEnter={auth} />
                    </Route>
                </Route>
                <Route path='inquiry'>
                    <Route path='accepted_tc'>
                        <Route path='btsu' component={AcceptedTC} onEnter={auth} />
                        <Route path='forex' component={AcceptedTC} onEnter={auth} />
                        <Route path='tmu' component={AcceptedTC} onEnter={auth} />
                    </Route>
                    <Route path='bulletin_board'>
                        <Route path='btsu' component={BulletinBoard} onEnter={auth} />
                        <Route path='forex' component={BulletinBoard} onEnter={auth} />
                        <Route path='tmu' component={BulletinBoard} onEnter={auth} />
                    </Route>
                    <Route path='rates'>
                        <Route path='btsu' component={RateInquiry} onEnter={auth} />
                        <Route path='forex' component={RateInquiry} onEnter={auth} />
                        <Route path='tmu' component={RateInquiry} onEnter={auth} />
                    </Route>
                    <Route path='income'>
                        <Route path='btsu' component={IncomeInquiry} onEnter={auth} />
                        <Route path='forex' component={IncomeInquiry} onEnter={auth} />
                        <Route path='tmu' component={IncomeInquiry} onEnter={auth} />
                    </Route>
                    <Route path='client_historical_records'>
                        <Route path='purchase'>
                            <IndexRoute component={ClientsHistoricalRecords} onEnter={auth} />
                            <Route path=':client_id' component={DetailRecord} onEnter={auth} />
                        </Route>
                        <Route path='sale'>
                            <IndexRoute component={ClientsHistoricalRecords} onEnter={auth} />
                            <Route path=':client_id' component={DetailRecord} onEnter={auth} />
                        </Route>
                    </Route>
                    <Route path='invisible_codes'>
                        <Route path='btsu' component={InvisibleCodes} onEnter={auth} />
                        <Route path='forex' component={InvisibleCodes} onEnter={auth} />
                        <Route path='tmu' component={InvisibleCodes} onEnter={auth} />
                    </Route>
                    <Route path='issued_mcs'>
                        <Route path='btsu' component={IssuedMCs} onEnter={auth} />
                        <Route path='forex' component={IssuedMCs} onEnter={auth} />
                        <Route path='tmu' component={IssuedMCs} onEnter={auth} />
                    </Route>
                    <Route path='purchase'>
                        <Route path=':category/:inquiry' component={Inquiry} onEnter={auth} />
                        <Route path=':category/:inquiry/:ref_no' component={InquiryDataEntry} onEnter={auth} />
                    </Route>
                    <Route path='sale'>
                        <Route path=':category/:inquiry' component={Inquiry} onEnter={auth} />
                        <Route path=':category/:inquiry/:ref_no' component={InquiryDataEntry} onEnter={auth} />
                    </Route>
                </Route>
            </Route>
            <Route path='login' component={Login} onEnter={auth}/>
            <Redirect from="*" to="main" />
        </Route>
    )
};
