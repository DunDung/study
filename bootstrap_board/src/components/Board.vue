<template>
  <div>
    <!--fields로 필요한 속성만 보여주기, 컬럼명 변경 -->
    <b-table striped hover :items="items" :fields="fields" @row-clicked="rowClick"></b-table>
    <b-button @click="writeContent">글쓰기</b-button>
  </div>
</template>

<script>
import data from '@/data'


  export default {
    data() {
      //글을 최신순으로 정렬하기
      let items = data.Content.sort((a, b) => {return b.content_id - a.content_id})
      //map함수로 작성자 추가하기 ...전개연산자로 객체 모두 받아오고 user_name속성 추가
      //filter 함수는 조건에 맞는 것만 판별해서 리턴한다.
      items = items.map(contentItem => {return {...contentItem, user_name: data.User.filter(userItem => userItem.user_id == contentItem.user_id)[0].name}})
      return {
        fields: [
          {
            key: 'content_id',
            label: '글번호'
          },
          {
            key: 'title',
            label: '제목'
          },
          {
            key: 'created_at',
            label: '작성일'
          },
          {
            key: 'user_name',
            label: '글쓴이'
          }
        ],
        items: items
      }
    },
    methods: {
      rowClick(item, index, e){
        this.$router.push({
          //``와 ''의 차이는?
          path: `/board/free/detail/${item.content_id}`
        })
      },
      writeContent(){
         this.$router.push({
           path: '/board/free/create'
         })
      }
    }
  }
</script>
