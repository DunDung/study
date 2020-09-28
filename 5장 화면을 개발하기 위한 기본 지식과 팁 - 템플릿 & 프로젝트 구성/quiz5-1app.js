var app = new Vue({
        el: '#app',
          data: {
            message: 'Hello Vue.js!',
            junseong: 'Hong Jun Seong',
            uid: '100',
            flag: false
          },
          methods: {
            clickBtn() {
              console.log("hi");
            },
            //clickBtn: function() {
              //console.log("hi");
            clickBtn2(){
              console.log("hi2");
            }
          }
      });
