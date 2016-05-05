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

app.controller('controlPastelerias',
    function ($scope, $http) {
    $scope.pastelerias = [];
    $scope.idPasteleriaSeleccionado;
    $scope.obtenerPastelerias = function(){
        $http.get('rest/pasteleria').
                success(function (data, status, headers, config) {
                    $scope.pastelerias = data;
                    alert('success!');
                }). 
                error(function (data, status, headers, config) {
                    alert('error' + headers);
                });
   };
});

app.controller('controlSucursales',
    function ($scope, $http) {
    $scope.sucursales = [];
    $scope.idSucursalSeleccionado;
    $scope.obtenerSucursales = function(){
        $http.get('rest/sucursal').
                success(function (data, status, headers, config) {
                    $scope.sucursales = data;
                    alert('success!');
                }). 
                error(function (data, status, headers, config) {
                    alert('error' + headers);
                });
   };
});

app.controller('controlAsistentePasteleria',
    function ($scope, $http) {
    $scope.asistentes = [];
    $scope.idAsistentePasteleriaSeleccionado;
    $scope.obtenerAsistentePasteleria = function(){
        $http.get('rest/asistentePasteleria').
                success(function (data, status, headers, config) {
                    $scope.asistentes = data;
                    alert('success!');
                }). 
                error(function (data, status, headers, config) {
                    alert('error' + headers);
                });
   };
});
  
})();





