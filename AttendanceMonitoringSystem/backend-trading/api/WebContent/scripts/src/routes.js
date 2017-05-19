var React = require('react');
var Router = require('react-router');
var Route = Router.Route;
var IndexRoute = Router.IndexRoute;
/**
 * Views
 */
var Login = require('./views/Login');
var Password = require('./views/Password');

var CBGFXTrading = require('./app/CBGFXTrading');
var Menu = require('./components/NavigationMenu');


// Maintenance -> Define System Controls
var TransactionMonitoring = require('./views/Maintenance/DefineSystemControls/TransactionMonitoring');
var TradingUnitMaintenance = require('./views/Maintenance/DefineSystemControls/TradingUnitMaintenance');
var TransactingUnitMaintenance = require('./views/Maintenance/DefineSystemControls/TransactingUnitMaintenance');
var ValidCurrency = require('./views/Maintenance/DefineSystemControls/ValidCurrency');
var TransactionAmountSetting = require('./views/Maintenance/DefineSystemControls/TransactionAmountSetting');
var MtsCodes = require('./views/Maintenance/DefineSystemControls/MtsCodes');
var LoaSignatures = require('./views/Maintenance/DefineSystemControls/LoaSignatures');
var InvisibleCodes = require('./views/Maintenance/DefineSystemControls/InvisibleCodes');
var IntradayPositionLimits = require('./views/Maintenance/DefineSystemControls/IntradayPositionLimits');
var DocStampsPostageCommission = require('./views/Maintenance/DefineSystemControls/DocStampsPostageCommission');
var CutOffTimeRegularSquaring = require('./views/Maintenance/DefineSystemControls/CutOffTimeRegularSquaring');
var CutOffTimeTraderOverrideCheck = require('./views/Maintenance/DefineSystemControls/CutOffTimeTraderOverrideCheck');
var CurrencyPairAcceptanceSettlementMode = require('./views/Maintenance/DefineSystemControls/CurrencyPairAcceptanceSettlementMode');
var BulletinBoard = require('./views/Maintenance/DefineSystemControls/BulletinBoard');
var BpiBfbSettlementAccount = require('./views/Maintenance/DefineSystemControls/BpiBfbSettlementAccount');
var ApprovingAuthorityLimit = require('./views/Maintenance/DefineSystemControls/ApprovingAuthorityLimit');
var ApplicationCode = require('./views/Maintenance/DefineSystemControls/ApplicationCode');
var AcceptanceSettlementMode = require('./views/Maintenance/DefineSystemControls/AcceptanceSettlementMode');

//  Maintenance -> Define Exchange Rate

// var AddDeleteSpread  = require('./views/Maintenance/DefineExchangeRate/AddDeleteSpread');
// var LockUnlockRates  = require('./views/Maintenance/DefineExchangeRate/LockUnlockRates');
// var PrintRatesForTheDay  = require('./views/Maintenance/DefineExchangeRate/BtsuInitializationBid');


// Maintenance -> Define Exchange Rate -> Thirds

//BuyingSellingRatesForThirds

var BtsuInitializationBid  = require('./views/Maintenance/DefineExchangeRate/Thirds/BtsuInitializationBid');
var BuyingSellingRatesForThirds  = require('./views/Maintenance/DefineExchangeRate/Thirds/BuyingSellingSpreadsThirds/BuyingSellingRatesForThirds');
 var ReferenceRateVS  = require('./views/Maintenance/DefineExchangeRate/Thirds/ReferenceRateVS');
// var ReferenceRateUsd  = require('./views/Maintenance/DefineExchangeRate/Thirds/ReferenceRateUsd');


// Maintenance -> Define Exchange Rate -> UsdPhp
var OtcRates = require('./views/Maintenance/DefineExchangeRate/UsdPhp/OtcRates');
var BoardRates = require('./views/Maintenance/DefineExchangeRate/UsdPhp/BoardRates');
var PreferredClientRates = require('./views/Maintenance/DefineExchangeRate/UsdPhp/PreferredClientRates');
var TieredRates = require('./views/Maintenance/DefineExchangeRate/UsdPhp/TieredRates');
var UsVisaFee = require('./views/Maintenance/DefineExchangeRate/UsdPhp/UsVisaFee');
var ReferenceRate = require('./views/Maintenance/DefineExchangeRate/UsdPhp/ReferenceRate');
 var BestBuyingSelling = require('./views/Maintenance/DefineExchangeRate/UsdPhp/BestBuyingSelling');

// Maintenance -> User Access Maintenance
var UserAccessMaintenance = require('./views/Maintenance/UserAccessMaintenance/UserAccessMaintenance');


// Maintenance -> User File Maintenance
var UserFileMaintenance = require('./views/Maintenance/UserFileMaintenance/UserFileMaintenance');

// Maintenance -> Refresh Reference Tables
// var RefreshReferenceTable = require('./views/Maintenance/RefreshReferenceTable');


// Authorization -> Purchase or Sale
var AuthPS = require('./views/Authorization/PurchaseSale');

// Inquiry

// Fx Position
var FxPositionSquaring = require('./views/FxPosition/FxPositionSquaring');
var FxPositionWithAverageCost = require('./views/FxPosition/FxPositionWithAverageCost');
var EndOfDaySquaringRate = require('./views/FxPosition/EndOfDaySquaringRates');


// Reports -> Checks
var Checks = require('./views/Reports/Checks/Checks');

// Reports -> Purchase/Sale
var ReportsPS = require('./views/Reports/PurchaseSale');

// Special Squaring
var SpecialSquaringDataEntry = require('./views/SpecialSquaring/DataEntry');
var SpecialSquaringFinalUpdate = require('./views/SpecialSquaring/FinalUpdate');
var SpecialSquaringReports   = require('./views/SpecialSquaring/Report');
var SpecialSquaringTreasuryApproval = require('./views/SpecialSquaring/TreasuryApproval');
var SpecialSquaringInquiry = require('./views/SpecialSquaring/Inquiry');

// Interbank
var InterbankDataEntry = require('./views/Interbank/DataEntry');
var DefineInterbankFile = require('./views/Interbank/DefineInterbankFile');
var InterbankErrorCorrect = require('./views/Interbank/ErrorCorrect');
var Inquiry = require('./views/Interbank/Inquiry');
var Loa = require('./views/Interbank/Loa');

// Interbank -> Shared File
var Details = require('./views/Interbank/SharedFile/Details');

var AttendanceList = require('./views/Attendance/List');
var AttendanceKiosk = require('./views/Attendance/Kiosk');

var InquiryMembers = require('./views/Inquiry/MembersList');
var InquirySchedules = require('./views/Inquiry/SchedulesList');
var InquiryAttendances = require('./views/Inquiry/AttendancesList');


exports.makeMainRoutes = function(auth) {

	return (
		<Route path='/'>
			<IndexRoute component={Login} />
			<Route path='/menu' component={CBGFXTrading} onEnter={auth}>
				<Route path='attendance'>
					<Route path='kiosk' component={AttendanceKiosk} />
					<Route path='list' component={AttendanceList} />
				</Route>
				<Route path='inquiry'>
					<Route path='members' component={InquiryMembers} />
					<Route path='schedules' component={InquirySchedules} />
					<Route path='attendances' component={InquiryAttendances} />
				</Route>
			</Route>
			<Route path='/login' component={Login} onEnter={auth} />
			<Route path='/password' component={Password} />

		</Route>
	)
};

module.exports = exports;
