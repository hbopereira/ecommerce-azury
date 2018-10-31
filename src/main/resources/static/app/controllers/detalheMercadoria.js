angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('DetalheMercadoriaController', function($http, $scope, $state, $stateParams, MercadorService) {

	  var ctrl = this;

      function getMercador(mercadoriaCod) {
        MercadorService.get(mercadoriaCod)
          .then(function(response) {
            ctrl.mercador = response;
          })
          .catch(function(error) {
            console.log("Problema ao carregar Mercadoria " + mercadoriaCod);
            console.log(error);
          });
      }
      
      getMercador($stateParams.cod);
	

	

});
