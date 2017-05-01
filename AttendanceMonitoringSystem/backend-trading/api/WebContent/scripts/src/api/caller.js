
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');


exports.APICaller = function (mode, params, url) {
    return ajax(mode, config.backend_url + url, JSON.stringify(params));
}

exports.asyncCall = function (trCode, params, url) {
    return ajax(mode, config.backend_url + '/sys-ref?tCode='+trCode, null, success, fail);
}