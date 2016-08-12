angular.module('Notter')
.config(function($routeProvider) {
  $routeProvider.when('/notes',{templateUrl:'/template/pages/notes/index.html'})
                .when('/user' ,{templateUrl:'/template/pages/users/index.html'})
                .when('/',{templateUrl:'/template/pages/notes/index.html'})
                .otherwise({
                  redirectTo:'/notes'
                });
});
