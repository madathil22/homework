(function(){
  var app = angular.module('store',['product']);
  app.controller('StoreController',['$http',function($http){
    var me=this;
    me.products=[];
    $http({method:'GET',url:'./mvc/products/getProducts'}).success(function (data) {
      me.products=data;
    });

  }]);


  app.controller('ReviewController',function() {
    this.review={};
    this.submitReview=function(product) {
      product.reviews.push(this.review);
      this.review={};
    };
  });



})();
