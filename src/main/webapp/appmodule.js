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
}
        );

app.controller('controlInventarios',
    function ($scope, $http) {
    $scope.inventarios = [];
    $scope.idInventarioSeleccionado;
    $scope.obtenerInventarios = function(){
        $http.get('rest/inventario').
                success(function (data, status, headers, config) {
                    $scope.inventarios = data;
                    alert('success!');
                }). 
                error(function (data, status, headers, config) {
                    alert('error' + headers);
                });
   };
});
  
})();





