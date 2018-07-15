Page({
  data: {
    isLike: true,
    // banner
    imgUrls: [
      "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531121268184&di=4d987d4d7825acd5a4bcc71b953bfef7&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fc9fcc3cec3fdfc037ae20c25de3f8794a5c22691.jpg",

      "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531716064&di=e217bd7d1e037d1fdb4671e84c3a7582&imgtype=jpg&er=1&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F500fd9f9d72a6059ae236f872234349b033bba78.jpg",

      "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531121389676&di=f4ba310b5aa9808e5f61a1f823827c7f&imgtype=0&src=http%3A%2F%2Fimg.mp.sohu.com%2Fupload%2F20170516%2F6fd4c08478864262b7d8b8944a617b2e_th.png"
    ],
    indicatorDots: true, //是否显示面板指示点
    autoplay: true, //是否自动切换
    interval: 3000, //自动切换时间间隔,3s
    duration: 1000, //  滑动动画时长1s

    // 商品详情介绍
    detailImg: [
      "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1876433971,3707182563&fm=27&gp=0.jpg",

      "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1531121559820&di=4e5950b4c52cfecc7bd8735e53af7fa4&imgtype=0&src=http%3A%2F%2Fimages.quanjing.com%2Fmy002%2Fhigh%2Fmy-1486.jpg"


    ],
  },
  //预览图片
  previewImage: function (e) {
    var current = e.target.dataset.src;

    wx.previewImage({
      current: current, // 当前显示图片的http链接  
      urls: this.data.imgUrls // 需要预览的图片http链接列表  
    })
  },
  // 收藏
  addLike() {
    this.setData({
      
      isLike: !this.data.isLike
    });
  },
  // 跳到购物车
  toCar() {
    wx.switchTab({
      url: '../order/order'
    })
  },
  // 立即购买
  addCar: function () {
    wx.navigateTo({
      url: '../order/order',
    })
  },


  immeBuy() {
    wx.showToast({
      title: '购买成功',
      icon: 'success',
      duration: 2000
    });
  },
})