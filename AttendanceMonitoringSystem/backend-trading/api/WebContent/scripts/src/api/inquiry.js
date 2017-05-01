
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');

exports.purchasesale_process = function (data, success, fail) {
    return ajax('GET', config.backend_url + '/inquiry/purchase', data, success, fail);
}

exports.purchase_ref = function (data, success, fail) {
    console.log("PARAMS: " + JSON.stringify(data));
    return ajax('GET', config.backend_url + '/inquiry/purchase/ref', data, success, fail);
}
