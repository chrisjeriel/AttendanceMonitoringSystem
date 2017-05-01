'use strict';

module.exports = {
    auth: require('./auth'),
    transaction_monitoring: require('./transaction_monitoring'),
    valid_currency: require('./valid_currency'),
    trading_unit_maintenance: require('./trading_unit_maintenance'),
    transacting_unit_maintenance: require('./transacting_unit_maintenance'),
    acceptance_settlement: require('./acceptance_settlement'),
    application_code:require('./application_code'),
    login: require('./login'),
    maintenance_defsyscontrols:require('./maintenance_defsyscontrols'),
    maintenance_exchangerate:require('./maintenance_exchangerate'),
    sys_ref:require('./sys_ref'),
    caller:require('./caller'),
    interbank: require('./interbank')
}
