(function () {
var app = angular.module('modone', []);

app.controller('controlClientes',
    function ($scope, $http) {
    $scope.clientes = [];
    $scope.idClienteSeleccionado;
    $scope.obtenerClientes = function(){
        $http.get('rest/cliente').
                success(function (data, status, headers, config) {
                    $scope.clientes = data;
                    alert('success!');
                }).
                error(function (data, status, headers, config) {
                    alert('error' + headers);
                });
   };
});
  
})();





