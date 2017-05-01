
'use strict';

var ajax = require('../ajax');
var config = require('../config');
var AppConstants = require('../AppConstants');


exports.getByCode = function (trCode, success, fail) {
    return ajax('GET', config.backend_url + '/sys-ref?tCode='+trCode, null, success, fail);
}

// SYS REF ALL
exports.sysref_all = function (data, success, fail) {
   	return ajax('GET', config.backend_url + '/sys-ref/all', JSON.stringify(data), success, fail);
}
exports.sysref_get = function (data, success, fail) {
   	return ajax('GET', config.backend_url + '/sys-ref', data, success, fail);
}

