<template>
  <div>
    <b-input-group :prepend="name" class="mt-3">
      <b-form-textarea
        id="textarea"
        v-model="context"
        :placeholder="코멘트를 달아주세요."
        rows="3"
        max-rows="6">
      </b-form-textarea>
      <b-input-group-append>
        <b-button variant="info" @click="createComment">작성하기</b-button>
      </b-input-group-append>
    </b-input-group>
  </div>
</template>
<script>
export default {
  name: 'CommentCreate',
  data() {
    //원래 이름은 로그인 정보에 따라 바뀌어야 한다.
    name: '르라나',
    context: '',
  }
}
</script>
