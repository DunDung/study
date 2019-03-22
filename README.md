# Vue.js-Study  

## 뷰 인스턴스
필수적으로 생성해야 하는 기본 단위  
  ```
  new Vue({  
    ...  
  });
  ```
  
* 자주 쓰이는 속성들
1. el: 그려질 위치의 돔 요소 지정 #으로 검색
2. data: 데이터 전달
3. template: 화면에 표시할 속성
4. methods: 화면 로직 제어와 관계된 메서드를 정의
5. created: 뷰 인스턴스가 생성되자마자 실행할 로직을 정의 

## 뷰 컴포넌트 
조합하여 화면을 구성할 수 있는 블록  

* 전역 컴포넌트 등록
```
<script>
Vue.component('컴포넌트 이름', {
//컴포넌트 내용
});
</script>
```
모든 범위에서 사용 가능하다.  

* 지역 컴포넌트 등록
```
<script>
new Vue({
  el : '#app',
  components : {
    '컴포넌트 이름': 컴포넌트 내용
  }
});
</script>
```
el 속성으로 지정해준 범위에서만 사용 가능하다.  

## 뷰 컴포넌트 통신
* 상위-하위 컴포넌트 관계  
전역, 지역 컴포넌트를 등록하면 자연스럽게 하위 컴포넌트가 된다.  
하위 컴포넌트를 등록한 인스턴스는 상위 컴포넌트가 된다.  

* 상위에서 하위 컴포넌트로 데이터 전달  
<strong>props 속성</strong>  
```
Vue.component('child-component', {
  props: ['props 속성 이름'],
});
//전역 또는 지역의 하위 컴포넌트의 속성에 props속성을 정의
```
```
<child-component v-bind:"하위 컴포넌트의 props 속성 이름"="상위 컴포넌트의 data 속성"></child-component>
//child-component 컴포넌트 태그에 v-bind 속성을 추가 -> 하위 컴포넌트의 props 속성이름 = 상위 컴포넌트의 data 속성
```
컴포넌트를 등록함과 동시에 뷰 인스턴스 자체가 상위 컴포넌트가 되기 때문. 
* 하위에서 상위 컴포넌트로 이벤트 전달하기
이벤트를 발생시켜 하위에서 상위로 통신한다.  
데이터를 전달하고 싶다면 이벤트 버스를 이용  
```
//하위 컴포넌트의 이벤트 발생시키기
method: {
  showLog: function() {
    this.$emit('show-log');
  }
}
```
```
<child-component v-on:show-log="printText"></child-component>
//v-on속성을 통해 하위 컴포넌트의 이벤트명과 상위 컴포넌트의 메서드명을 "="을 통해 연결 시킨다.
```
* 관계 없는 컴포넌트 간 통신 - 이벤트 버스
```
//이벤트 버스를 위한 추가 인스턴스 1개 생성
var eventBus = new Vue();
```
```
//이벤트를 보내는 컴포넌트
methods: {
  메서드명 : function() {
    eventBus.$emit('이벤트명', 데이터);
  }
}
```
```
//이벤트를 받는 컴포넌트
methods: {
  created: function() {
    eventBus.$on('이벤트명', function(데이터) {
      ...
    });
  }
}
```
