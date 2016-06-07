(function(){
  var app = angular.module('store',[]);
  app.controller('StoreController',function(){
    this.products=gems;
  });

  app.controller('PanelController',function(){
    this.tab=1;
    this.setSelected=function(tabId){
      this.tab=tabId;
    };
    this.isSelected=function(tabId){
      return this.tab===tabId;
    }
  });
  app.controller('ReviewController',function() {
    this.review={};
    this.submitReview=function(product) {
      product.reviews.push(this.review);
      this.review={};
    };
  });
  app.directive('productInfo',function () {
    return {
        restrict:'E',
        templateUrl:'./public/html/product-info.html'
    };
  });
  var gems=[
            {name:'Diamond',price:200000,color:'white',buyable:true,desc:'A rare stone of nature',reviews:[{usr:'cheng',comment:'nice stone',rating:5},{usr:'ming',comment:'nice stone mara taraf thi bhi',rating:5}]},
            {name:'Ruby',price:10000000,color:'red',buyable:false,  desc:'A rare stone of nature',reviews:[{usr:'cheng',comment:'nice stone',rating:5},{usr:'ming',comment:'nice stone mara taraf thi bhi',rating:5}]},
            {name:'Emerald',price:999999,color:'green',buyable:true,desc:'A rare stone of nature',reviews:[{usr:'cheng',comment:'nice stone',rating:5},{usr:'ming',comment:'nice stone mara taraf thi bhi',rating:5}]},
            {name:'Sapphire',price:777777,color:'blue',buyable:true,desc:'A rare stone of nature',reviews:[{usr:'cheng',comment:'nice stone',rating:5},{usr:'ming',comment:'nice stone mara taraf thi bhi',rating:5}]}
          ];
})();
