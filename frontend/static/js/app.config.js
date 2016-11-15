var module = angular.module('codesearchApp')

module.run(function($animate) {
  $animate.enabled(false);
});


module.config(['$locationProvider', '$routeProvider',
    function config($locationProvider, $routeProvider) {
      $locationProvider.hashPrefix('!');

      $routeProvider.
        when('/', {
          templateUrl: 'partials/home.html',
          controller: 'HomeController'
        }).
        when('/search', {
          templateUrl: 'partials/search.html',
          controller: 'SearchController'
        }).
        when('/document/:documentId', {
          templateUrl: 'partials/details.html',
          controller: 'DetailsController'
        }).otherwise('/');
    }
  ]);

module.config(function ($locationProvider) {
  $locationProvider.html5Mode(true);
});

module.config(function (localStorageServiceProvider) {
  localStorageServiceProvider.setPrefix('codegrep');
});

module.config(['$compileProvider', function ($compileProvider) {
  $compileProvider.debugInfoEnabled(false);
}]);