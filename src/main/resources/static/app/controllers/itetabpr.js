angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('SecmerController', function($http, $scope) {
	$scope.pageSize = "4";
	$scope.currentPage = "1";
	
	
	var listarProdutosPorTabelaPreco = function() {
		$http.get('itens').success(function(res) {
			$scope.mercadoresPorTabelaPreco = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	/*var listarProdutosPorTabelaPrecoSecaoCigana = function() {
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
	};*/
	
	
	

	listarProdutosPorTabelaPreco;
	//listarProdutosPorTabelaPrecoSecaoCigana();
	//listarProdutosPorTabelaPrecoSecaoCamisete();

});
