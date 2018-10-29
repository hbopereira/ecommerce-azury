angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('DetalheMercadoriaController', function($http, $scope, $state, $stateParams) {
	$scope.mercadorSelecionado = {};

	// $scope.mercadoresPorTabelaPreco = {};
	$scope.selecionados = [];
	
	$scope.selecionarMercadoria = function(mercador){
		console.log(mercador);
		//edit = true;
		$scope.mercadorSelecionado = mercador;
	}
	
	$scope.buscarPorCod = function(mercador) {
		$http.get('itens/cod/'+mercador.cod).success(function(res) {
			$scope.mercadorSelecionado =res;
			console.log(mercadorSelecionado);
		}).error(function(error) {
			$scope.message = error.message;
		});
	}
	
   //buscarPorCod($stateParams.cod);
	

});
