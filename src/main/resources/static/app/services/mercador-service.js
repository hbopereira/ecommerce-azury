angular.module('JWTDemoApp')
// Creating the Angular Service for storing logged user details
.service('MercadorService', function($http) {

	var service = this;
	
	function extract(result) {
       return result.data;
    }
    
	service.buscarTodos = function() {
	  return $http.get('itens').then(extract);
	}
	
	service.buscarPorId = function(mercadorCod){
		$http.get('itens/{cod}' + mercadorCod).then(extract);
	}

});
