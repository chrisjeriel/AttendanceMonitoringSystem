'use strict';

var React = require('react');
var Link = require('react-router').Link;
var AppBody = require('../components/AppBody');
var Auth = require('../auth/Auth');

var BPMenu = React.createClass({
    contextTypes: {
        router: React.PropTypes.object
    },

    getInitialState: function () {
        var listener = new window.keypress.Listener();
        return ({
            menu: -1,
            mainmenuShown: false,
            submenuLevel: -1,
            keyListener: listener
        });
    },

    componentDidMount: function (){
        var self = this;

        this.registerListener(0);

        $('.main-menu').click(function (event) {
            event.preventDefault();
            self.showMainMenu(this);
        });

        $('.sub-menu').click(function (event){
            var href = this.getAttribute('href');

            if (href && href !== '#') {
                console.log(href);
                self.resetState();
                return true;
            }

            event.preventDefault();
            self.showSubMenu(this);
        });

        //removes keylistener on focus of input.
        $('input').on('blur', function () {
            self.registerListener(self.state.menu + 1);
        })
        .on('focus', function () {
            self.unregisterListener();
        });
    },

    componentWillUnmount: function () {
        this.state.keyListener.destroy();
        $(document).unbind("keyup");
        this.unregisterListener();
    },

    resetState: function(){
        $('div.app-body').find('.dropdown-menu').css('display', 'none');
        this.registerListener(0);
        this.setState({
            menu: -1,
            mainmenuShown: false,
            submenuLevel: -1
        })
    },

    showMainMenu: function (node) {
        var child = $(node).parent().find('.dropdown-menu:first'),
            index = +$(node).data('menu'),
            menu = this.state.menu,
            mainmenuShown = this.state.mainmenuShown,
            registerListener = this.registerListener;

        if (typeof(node) === 'object') {
            if (mainmenuShown && menu == index) {
                this.resetState();
            }
            else {
                $(node).parent()
                    .parent()
                    .parent()
                    .parent()
                    .find('.dropdown-menu')
                    .css('display', 'none');

                registerListener(1);
                $(child).css('display', 'block');
                this.setState({
                    menu: index,
                    mainmenuShown: true,
                    submenuLevel: 0
                });
            }
        }
    },

    showSubMenu: function (obj) {
        var child = $(obj).parent().find('.dropdown-menu:first');

        if (child) {
            if (child.css('display') && child.css('display').toString() == 'none'){
                $(obj).parent()
                    .parent()
                    .find('.dropdown-menu')
                    .css('display', 'none');

                $(child).css('display', 'block');
            }
            else {
                $(child).css('display', 'none');
            }
        }
    },

    registerListener: function (index) {
        if (index == 0) {
            window.addEventListener('keyup', this.mainMenuKeyListener);
            window.removeEventListener('keyup', this.subMenuKeyListener);
        }
        else {
            window.removeEventListener('keyup', this.mainMenuKeyListener);
            window.addEventListener('keyup', this.subMenuKeyListener);
        }
    },

    unregisterListener: function () {
        window.removeEventListener('keyup', this.mainMenuKeyListener);
        window.removeEventListener('keyup', this.subMenuKeyListener);
    },

    mainMenuKeyListener: function (event) {
        var key = event.key.toLowerCase();

        if (event.target.nodeName.toLowerCase() === 'input') {
            return;
        }

        if (key === 'q') {
            return this.logout();
        }
        $('.main-menu[data-key="' + key + '"').click();
    },
    logout: function (event) {
        if (event) {
            event.preventDefault();
        }

        Auth.logout();
        this.context.router.push('/login');
    },
    subMenuKeyListener: function (event) {
        var self = this,
            key = event.key.toLowerCase(),
            menu = this.state.menu,
            submenuLevel = this.state.submenuLevel,
            key_listener,
            map,
            node,
            node_index;

        if (event.target.nodeName.toLowerCase() === 'input') {
            return;
        }

        if (submenuLevel === 0) {
            node = $('.sub-menu[data-menu="' + menu
                + '"][data-key="' + key
                + '"][data-level="' + submenuLevel
                + '"]');

            if (key === 'escape') {
                this.resetState();
            }
            else if (node.length) {
                node_index = node.data('index');

                this.setState({
                    submenuLevel: 1,
                    submenuIndex: node_index
                });
                node[0].click();
            }
        }
        else if (submenuLevel === 1) {
            node = $('.sub-menu[data-menu="' + menu
                + '"][data-key="' + key
                + '"][data-level="' + submenuLevel
                + '"][data-parent_index="' + this.state.submenuIndex
                + '"]');

            if (key === 'escape') {
                $('.sub-menu[data-menu="' + menu + '"][data-index="' + this.state.submenuIndex + '"]')
                    .parent()
                    .parent()
                    .find('.dropdown-menu')
                    .css('display', 'none');

                this.setState({submenuLevel: 0});
            }
            else if (node.length) {
                node_index = node.data('index');
                this.setState({
                    submenuLevel: 2,
                    submenuPrevIndex: this.state.submenuIndex,
                    submenuIndex: node_index
                });

                node[0].click();
            }
        }
        else if (submenuLevel === 2) {
            //link_id = menu + key + prev_parent_index + parent_index
            node = $('.sub-menu[data-link_id="' + menu
                + key
                + this.state.submenuPrevIndex
                + this.state.submenuIndex
                + '"]');

            if (key === 'escape') {
                $('.sub-menu[data-menu="' + menu
                    + '"][data-index="' + this.state.submenuIndex
                    + '"][data-level="1"]')
                    .parent()
                    .parent()
                    .find('.dropdown-menu')
                    .css('display', 'none');

                this.setState({
                    submenuLevel: 1,
                    submenuIndex: this.state.submenuPrevIndex
                });
            }
            else if (node.length) {
                node[0].click();
            }
        }
    },
    render: function () {
        return (
            <AppBody>
                <div className='row'>
                    <div className='col-md-11 col-md-offset-1'>
                        <ul className='nav nav-pills nav-justified'>
                            <li className="dropdown">
                                <button type='button'
                                    className='btn btn-default main-menu'
                                    data-menu='0'
                                    data-key='u'>
                                    <mark className = "bgcolor"><b>U</b></mark>tility
                                </button>
                                <ul className="dropdown-menu">
                                    <li>
                                        <Link to='/main/utility/user_file_maintenance'
                                            className='sub-menu'
                                            data-menu='0'
                                            data-key='u'
                                            data-index='0'
                                            data-level='0'>
                                            User File Maintenance
                                        </Link>
                                    </li>
                                    <li>
                                        <Link to='/main'
                                            className='sub-menu'
                                            data-menu='0'
                                            data-key='c'
                                            data-index='1'
                                            data-level='0'>
                                            Cash Flow Data Entry
                                        </Link>
                                    </li>
                                    <li>
                                        <Link to='/main/utility/printing_setup'
                                            className='sub-menu'
                                            data-menu='0'
                                            data-key='p'
                                            data-index='2'
                                            data-level='0'>
                                            <mark className = "bgcolor"><b>P</b></mark>rinting Setup
                                        </Link>
                                    </li>
                                    <li>
                                        <Link to='/main/utility/download_ref_file'
                                            className='sub-menu'
                                            data-menu='0'
                                            data-key='d'
                                            data-index='3'
                                            data-level='0'>
                                            <mark className = "bgcolor"><b>D</b></mark>ownload Reference Files
                                        </Link>
                                    </li>
                                </ul>
                            </li>
                            <li className="dropdown">
                                <button type='button'
                                    className='btn btn-default main-menu'
                                    data-menu='1'
                                    data-key='t'>
                                    <mark className = "bgcolor"><b>T</b></mark>ransaction
                                </button>
                                <ul className="dropdown-menu">
                                    <li className = "dropdown-submenu">
                                        <a className='sub-menu'
                                            data-menu='1'
                                            data-key='f'
                                            data-level='0'
                                            data-index='0'
                                            href="#">
                                                Deal w/ <mark className = "bgcolor"><b>F</b></mark>OREX
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='p'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>P</b></mark>urchase
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_forex/purchase/data_entry' data-link_id='1d00' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/purchase/final_update_sr' data-link_id='1s00' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/purchase/final_update_fo' data-link_id='1f00' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/purchase/final_update_cas' data-link_id='1c00' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/purchase/final_update_mc' data-link_id='1m00' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>M</b></mark>C Settlement</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='s'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>S</b></mark>ale
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_forex/sale/data_entry' data-link_id='1d01' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/sale/final_update_sr' data-link_id='1s01' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/sale/final_update_fo' data-link_id='1f01' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_forex/sale/final_update_cas' data-link_id='1c01' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className = "dropdown-submenu">
                                        <a className='sub-menu'
                                            data-menu='1'
                                            data-key='b'
                                            data-level='0'
                                            data-index='1'
                                            href="#">
                                            Deal w/ <mark className = "bgcolor"><b>B</b></mark>TSU
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='p'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>P</b></mark>urchase
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_btsu/purchase/data_entry' data-link_id='1d10' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/purchase/final_update_sr' data-link_id='1s10' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/purchase/final_update_fo' data-link_id='1f10' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/purchase/final_update_cas' data-link_id='1c10' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/purchase/final_update_mc' data-link_id='1m10' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>M</b></mark>C Settlement</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='s'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>S</b></mark>ale
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_btsu/sale/data_entry' data-link_id='1d11' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/sale/final_update_sr' className='sub-menu' data-link_id='1s11'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/sale/final_update_fo' data-link_id='1f11' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_btsu/sale/final_update_cas' data-link_id='1c11' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className = "dropdown-submenu">
                                        <a className='sub-menu'
                                            data-menu='1'
                                            data-key='t'
                                            data-level='0'
                                            data-index='2'
                                            href="#">
                                            Deal w/ <mark className = "bgcolor"><b>T</b></mark>MU
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='p'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>P</b></mark>urchase
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_tmu/purchase/data_entry' data-link_id='1d20' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/purchase/final_update_sr' data-link_id='1s20' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/purchase/final_update_fo' data-link_id='1f20' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/purchase/final_update_cas' data-link_id='1c20' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/purchase/final_update_mc' data-link_id='1m20' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>M</b></mark>C Settlement</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='1'
                                                    data-key='s'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>S</b></mark>ale
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/transaction/deal_tmu/sale/data_entry' data-link_id='1d21' className='sub-menu'><mark className = "bgcolor"><b>D</b></mark>ata Entry</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/sale/final_update_sr' data-link_id='1s21' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>S</b></mark>pecial Request</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/sale/final_update_fo' data-link_id='1f21' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>F</b></mark>OREX Override</Link></li>
                                                    <li><Link to='/main/transaction/deal_tmu/sale/final_update_cas' data-link_id='1c21' className='sub-menu'>Final Update - <mark className = "bgcolor"><b>C</b></mark>ash Accept/Settle</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li className="dropdown">
                                <button type='button'
                                    className='btn btn-default main-menu'
                                    data-menu='2'
                                    data-key='i'>
                                    <mark className="bgcolor"><b>I</b></mark>nquiries
                                </button>
                                <ul className="dropdown-menu">
                                    <li className="dropdown-submenu">
                                        <a data-menu='2'
                                            data-key='p'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='0'
                                            href="#">
                                            <mark className = "bgcolor"><b>P</b></mark>urchase
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu' href="#">
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/purchase/forex/today' data-link_id='2t00' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/purchase/forex/error' data-link_id='2e00' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu' href="#">
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/purchase/btsu/today' data-link_id='2t01' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/purchase/btsu/error' data-link_id='2e01' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/purchase/tmu/today' data-link_id='2t02' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/purchase/tmu/error' data-link_id='2e02' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>

                                    <li className="dropdown-submenu">
                                        <a data-menu='2'
                                            data-key='s'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='1'
                                            href="#">
                                            <mark className = "bgcolor"><b>S</b></mark>ale
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/sale/forex/today' data-link_id='2t10' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/sale/forex/error' data-link_id='2e10' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/sale/btsu/today' data-link_id='2t11' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/sale/btsu/error' data-link_id='2e11' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/inquiry/sale/tmu/today' data-link_id='2t12' className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>oday's Transactions</Link></li>
                                                    <li><Link to='/main/inquiry/sale/tmu/error' data-link_id='2e12' className='sub-menu'><mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='2'
                                            data-key='r'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='2'
                                            href="#">
                                            <mark className = "bgcolor"><b>R</b></mark>ates
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/inquiry/rates/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/inquiry/rates/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/inquiry/rates/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='2'
                                            data-key='i'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='3'
                                            href="#">
                                            <mark className = "bgcolor"><b>I</b></mark>ncome
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/inquiry/income/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/inquiry/income/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/inquiry/income/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='2'
                                            data-key='f'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='4'
                                            href="#">
                                            Cash Flow
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='4'
                                                    to='/main/inquiry/cash_flow/forex'
                                                    className='sub-menu'><mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='4'
                                                    to='/main/inquiry/cash_flow/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='4'
                                                    to='/main/inquiry/cash_flow/tmu'
                                                    className='sub-menu'><mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a  data-menu='2'
                                            data-key='a'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='5'
                                            href="#">
                                            <mark className = "bgcolor"><b>A</b></mark>ccepted TCs
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='5'
                                                    to='/main/inquiry/accepted_tc/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='5'
                                                    to='/main/inquiry/accepted_tc/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='5'
                                                    to='/main/inquiry/accepted_tc/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a  data-menu='2'
                                            data-key='n'
                                            data-level='0'
                                            data-index='6'
                                            className="sub-menu"
                                            href="#">
                                            I<mark className = "bgcolor"><b>n</b></mark>visible Codes
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='6'
                                                    to='/main/inquiry/invisible_codes/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='6'
                                                    to='/main/inquiry/invisible_codes/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='6'
                                                    to='/main/inquiry/invisible_codes/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a  data-menu='2'
                                            data-key='c'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='7'
                                            href="#">
                                            <mark className = "bgcolor"><b>C</b></mark>lients Historical Record
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='p'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='7'
                                                    to='/main/inquiry/client_historical_records/purchase'
                                                    className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='s'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='7'
                                                    to='/main/inquiry/client_historical_records/sale'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>S</b></mark>ale
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a  data-menu='2'
                                            data-key='u'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='8'
                                            href="#">
                                            Iss<mark className = "bgcolor"><b>u</b></mark>ed MCs
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='8'
                                                    to='/main/inquiry/issued_mcs/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='8'
                                                    to='/main/inquiry/issued_mcs/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='8'
                                                    to='/main/inquiry/issued_mcs/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a  data-menu='2'
                                            data-key='b'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='9'
                                            href="#">
                                            <mark className = "bgcolor"><b>B</b></mark>ulletin Board
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='9'
                                                    to='/main/inquiry/bulletin_board/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='9'
                                                    to='/main/inquiry/bulletin_board/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='2'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='9'
                                                    to='/main/inquiry/bulletin_board/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li className="dropdown">
                                <button type='button' className='btn btn-default main-menu' data-menu='3' data-key='r'>
                                    <mark className = "bgcolor"><b>R</b></mark>eports
                                </button>
                                <ul className="dropdown-menu">
                                    <li className="dropdown-submenu">
                                        <a data-menu='3'
                                            data-key='d'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='0'
                                            className="sub-menu"
                                            href="#">
                                            <mark className = "bgcolor"><b>D</b></mark>aily Summary of Transactions
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/forex/purchase' data-link_id='3p00' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/forex/sale' data-link_id='3s00' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/btsu/purchase' data-link_id='3p01' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/btsu/sale' data-link_id='3s01' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='0'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/tmu/purchase' data-link_id='3p02' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/daily_summary_of_transactions/tmu/sale' data-link_id='3s02' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='3'
                                            data-key='e'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='1'
                                            className="sub-menu"
                                            href="#">
                                            <mark className = "bgcolor"><b>E</b></mark>rror Corrected Transactions
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/cancelled_transactions/forex/purchase' data-link_id='3p10' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/cancelled_transactions/forex/sale' data-link_id='3s10' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/cancelled_transactions/btsu/purchase' data-link_id='3p11' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/cancelled_transactions/btsu/sale' data-link_id='3s11' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                            <li className = "dropdown-submenu">
                                                <a data-menu='3'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='1'
                                                    className='sub-menu'
                                                    href="#">
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </a>
                                                <ul className="dropdown-menu">
                                                    <li><Link to='/main/reports/cancelled_transactions/tmu/purchase' data-link_id='3p12' className='sub-menu'><mark className = "bgcolor"><b>P</b></mark>urchase</Link></li>
                                                    <li><Link to='/main/reports/cancelled_transactions/tmu/sale' data-link_id='3s12' className='sub-menu'><mark className = "bgcolor"><b>S</b></mark>ale</Link></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='3'
                                            data-key='a'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='2'
                                            className="sub-menu"
                                            href="#">
                                            <mark className = "bgcolor"><b>A</b></mark>ccepted TCs
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/reports/accepted_tc/forex'
                                                    className='sub-menu'><mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/reports/accepted_tc/btsu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='2'
                                                    to='/main/reports/accepted_tc/tmu'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                    <li className="dropdown-submenu">
                                        <a data-menu='3'
                                            data-key='i'
                                            data-level='0'
                                            className="sub-menu"
                                            data-index='3'
                                            className="sub-menu"
                                            href="#">
                                            <mark className = "bgcolor"><b>I</b></mark>ssued MCs
                                        </a>
                                        <ul className="dropdown-menu">
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='f'
                                                    data-index='0'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/reports/issued_mc/forex'
                                                    className='sub-menu'>
                                                    <mark className = "bgcolor"><b>F</b></mark>OREX
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='b'
                                                    data-index='1'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/reports/issued_mc/btsu'
                                                    className='sub-menu'><mark className = "bgcolor"><b>B</b></mark>TSU
                                                </Link>
                                            </li>
                                            <li>
                                                <Link data-menu='3'
                                                    data-key='t'
                                                    data-index='2'
                                                    data-level='1'
                                                    data-parent_index='3'
                                                    to='/main/reports/issued_mc/tmu'
                                                    className='sub-menu'><mark className = "bgcolor">
                                                    <b>T</b></mark>MU
                                                </Link>
                                            </li>
                                        </ul>
                                    </li>
                                </ul>
                            </li>
                            <li className="dropdown">
                                <button type='button' onClick={this.logout} className='btn btn-default main-menu' data-menu='4' data-key='q'>
                                    <mark className = "bgcolor"><b>Q</b></mark>uit
                                </button>
                            </li>
                        </ul>
                    </div>
                </div>
            </AppBody>
        );
    }
});

module.exports = BPMenu;
