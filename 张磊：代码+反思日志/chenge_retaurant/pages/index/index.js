
Page({


data: {
  img: {
    swiperImg: [

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531046838156&di=82e557dfef20c2f506bcd441d168eb1f&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01e84757675e660000012e7eaeb4b8.jpg%402o.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531046927480&di=4c7b2c9794815191d78f7c814a544077&imgtype=0&src=http%3A%2F%2Fimg01.taopic.com%2F161112%2F235109-161112142Q650.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531046803472&di=971741c103c33f9e0d90816e00ff701f&imgtype=0&src=http%3A%2F%2Fpic2.16pic.com%2F00%2F07%2F20%2F16pic_720439_b.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531046869055&di=fd66217e258c7e2ee977a435b5ebef9b&imgtype=0&src=http%3A%2F%2Fzf.36578.com%2Fupload%2Farticle%2F20171124%2F92401084241511509144.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531046492527&di=f4b33f290fb1f1a6b9f5b19603a6c4fc&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20170103%2F0237ad7ea7a44540b4a6cd00754e6d53_th.jpg"
      ],

      gridImg: [
"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531642418&di=bb1840887806fdebd2089b4dd6994f33&imgtype=jpg&er=1&src=http%3A%2F%2Fthumb103.test-ss.cn%2Fz%2Fstock-photo-281783648.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531050405518&di=7f55410c9e09dd78e546aff101075016&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%253Dshijue1%252C0%252C0%252C294%252C40%2Fsign%3D08ed1e1671f40ad101e9cfa03f457baa%2F63d9f2d3572c11dfab7a960d692762d0f703c270.jpg",

"https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1941519201,2153032854&fm=15&gp=0.jpg",

"https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=305445756,1875968412&fm=27&gp=0.jpg",

"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531047743841&di=db5b78b86b72c8575c9c8d305e3cd9f6&imgtype=0&src=http%3A%2F%2Fthumb108.test-ss.cn%2Fz%2Fstock-photo-254983354.jpg",


"https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=698780259,66649936&fm=27&gp=0.jpg",



      ],

      gridTitle: [
       
        '积分查询',
        '餐具定制',
        '菜品榜单',
        '优惠活动',
        '会员反馈',
        '积分游戏'
      ]

    },

    interval: 3000,
    duration: 1500,
    activeColor: "#fff",
    //opacity: 0,


    contentImg:
"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531052437155&di=1a92328becbb1890a4624fa26c125f43&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F11%2F22%2F05%2F57T58PICyDa.jpg",

    search: [
      "../../img/cantinglogo.jpg",
      "../../img/search.jpa"
    ],

  },

   scroll: function(e) {
     console.log(e)
     var height = e.detail.scrollTop;
     if(height > 300) {
       return;
     }

     var opacityNum = height / 300;

     this.setData({
       opacity: opacityNum
     });
   },

  btn3: function(){
    wx.navigateTo({
      url: '../caidan/caidan',
    })
  },

   
     })
   

 


