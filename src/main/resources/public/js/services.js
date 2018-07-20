angular.module('app.services', []).factory('Lego', function($resource) {
  return $resource('/api/v1/lego/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
