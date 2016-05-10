(function () {

    var app = angular.module('modone', []);

    app.controller('controlClientes',
            function ($scope, $http) {
                $scope.clientes = [];
                $scope.idClienteSeleccionado;
                $scope.obtenerClientes = function () {
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
                $scope.obtenerInventarios = function () {
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
                $scope.obtenerPastelerias = function () {
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
                $scope.obtenerSucursales = function () {
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
                $scope.obtenerAsistentePasteleria = function () {
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

    app.controller('controlIngredientes',
            function ($scope, $http) {
                $scope.formas = ["Cuadrada", "Circular", "Triangular"];
                $scope.masas = [];
                $scope.decorados = [];
                $scope.adiciones = [];
                $scope.formaSeleccionado;
                $scope.masaSeleccionado;
                $scope.decoradoSeleccionado;
                $scope.adicionSeleccionado;
                $scope.obtenerIngredientes = function () {
                    $http.get('rest/ingrediente/nombresIngredientes/1/' + $scope.formaSeleccionado).
                            success(function (data, status, headers, config) {
                                $scope.masas = data;
                            }).
                            error(function (data, status, headers, config) {
                                alert('error' + headers);
                            });
                    $http.get('rest/ingrediente/nombresIngredientes/2/' + $scope.formaSeleccionado).
                            success(function (data, status, headers, config) {
                                $scope.decorados = data;
                            }).
                            error(function (data, status, headers, config) {
                                alert('error' + headers);
                            });
                    $http.get('rest/ingrediente/nombresIngredientes/3/' + $scope.formaSeleccionado).
                            success(function (data, status, headers, config) {
                                $scope.adiciones = data;
                            }).
                            error(function (data, status, headers, config) {
                                alert('error' + headers);
                            });

                };

            });



    app.controller('controlVerificarCliente', function ($scope, $window) {
        $scope.clientes = [];
        $scope.verificarCliente = function () {
            $window.location.href = "cliente.html";
        };
    });



})();





