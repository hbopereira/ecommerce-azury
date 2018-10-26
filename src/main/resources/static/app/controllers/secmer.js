angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('SecmerController', function($http, $scope) {
	$scope.pageSize = "4";
	$scope.currentPage = "1";
	
	
	var listarProdutosPorTabelaPrecoSecaoVestido = function() {
		$http.get('itens/porVestido').success(function(res) {
			$scope.mercadoresPorTabelaPrecoSecaoVestido = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	var listarProdutosPorTabelaPrecoSecaoCigana = function() {
		$http.get('itens/porCigana').success(function(res) {
			$scope.mercadoresPorTabelaPrecoSecaoCigana = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	var listarProdutosPorTabelaPrecoSecaoCamisete = function() {
		$http.get('itens/porCamisete').success(function(res) {
			$scope.mercadoresPorTabelaPrecoSecaoCamisete = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	
	

	listarProdutosPorTabelaPrecoSecaoVestido();
    listarProdutosPorTabelaPrecoSecaoCigana();
	listarProdutosPorTabelaPrecoSecaoCamisete();

});
