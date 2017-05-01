'use strict';

var _ = require('lodash');

module.exports = function (method, url, data, success, fail, addl_args) {
    var ajax_params = {
        url: url,
        method: method,
        dataType: 'json',
        data: data,
        contentType: 'application/json',
        async: false
    };

    if (addl_args) {
        ajax_params = _.assign(ajax_params, addl_args);
    }
    var body = null;

    $.ajax(ajax_params).done(function(data) {
        body = data;
    });
    return body;
};
