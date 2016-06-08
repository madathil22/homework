(function(){
  var app=angular.module('product',[]);
  app.directive('productInfo',function () {
    return {
        restrict:'E',
        templateUrl:'./public/html/product-info.html'
    };
  });

  app.directive('productPanel',function () {
    return{
      restrict:'E',
      templateUrl:'./public/html/product-panel.html',
      controller:function(){
        this.tab=1;
        this.setSelected=function(tabId){
          this.tab=tabId;
        };
        this.isSelected=function(tabId){
          return this.tab===tabId;
        }
      },
      controllerAs:'panel'
    };
  });
})();
