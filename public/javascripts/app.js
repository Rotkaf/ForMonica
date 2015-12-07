var myApp = angular.module('RecipesApp', [])
.controller('MainCtrl', ['$scope', function ($scope) {
    $scope.tabs = [{
            title: 'Dodaj przepis',
            url: '/addRecipe'
        }, {
            title: 'Lista przepisów',
            url: '/listRecipes'
        }, {
            title: 'Szukaj po składnikach',
            url: 'three.tpl.html'
    }];

//    $scope.currentTab = '/listRecipes';

    $scope.onClickTab = function (tab) {
        $scope.currentTab = tab.url;
    }
    
    $scope.isActiveTab = function(tabUrl) {
        return tabUrl == $scope.currentTab;
    }
}]);