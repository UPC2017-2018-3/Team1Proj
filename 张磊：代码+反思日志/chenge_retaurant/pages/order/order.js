Page({

  data: {
    name: '',
    address: '',
    
    flag: true
  },


  input1: function (e) {
  var input = e.detail.value;
  this.setData({
    name: input
  });
},

  input2: function (e) {
    var input = e.detail.value;
    this.setData({
      address: input
    });
  },

  
  
  
 
    


  

})