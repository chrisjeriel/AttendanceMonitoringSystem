'use strict';

exports.check_store = function (cb) {
    var err = false;

    if (!store.enabled) {
        alert('Local storage is not supported by your browser. Please disable "Private Mode", or upgrade to a modern browser.');
        err = true;
    }

    return cb(err);
}
