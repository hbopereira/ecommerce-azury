angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('BeginController', function($http, $scope, $state, $stateParams, MercadorService) {
	var ctrl = this;
	
	ctrl.pageSize = "10";
	ctrl.currentPage = "1";
    

   // function listarMercadoresComParametroSecao(secmer) {
     // MercadorService.buscarTodosPorParametroSecao(secmer)
       // .then(function(response) {
         // ctrl.mercadoresPorParametroSecao = response;
        //})
        //.catch(function(error) {
         // console.log("Erro ao carregar mercadorias");
         // console.log(error);
        //});
   // }
    
    function listarMercadores () {
        MercadorService.buscarTodos()
          .then(function(response) {
            ctrl.mercadores = response;
          })
          .catch(function(error) {
            console.log("Erro ao carregar mercadorias");
            console.log(error);
          });
      }
    
	$scope.selecionarMercadoria = function(mercador) {
		console.log(mercador);
		// edit = true;
		$scope.mercadorSelecionado = mercador;
	}
    
   // listarMercadoresComParametroSecao(secmer);
    listarMercadores();
    
	

	// $scope.buscarPorCod = function(mercador) {
		// $http.get('itens/cod/' + mercador.cod).success(function(res) {
			// $scope.mercadorSelecionado = res;
			// console.log(mercadorSelecionado);
		// }).error(function(error) {
		// $scope.message = error.message;
		// });
	// }

	// buscarPorCod($stateParams.cod);

	// listarProdutosPorTabelaPrecoSecaoVestido();
	// listarProdutosPorTabelaPrecoSecaoCigana();
	// listarProdutosPorTabelaPrecoSecaoCamisete();

});
