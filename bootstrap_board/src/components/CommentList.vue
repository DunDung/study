<template>
  <div>
    <div :key="item.comment_id" v-for="item in comments">
      <CommentListItem :commentObj="item"/>
    </div>
  </div>
</template>
<script>
import data from '@/data';
import CommentListItem from './CommentListItem';

export default {
  name : 'CommentList',
  components: {
    CommentListItem
  },
  props: {
    contentId: Number,

  },
  data() {
    return {
      comments: data.Comment.filter(item => item.content_id === this.contentId)
    }
  }
}
</script>
