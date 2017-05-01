
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.prefrate_load = function (data, success, fail) {
	if(AppConstants.MOCK_DATA){
		return ajax('GET', 'data.json', JSON.stringify(data), success, fail);
	}else{
    	return ajax('GET', config.backend_url + '/maintenance/transaction-monitoring', JSON.stringify(data), success, fail);
 	}
}

//	REFERENCE RATE - VIEW
exports.reference_rate_view = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/ref-rate', data, success, fail);
}

//	REFERENCE RATE - UPDATE
exports.reference_rate_update = function (data, success, fail) {
    return ajax('POST', config.backend_url + '/maintenance/ref-rate/process', JSON.stringify(data), success, fail);
}

// BOARD RATES
exports.board_rates_get = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/board-rate', data, success, fail);
}
exports.board_rates_process = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/board-rate/process', data, success, fail);
}

// OTC RATES
exports.otc_rates_get = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/otc-rate/rate', data, success, fail);
}
exports.otc_rates_process = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/otc-rate/rate/process', data, success, fail);
}

// THIRDS - REF RATE - USD
exports.ref_rate_usd = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/ref-rate-usd/list', data, success, fail);
}
exports.ref_rate_php = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/ref-rate-php/list', data, success, fail);
}

// USD/PHP - BEST BUYING AND SELLLING
exports.best_buy_sell = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/maintenance/best-buy-sell', data, success, fail);
}