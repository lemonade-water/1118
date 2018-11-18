var menuList;
var user;



(function(angular){
    angular.module('indexapp')
        .factory('userService',function($http){
            return {
                http:$http,
                token:'',
                auth:[],
                loginname:'',

                getUserinfo:function(){


                },



            };
        });
})(window.angular);
