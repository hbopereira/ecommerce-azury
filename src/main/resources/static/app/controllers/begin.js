angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('BeginController', function($http, $scope) {
	$scope.pageSize = "400";
	$scope.currentPage = "1";
	
	$scope.imagens = {
	 img: [		
		{src: 'app/imagens/1401160_a.jpg'},
		{src: 'app/imagens/1401164_a.jpg'},
		{src: 'app/imagens/1402172_a.jpg'}
	  ]
	};
	
	var listarProdutosPorTabelaPreco = function() {
		$http.get('itens').success(function(res) {
			$scope.mercadoresPorTabelaPreco = res;
			$scope.message = '';
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	
	/*var listarProdutosPorTabelaPrecoSecaoVestido = function() {
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
	};*/
	
	
	

	listarProdutosPorTabelaPreco();
//	listarProdutosPorTabelaPrecoSecaoVestido();
//	listarProdutosPorTabelaPrecoSecaoCigana();
//	listarProdutosPorTabelaPrecoSecaoCamisete();

});
