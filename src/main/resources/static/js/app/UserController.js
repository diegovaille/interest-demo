'use strict'
var module = angular.module('demo.controllers', []);

module.controller("UserController", [ "$scope", "UserService",
		function($scope, UserService) {
			$scope.options = [ 'A', 'B', 'C' ];

			$scope.userDto = {
				clientName : null,
				creditLimit : null,
				riskType : null,
				interestRate : null
			};

			UserService.getAllUsers().then(function(value) {
				$scope.allUsers = value.data;
				console.log(value.data);
			}, function(reason) {
				console.log("error occured");
			}, function(value) {
				console.log("no callback");
			});

			$scope.saveUser = function() {

				UserService.saveUser($scope.userDto).then(function() {
					console.log("works");
					UserService.getAllUsers().then(function(value) {
						$scope.allUsers = value.data;
						console.log(value.data);
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.userDto = {
						clientName : null,
						creditLimit : null,
						riskType : null,
						interestRate : null
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);