angular.module('JWTDemoApp')
// Creating the Angular Controller
.controller('NavController',
		function($http, $scope, AuthService, $state, $rootScope) {
			$scope.$on('LoginSuccessful', function() {
				$scope.user = AuthService.user;
			});
			$scope.$on('LogoutSuccessful', function() {
				$scope.user = null;
			});
			$scope.logout = function() {
				AuthService.user = null;
				$rootScope.$broadcast('LogoutSuccessful');
				$state.go('login');
			};
			
			var listarSecaoPorProduto = function() {
				$http.get('secmer').success(function(res) {
					$scope.secaoPorProduto = res;
					$scope.message = '';
				}).error(function(error) {
					$scope.message = error.message;
				});
			};

			listarSecaoPorProduto();

		});
