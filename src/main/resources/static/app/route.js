angular.module('JWTDemoApp').config(function($stateProvider, $urlRouterProvider) {
	
	// the ui router will redirect if a invalid state has come.
	$urlRouterProvider.otherwise('/pagina-nao-econtrada');
	// parent view - navigation state
	$stateProvider.state('nav', {
		abstract : true,
		url : '',
		views : {
			'nav@' : {
				templateUrl : 'app/views/nav.html',
				controller : 'NavController'
			}
		}
	}).state('login', {
		parent : 'nav',
		url : '/login',
		views : {
			'content@' : {
				templateUrl : 'app/views/login.html',
				controller : 'LoginController'
			}
		}
	}).state('users', {
		parent : 'nav',
		url : '/users',
		data : {
			role : 'ADMIN'
		},
		views : {
			'content@' : {
				templateUrl : 'app/views/users.html',
				controller : 'UsersController',
			}
		}
	}).state('home', {
		parent : 'nav',
		url : '/',
		views : {
			'content@' : {
				templateUrl : 'app/views/home.html',
				controller : 'BeginController'
			}
		}
	}).state('begin', {
		parent : 'nav',
		url : '/pagina-inicial',
		views : {
			'content@' : {
				templateUrl : 'app/views/begin.html',
				controller : 'BeginController'
			}
		}
	}).state('itetabpr', {
		parent : 'nav',
		url : '/por-tabela',
		views : {
			'content@' : {
				templateUrl : 'app/views/secmer/secmerVestido.html',
				controller : 'SecmerController'
			}
		}
	}).state('secmer-vestido', {
		parent : 'nav',
		url : '/secao-vestido',
		views : {
			'content@' : {
				templateUrl : 'app/views/secmer/secmerVestido.html',
				controller : 'BeginController'
			}
		}
	}).state('secmer-cigana', {
		parent : 'nav',
		url : '/secao-cigana',
		views : {
			'content@' : {
				templateUrl : 'app/views/secmer/secmerCigana.html',
				controller : 'BeginController'
			}
		}
	}).state('secmer-camisete', {
		parent : 'nav',
		url : '/secao-camisete',
		views : {
			'content@' : {
				templateUrl : 'app/views/secmer/secmerCamisete.html',
				controller : 'BeginController'
			}
		}
	}).state('datalhe-mercadoria', {
		parent : 'nav',
		url : '/mercadoria-detalhe',
		views : {
			'content@' : {
				templateUrl : 'app/views/mercador/detalheMercadoria.html',
				controller : 'DetalheMercadoriaController'
			}
		}
	}).state('page-not-found', {
		parent : 'nav',
		url : '/pagina-nao-econtrada',
		views : {
			'content@' : {
				templateUrl : 'app/views/page-not-found.html',
				controller : 'PageNotFoundController'
			}
		}
	}).state('access-denied', {
		parent : 'nav',
		url : '/access-denied',
		views : {
			'content@' : {
				templateUrl : 'app/views/access-denied.html',
				controller : 'AccessDeniedController'
			}
		}
	}).state('register', {
		parent : 'nav',
		url : '/register',
		views : {
			'content@' : {
				templateUrl : 'app/views/register.html',
				controller : 'RegisterController'
			}
		}
	});
}).filter('startFrom', function() {
	return function(data, start) {
		if (!data || !data.length) {
			return;
		}
		start = +start;
		return data.slice(start);
	}
});
