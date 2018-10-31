angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('BeginController', function($http, $scope, $state, $stateParams, MercadorService) {
	var ctrl = this;
	
	ctrl.pageSize = "10";
	ctrl.currentPage = "1";
    

    function listarProdutosPorTabelaPrecoESecao () {
      MercadorService.buscarTodos()
        .then(function(response) {
          ctrl.mercadoresPorTabelaPrecoSecao = response;
        })
        .catch(function(error) {
          console.log("Erro ao carregar mercadorias");
          console.log(error);
        });
    }
    
    listarProdutosPorTabelaPrecoESecao();
	
	

	/*var listarProdutosPorTabelaPrecoESecao = function() {
		MercadorService.buscarTodos().success(function(res) {
			$scope.mercadoresPorTabelaPrecoSecao = res;
			$scope.message = '';
			$scope.mercador = null;
		}).error(function(error) {
			$scope.message = error.message;
		});
	};*/

	/*
	 * var listarSecaoPorProduto = function() {
	 * $http.get('secmer').success(function(res) { $scope.secaoPorProduto = res;
	 * $scope.message = ''; }).error(function(error) { $scope.message =
	 * error.message; }); };
	 */

	// listarSecaoPorProduto();
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

	$scope.selecionarMercadoria = function(mercador) {
		console.log(mercador);
		// edit = true;
		$scope.mercadorSelecionado = mercador;
	}

	//$scope.buscarPorCod = function(mercador) {
		//$http.get('itens/cod/' + mercador.cod).success(function(res) {
			//$scope.mercadorSelecionado = res;
			//console.log(mercadorSelecionado);
		//}).error(function(error) {
		//	$scope.message = error.message;
		//});
	//}

	// buscarPorCod($stateParams.cod);

	//listarProdutosPorTabelaPrecoSecaoVestido();
	//listarProdutosPorTabelaPrecoSecaoCigana();
	//listarProdutosPorTabelaPrecoSecaoCamisete();

});
