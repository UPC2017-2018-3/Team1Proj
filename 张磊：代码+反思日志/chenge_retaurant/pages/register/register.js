

Page({

  data: {
    phoneNum: '',
    psd: '',
    code: '',
    key: '获取',

    showToast: false,
    gainFlag: false,
  },

  showToast: function () {
    this.setData({
      showToast: true
    });

    setTimeout(() => {
      this.setData({
        showToast: false
      });
    },1500);
  },

  phoneBlur: function(e) {
    console.log(e);
    var phoneNum = e.detail.value;
    var len = phoneNum.length;
    if(len != 11 || phoneNum.charAt(0) != '1') {
      
    this.setData({
      toastText: '号码格式不正确唷'
    });

    wx.setStorage({
      key: "addTel",
      data: this.data.phoneNum


    })

    this.showToast();

      return;
    }

    this.setData({
      phoneNum: phoneNum
    });
  },

  psdBlur: function (e) {
    var psd = e.detail.value;

    this.setData({
      psd: psd
    });
  },

  gain: function() {
    var phoneNum = this.data.phoneNum;
    if(phoneNum == '') {
    this.setData({
    toastText: '号码格式不正确'
      });

      this.showToast();
      return;
    }

    var second = 30;
    this.countDown(second);

    var ran = Math.random()*899999+100000;
    var num = Math.floor(ran);

    wx.request({
      url:'https://v.juhe.cn/sms/send',
      data: {
        mobile: phoneNum,
        tpl_id: 34201,
        tpl_value: encodeURL('#code#=')+num,
        key: "e34efbc58862ea5cf4703b08635bc06c"
      },
      success: function(e) {
        console.log(e);
      },
    })
    
  },

  countDown: function(num) {
    this.setData({
      gainFlag: true,
      key: num
    });

    if(num < 0) {
      this.setData({
        key: '获取',
        gainFlag: false
      });

      return;
    }

    setTimeout(() => {
      this.countDown(num - 1);
    },1000);          
  },

  
    register: function() {

      wx.navigateTo({
        url: '../index/index',
      })
    
  
  
    
    
  },

})