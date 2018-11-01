angular.module('JWTDemoApp')
// Creating the Angular Service for storing logged user details
.service(
		'MercadorService',
		function($http) {

			var service = this;

			function extract(result) {
				return result.data;
			}

			//service.buscarTodosPorParametroSecao = function(secmer) {
			//	return $http.get(
			//			'mercador/listaMercadorResumidoComParametroSecao')
			//			.then(extract);
			//}

			service.buscarTodos = function() {
				return $http.get('mercador')
						.then(extract);
			}
			service.buscarPorId = function(mercadorCod) {
				return $http.get('mercador/{cod}' + mercadorCod).then(extract);
			}

		});
