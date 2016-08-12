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
    this.closureClicked=function(){

      var array=['tob','rob','mob'];
      var funcs=[];
      for (var i = 0; i < array.length; i++) {
          var inp=array[i];
          funcs[i]=function (myl1) {
            var inner=myl1;
            return function () {
              console.log("here for:"+inner);
            }

          }(inp);
      }
      for (var j = 0; j < funcs.length; j++) {
        funcs[j]();
      }
    };


  });



})();
