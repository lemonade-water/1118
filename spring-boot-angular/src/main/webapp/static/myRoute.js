var app = angular.module('indexapp', ['ngRoute'])
app.controller('indexController', function ($http, $scope) {
    $http({
        method:'get',
        url:'/spring-boot/index',
    }).then(function successCallback(response) {
        $scope.menus = response.data.menus;
        console.log(response.data.menus)
    },function errorCallback() {

    })

})
app.config(['$routeProvider', function ($routeProvider) {

    $routeProvider
        .when('/school', {
            templateUrl: 'school.html',
            controller: 'schoolControl'
        })
        .when('/user', {
            templateUrl: 'user.html',
            controller: 'userControl'
        })
        .when('/uu', {

            //templateUrl: 'b.html',
            controller: 'quserControl'
        })
        .otherwise( {redirectTo: '/school'});
}])

app.controller('schoolControl', function ($http, $scope,$rootScope) {

    $http({
        method: 'get',
        url: '/spring-boot/school'
    }).then(function successCallback(response) {

        $scope.scoolname = response.data;
        $rootScope.flag=true;
    }, function errorCallback() {

    })
})
app.controller('quserControl', function ($location) {
     debugger
    // $location.path('b.html');
    window.location.href="http://localhost:8080/spring-boot/sky/b.html";

})


app.controller('userControl', function ($http, $scope,$rootScope) {

    $http({
        method: 'get',
        url: '/spring-boot/user'
    }).then(function successCallback(response) {
        $scope.username = response.data;
        $rootScope.flag=false;
    }, function errorCallback() {

    })
})


