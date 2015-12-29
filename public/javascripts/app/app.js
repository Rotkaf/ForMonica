var myApp = angular.module('RecipesApp', ['ui.select', 'ngSanitize'])

.controller('MainCtrl', ['$scope', 'MealTypes', function ($scope, MealTypes) {
    $scope.tabs = [{
            title: 'Dodaj przepis',
            url: '/addRecipeForm'
        }, {
            title: 'Lista przepisów',
            url: '/listRecipes'
        }, {
            title: 'Szukaj po składnikach',
            url: 'three.tpl.html'
    }];

    // TODO nie dziala
    $scope.currentTab = $scope.tabs[0].url;

    $scope.onClickTab = function (tab) {
        $scope.currentTab = tab.url;
    };
    
    $scope.isActiveTab = function(tabUrl) {
        return tabUrl == $scope.currentTab;
    };
    
//    $scope.$watch(
//	  function() { return MealTypes.getMealTypes },
//	  function(newVal, oldVal) {
////	    	$scope.mealTypes = MealTypes.getMealTypes;
//		  $scope.mealTypes = newVal;
//	  }
//	);    
    
      MealTypes.getMealTypes().then(function(mealTypes) {
    	  $scope.mealTypes = mealTypes;
    	  console.log('$scope.mealTypes ', $scope.mealTypes);
    	  $scope.selectedItem = $scope.mealTypes[0];
      });
    
}]);


myApp.factory('MealTypes', function($http) {
    return {
        getMealTypes: function() {
            return $http.get('/mealTypes').then(function(response) {
            	console.log('http ', response.data);
            	return response.data;
            });
        }
    };
});