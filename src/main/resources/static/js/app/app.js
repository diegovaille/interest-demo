'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.controllers',
		'demo.services', 'rw.moneymask', 'ngMessages' ]);
demoApp.constant("CONSTANTS", {
	getAllUsers : "/user",
	saveUserCreditRisk : "/user/credit-risk"
});

demoApp.filter('percentage', [ '$filter', function($filter) {
	return function(input, decimals) {
		return $filter('number')(input, decimals) + '%';
	};
} ]);