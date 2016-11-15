// Copyright 2015 - 2016 Square Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*jshint -W117 */
"use strict";


var module = angular.module("main", ["ngMaterial", "ngMessages", "ngSanitize", "LocalStorageModule", "hljs", "ui.ace"])
  .config(function ($mdThemingProvider) {
    $mdThemingProvider.theme('default')
      .primaryPalette('green');
  });

module.config(function ($locationProvider) {
  $locationProvider.html5Mode(true);
});

module.config(function (localStorageServiceProvider) {
  localStorageServiceProvider.setPrefix('mqe');
});

module.config(['$compileProvider', function ($compileProvider) {
  $compileProvider.debugInfoEnabled(false);
}]);

module.controller("MainController", function (
  $http,
  $scope
) {
   $scope.searchText = ""
   $scope.essResults = [];
   $scope.onSubmit = function() {
    console.log("Submit created", $scope.searchText);
    var query = {
      "query": {
    "query_string" : {
        "default_field" : "content",
        "query" : $scope.searchText
    } },
        "highlight": { "fields": { "content": {}, "methods": {} } }
    };

    var request = $http.post("http://localhost:9200/codesearch/_search", query).success(function (data, status, headers, config) {
      $scope.essResults = data;
    }).error(function (data, status, headers, config) {
      console.log("Useless Error Message!");
    });
   };
 });
