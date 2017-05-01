'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

// TRANSATION MONITORING
exports.transaction_monitoring = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('GET', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('GET', config.backend_url + '/maintenance/transaction-monitoring', JSON.stringify(data), success, fail);
 	}
}
exports.transaction_monitoring_process = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('POST', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('POST', config.backend_url + '/maintenance/transaction-monitoring/process', JSON.stringify(data), success, fail);
 	}
}


//	VALID CURRENCY
exports.valid_currency_list = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('GET', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('GET', config.backend_url + '/maintenance/valid-currencies/list', JSON.stringify(data), success, fail);
 	}
}
exports.valid_currency_add = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('POST', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('POST', config.backend_url + '/maintenance/valid-currencies/encode', JSON.stringify(data), success, fail);
 	}
}
exports.valid_currency_modify = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('PUT', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('PUT', config.backend_url + '/maintenance/valid-currencies/encode', JSON.stringify(data), success, fail);
 	}
}
exports.valid_currency_del = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('DEL', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('DEL', config.backend_url + '/maintenance/valid-currencies/encode', JSON.stringify(data), success, fail);
 	}
}


//	APPLICATION CODE
exports.appcode_list = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/application-code/list', JSON.stringify(data), success, fail);
}

exports.appcode_encode = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/application-code/encode', JSON.stringify(data), success, fail);
}


//	TRADING UNIT MAINTENANCE
exports.trading_unit_get = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/trading-unit', data, success, fail);
}
exports.trading_unit_add = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/trading-unit/encode', JSON.stringify(data), success, fail);
}
exports.trading_unit_modify = function (data, success, fail) {
    return ajax('PUT', config.backend_url + '/maintenance/trading-unit/encode', JSON.stringify(data), success, fail);
}
exports.trading_unit_delete = function (data, success, fail) {
    return ajax('DELETE', config.backend_url + '/maintenance/trading-unit/encode', JSON.stringify(data), success, fail);
}
exports.trading_unit_list = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/trading-unit/list', JSON.stringify(data), success, fail);
}


//	TRANSACTING UNIT MAINTENANCE
exports.transacting_unit_get = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/transacting-unit', data, success, fail);
}
exports.transacting_unit_add = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/transacting-unit/encode', JSON.stringify(data), success, fail);
}
exports.transacting_unit_delete = function (data, success, fail) {
    return ajax('DELETE', config.backend_url + '/maintenance/transacting-unit/encode', JSON.stringify(data), success, fail);
}
exports.transacting_unit_list = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/transacting-unit/list', data, success, fail);
}

// ACCEPTANCE/SETTLEMENT MODE
exports.acceptance_settlement_list = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/acceptance-settlement/list', data, success, fail);
}
exports.acceptance_settlement_modify = function (data, success, fail) {
    return ajax('PUT', config.backend_url + '/maintenance/acceptance-settlement/encode', JSON.stringify(data), success, fail);
}
exports.acceptance_settlement_add = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/acceptance-settlement/encode', JSON.stringify(data), success, fail);
}

// APPROVING AUTHORITY LIMIT

exports.authority_limit_list =  function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/approving-authority-limit/list', data, success, fail);
}

exports.authority_limit_encode = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/approving-authority-limit/encode', JSON.stringify(data), success, fail);
}

// CUT-OFF TIME AND TRADER OVERRIDE CHECK

exports.cutoff_check_post =  function (data, success, fail) {
    return ajax('POST', config.backend_url + '/sysad/cutoff-time/override-check', JSON.stringify(data), success, fail);
}

exports.cutoff_check =  function (trdrFi, success, fail) {
	if (trdrFi === null) {
		trdrFi = "";
	}
    return ajax('GET', config.backend_url + '/sysad/cutoff-time/override-check?trdrFi='+trdrFi, null, success, fail);
}

exports.cutoff_squaring_list =  function (data, success, fail) {
    return ajax('GET', config.backend_url + '/sysad/cutoff-time/regular-squaring', data, success, fail);
}

exports.cutoff_squaring_post =  function (data, success, fail) {
    return ajax('POST', config.backend_url + '/sysad/cutoff-time/regular-squaring', JSON.stringify(data), success, fail);
}


// INTRADAY POSITION LIMITS

exports.intraday_limits_list =  function (data, success, fail) {
    return ajax('GET', config.backend_url + '/sysad/intraday-position-limits', data, success, fail);
}
exports.intraday_limits_add =  function (data, success, fail) {
    return ajax('POST', config.backend_url + '/sysad/intraday-position-limits', JSON.stringify(data), success, fail);
}
exports.intraday_limits_del =  function (data, success, fail) {
    return ajax('DELETE', config.backend_url + '/sysad/intraday-position-limits', JSON.stringify(data), success, fail);
}
exports.intraday_limits_modify =  function (data, success, fail) {
    return ajax('PUT', config.backend_url + '/sysad/intraday-position-limits', JSON.stringify(data), success, fail);
}
// LOA SIGNATORIES

exports.loa_signatories_list =  function (trdrFi, success, fail) {
	if (trdrFi === null) {
		trdrFi = " ";
	}
    return ajax('GET', config.backend_url + '/maintenance/loa-signatories/list?trdrFi='+trdrFi, null, success, fail);
}

exports.loa_signatories_encode = function (trdrFi, data, success, fail) {
	if (trdrFi === null) {
		trdrFi = " ";
	}
	console.log(config.backend_url + '/maintenance/loa-signatories/encode?trdrFi='+trdrFi);
    return ajax('POST', config.backend_url + '/maintenance/loa-signatories/encode?trdrFi='+trdrFi, JSON.stringify(data), success, fail);
}

// BULLETIN BOARD

exports.bulletin_board_get = function (trdrFi, success, fail) {
	if (trdrFi === null) {
		trdrFi = " ";
	}
    return ajax('GET', config.backend_url + '/maintenance/bulletin-board?trdrFi='+trdrFi, null, success, fail);
}

exports.bulletin_board_encode = function (trdrFi, spclMsg, data, success, fail) {
	if (trdrFi === null) {
		trdrFi = " ";
	}
	if (spclMsg === null) {
		trdrFi = " ";
	}

    return ajax('POST', config.backend_url + '/maintenance/bulletin-board?trdrFi='+trdrFi+
    						'&spclMsg='+spclMsg+''
    	, JSON.stringify(data), success, fail);
}

//TRANSACTION AMOUNT SETTINGS
exports.transaction_amount_all = function(data, success, fail){
	return ajax('GET', config.backend_url + '/sysad/transaction-amount-settings/all', JSON.stringify(data), success, fail);
}
exports.transaction_amount_put = function(data, success,fail){
	return ajax('PUT', config.backend_url + '/sysad/transaction-amount-settings', JSON.stringify(data), success, fail);
}

exports.get_options = function (  success, fail) {
	  return ajax('GET', config.backend_url + '/sys-ref?tCode=0115', "", success, fail);
}

exports.get_docstamp_values = function (data, success, fail) {
		console.log("insdide ghet");
	  return ajax('GET', config.backend_url + '/sysad/doc-stamp-postage-commission?mode_code='+data.modeCode+'&trdr_fi=2', "", success, fail);
}

exports.post_docstamp = function (data, success, fail) {
		
		console.log("DFIHGIDHDF;LKSDF;LIJDB;LKJSEDFB;LKDNFBG;LKNVBL;KNERASD;LKN");
		console.log(data);
	  return ajax('PUT', config.backend_url + '/sysad/doc-stamp-postage-commission', JSON.stringify(data), success, fail);
}
