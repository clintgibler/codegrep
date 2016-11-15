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


var module = angular.module("codesearchApp", ["ngMaterial", "ngMessages", "ngRoute", "ngSanitize", "LocalStorageModule", "hljs"])
  .config(function ($mdThemingProvider) {
    $mdThemingProvider.theme('default')
      .primaryPalette('blue-grey')
      .accentPalette('blue');
  });

module.service("searchService", function(
  $http,
  $location
){

  var _results;
  var _error;
  var _text = "";
  var _query = {};
  var _loading = false;
  this.loading = function() {
    return _loading;
  }

  var parseText = function(searchText) {
    var params = {
      "content": [],
      "highlight": ["content"]
    }
    var parts = searchText.split(/\s+/);
    _.each(parts, function (part) {
      var p = part.split(/:(.+)?/)
      if (p.length > 1) {
        if (!_.has(params, p[0])) {
          params[p[0]] = [];
        }
        params[p[0]].push(p[1]);
        params[p[0]] = _.uniq(params[p[0]]);
      }
      else {
        params.content.push(p[0]);
        params.content = _.uniq(params.content);
      }
    });
    return params;
  };

  this.getQuery = function(){
    return _query;
  }

  this.getResults = function(){
    return _results;
  };

  this.getText = function(){
    return _text;
  }
  // do a search - update location
  this.search = function (searchText) {
    _text = searchText;
    _loading = true;
    _results = {};
    var params = parseText(searchText);
    $http.get("/codesearch/code/_search?", { params: params }).success(function (data, status, headers, config) {
      _results = data;
      _loading = false;
    }).error(function (data, status, headers, config) {
      _error = data;
      _loading = false;
      console.log("Useless Error Message!");
    });
  };
  
});

module.controller("DetailsController", function($http, $scope, $routeParams){
  $scope.hit = {};
  $scope.loading = true;
  $http.get("/codesearch/code/" + $routeParams.documentId).success(function (data, status, headers, config) {
    $scope.loading = false;
    $scope.hit = data;
  });

});

module.directive('sourceCode', function($compile, $sanitize) {
  return {
    restrict: 'E',
    scope: {
      hit: '='
    },
    replace: true,
    link: function(scope, element) {
      function replaceWith(out, pos, target, replacement){
        return out.substr(0, pos) + out.substr(pos).replace(target, replacement); 
      }
      var format = function() {
        if (scope.hit._source.tokens.length == 0) {
          return "<pre>" + scope.hit._source.content + "</pre>";
        }
        var out = "";
        var prev = 0;
        _.each(scope.hit._source.tokens, function(token) {
          out += "<span class='non-token'>" + _.escape(scope.hit._source.content.slice(prev, token.char)) + "</span>";
          out += "<a class='token' href='"+ "/search?q=tokens.text:" + token.text + " " + "repository:" + scope.hit._source.repository + "'>" + token.text +"</a>";
          prev = token.char + token.text.length;
        });
        out += "<span class='non-token'>" + _.escape(scope.hit._source.content.slice(prev)) + "</span>";
        return out;
      };
      var s = format();
      element.append(s);
    }
  };
});

module.controller("SearchController", function(
  $location,
  $scope,
  searchService
){
  var params = $location.search();
  if(params.q) {
    searchService.search(params.q);
  }

  $scope.highlight = function(lang, content) {
    return hljs.highlightAuto(content).value;
  }

  $scope.essResults = searchService.getResults;
  $scope.getURL = function(repo, filename) {
    return repo.replace(".git","").concat("/tree/master/").concat(filename);
  };
  $scope.applyFilter = function(name, value) {
    var searchText = searchService.getText();
    searchText = searchText.concat(" ").concat(name).concat(":").concat(value);
    $location.path("/search").search("q", searchText);
  };
  $scope.format = function(content, tokens) {

  };
});

module.controller("HomeController", function (){});
module.controller("SearchBarController", function (
  $http,
  $scope,
  $location,
  searchService
) {

  $scope.loading = function() {
     return searchService.loading();
  };
   $scope.searchText = searchService.getText();
   $scope.essResults = searchService.getResults;
   $scope.onSubmit = function() {
     $location.path("/search").search("q", $scope.searchText);
  };
  $scope.$watch(function() {
    return searchService.getText()}, function(n, cur) { 
    $scope.searchText = n;
  }, true);
 });
