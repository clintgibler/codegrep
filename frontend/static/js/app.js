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

module.service("utilityService", function () {
  this.encodeQueryData = function (data) {
    let ret = [];
    for (let d in data)
      ret.push(encodeURIComponent(d) + '=' + encodeURIComponent(data[d]));
    return ret.join('&');
  }
  this.extractSnippet = function (lines, line) {
    var output = [];
    // antlr4 line number starts from 1
    if (lines.length >= line - 1) {
      output.push(lines[line - 1]);
      if (line - 2 > 0) {
        output.push(lines[line - 2]);
      }
    }
    if (lines.length >= line) {
      output.push(lines[line]);
    }
    return output.join("\n");
  }
})

module.service("searchService", function ($http) {
  this.search = function (params) {
    var params = _.clone(params);
    if (params["tokens.type"]) {
      params["tokens.text"] = params["search"];
    }
    else {
      params["content"] = params["search"];
    }
    delete (params.search)
    params["highlight"] = ["content"];
    return $http.get("/codesearch/code/_search?", { params: params });
  };
});

module.service("searchStateService", function (
  $http,
  $location,
  searchService
) {
  var _results;
  var _error;
  var _params = {};
  var _loading = false;

  this.loading = function () {
    return _loading;
  }

  this.search = function (params) {
    _loading = true;
    _results = {};
    _params = params;
    return searchService.search(params).success(function (data) {
      _results = data;
      _loading = false;
    })
      .error(function (data) {
        _error = data;
        _loading = false;
      });
  }

  this.getResults = function () {
    return _results;
  };

  this.getParams = function () {
    return _params;
  }
});

module.controller("DetailsController", function ($http, $scope, $routeParams, utilityService) {
  $scope.blah = "";
  $scope.hit = {};
  $scope.loading = true;
  $http.get("/codesearch/code/" + $routeParams.documentId).success(function (data, status, headers, config) {
    $scope.loading = false;
    $scope.hit = data;
  });
  $scope.short = function (str) {
    return str.split("/").pop();
  }
  $scope.getURL = function (repo, filename) {
    return repo.replace(".git", "").concat("/tree/master/").concat(filename);
  };

  $scope.getIdentifiers = function (repo, identifier) {
    return $http.get("");
  };
});

module.directive('sourceCode', function ($compile, $sanitize, utilityService) {
  return {
    restrict: 'E',
    scope: {
      hit: '='
    },
    replace: true,
    link: function (scope, element) {
      function replaceWith(out, pos, target, replacement) {
        return out.substr(0, pos) + out.substr(pos).replace(target, replacement);
      }
      var format = function () {
        if (scope.hit._source.tokens.length == 0) {
          return "<pre>" + scope.hit._source.content + "</pre>";
        }
        var out = "";
        var prev = 0;
        _.each(_.sortBy(scope.hit._source.tokens, function (t) { return t.char; }), function (token) {
          out += "<span class='non-token'>" + _.escape(scope.hit._source.content.slice(prev, token.char)) + "</span>";
          out += "<a class='token token-" + scope.hit._source.language + "-" + token.type + "' "
            + "href='" + "/search?" + utilityService.encodeQueryData({
              "search": token.text,
              "tokens.type": token.type,
              "language": scope.hit._source.language,
              "repository": scope.hit._source.repository
            })
            + "'>" + token.text + "</a>";
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

module.controller("SearchController", function (
  $scope,
  $routeParams,
  searchService,
  searchStateService,
  utilityService
) {
  var params = $routeParams;
  var loading = true;
  $scope.total = 0;
  $scope.diplayed = 0;

  $scope.resultsByToken = {};
  $scope.results = [];

  searchStateService.search($routeParams).success(function (data) {
    $scope.total = data.hits.total;
    $scope.displayed = data.hits.hits.length;

    _.each(data.hits.hits, function (hit) {


      var tokenMatch = false;
      // see if the search term matches any tokens - so we can rate them higher
      _.each(hit._source.tokens, function (token) {
        if (token.text === params["search"]) {
          tokenMatch = true;
          if (!_.has($scope.resultsByToken, token.type)) {
            $scope.resultsByToken[token.type] = {};
          }
          if (!_.has($scope.resultsByToken[token.type], hit._source.repository)) {
            $scope.resultsByToken[token.type][hit._source.repository] = {};
          }
          if (!_.has($scope.resultsByToken[token.type][hit._source.repository], hit._source.filename)) {
            $scope.resultsByToken[token.type][hit._source.repository][hit._source.filename] = {
              "tokens": [],
              "language": hit._source.language,
              "id": hit._id
            }
          }
          $scope.resultsByToken[token.type][hit._source.repository][hit._source.filename].tokens.push({
            "line": token.line,
            "snippet": utilityService.extractSnippet(hit._source.content.split("\n"), token.line)
          });
        }
      });

      if (!tokenMatch) {
        $scope.results.push(hit);
      }

    });
    $scope.loading = false;
  })
    .error(function (data) {
      $scope.loading = false;
    });
});

module.controller("HomeController", function () { });
module.controller("SearchBarController", function (
  $http,
  $scope,
  $location,
  $q,
  $timeout,
  searchStateService,
  utilityService
) {

  $scope.languages = ["java", "go"];
  $scope.tokenTypes = ["method", "function", "variable", "import", "identifier", "annotation", "annotationtype", "class", "enum", "interface", "package"];
  $scope.repositories = [];

  $scope.updateRepositories = function (searchText) {
    var deferred = $q.defer();
    $http.get("/repositories/repository/_search?q=" + searchText + "*").success(function (data) {
      var results = _.map(data.hits.hits, function (hit) { return hit._source.uri });
      deferred.resolve(results);
    }).error(function () {
      deferred.reject([]);
    });
    return deferred.promise;
  }

  $scope.loading = function () {
    return searchStateService.loading();
  };

  $scope.params = {
    "search": "",
    "tokens.type": "",
    "repository": "",
    "language": ""
  };

  $scope.onSubmit = function () {
    var params = $scope.params;
    _.each(params, function removeUndefined(value, key) {
      if (!value) {
        delete params[key];
      }
    });
    $location.url("/search?" + utilityService.encodeQueryData(params));
  };

  $scope.$watch(function () {
    return searchStateService.getParams()
  }, function (n, cur) {
    $scope.params = n;
  }, true);

});

module.filter('shorten', function () {
  return function (input) {
    return input.split("/").pop()
  }
});
