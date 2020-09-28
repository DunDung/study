<template>
  <div>
    <b-input-group :prepend="name" class="mt-3">
      <b-form-textarea
        id="textarea"
        v-model="context"
        :placeholder="'코멘트를 달아주세요.'"
        rows="3"
        max-rows="6">
      </b-form-textarea>
      <b-input-group-append>
        <b-button variant="info" @click="isSubComment ? createSubComment() : createComment()">작성하기</b-button>
      </b-input-group-append>
    </b-input-group>
  </div>
</template>
<script>
import data from'@/data';

export default {
  name: 'CommentCreate',
  props: {
    contentId: Number,
    commentId: Number,
    isSubComment: Boolean,
    reloadComment: Function,
    subCommentToggle: Function,
    reloadSubComments: Function,
  },
  data() {
    return {
    //원래 이름은 로그인 정보에 따라 바뀌어야 한다.
      name: '르라나',
      context: ""
    };
  },
  methods: {
    createComment() {
      data.Comment.push({
        comment_id: data.Comment[data.Comment.length - 1].comment_id + 1,
        //원래 로그인 정보에서 가져온다
        user_id: 1,
        content_id: this.contentId,
        context: this.context,
        created_at: '2019-04-29 16:11:11',
        updated_at: null
      });
      this.reloadComment();
      this.context = "";
    },
    createSubComment() {
      data.SubComment.push({
        subcomment_id: data.SubComment[data.SubComment.length - 1].subcomment_id + 1,
        //원래 로그인 정보에서 가져온다
        user_id: 1,
        comment_id: this.commentId,
        context: this.context,
        created_at: '2019-04-29 16:11:11',
        updated_at: null
      });
      this.subCommentToggle();
      this.reloadSubComments(); 
      this.context = "";
    }
  }
}
</script>
