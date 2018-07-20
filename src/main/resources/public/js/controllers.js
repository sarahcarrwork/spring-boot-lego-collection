angular.module('app.controllers', []).controller('LeogListController', function($scope, $state, popupService, $window, Lego) {
  $scope.lego = Lego.query(); //fetch all shipwrecks. Issues a GET to /api/vi/lego

  $scope.deleteLego = function(shipwreck) { // Delete a Lego. Issues a DELETE to /api/v1/lego/:id
    if (popupService.showPopup('Really delete this?')) {
      lego.$delete(function() {
        $scope.lego = Lego.query();
        $state.go('lego');
      });
    }
  };
}).controller('LegoViewController', function($scope, $stateParams, Lego) {
  $scope.lego = Lego.get({ id: $stateParams.id }); //Get a single shipwreck.Issues a GET to /api/v1/lego/:id

}).controller('LegoCreateController', function($scope, $state, $stateParams, Lego) {
  $scope.lego = new Lego();  //create new shipwreck instance. Properties will be set via ng-model on UI

  $scope.addLego = function() { //create a new shipwreck. Issues a POST to /api/v1/lego
    $scope.lego.$save(function() {
      $state.go('lego'); // on success go back to the list i.e. shipwrecks state.
    });
  };
}).controller('LegoEditController', function($scope, $state, $stateParams, Lego) {
  $scope.updateLego = function() { //Update the edited shipwreck. Issues a PUT to /api/v1/lego/:id
    $scope.lego.$update(function() {
      $state.go('lego'); // on success go back to the list i.e. lego state.
    });
  };

  $scope.loadLego = function() { //Issues a GET request to /api/v1/lego/:id to get a lego to update
    $scope.lego = Lego.get({ id: $stateParams.id });
  };

  $scope.loadLego(); // Load a lego which can be edited on UI
});
