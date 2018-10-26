angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('HomeController', function($http, $scope, AuthService) {
	$scope.pageSize = "4";
	$scope.currentPage = "1";
	
	//$scope.user = AuthService.user;

	var listarProdutosPorTabelaPreco = function() {
		$http.get('itens').success(function(res) {
			$scope.mercadoresPorTabelaPreco = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	var listarProdutosPorTabelaPrecoESecao = function() {
		$http.get('itens').success(function(res) {
			$scope.mercadoresPorTabelaPrecoSecao = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};

	listarProdutosPorTabelaPreco();
	listarProdutosPorTabelaPrecoESecao();
});
