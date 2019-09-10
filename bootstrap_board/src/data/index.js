export default {
  User: [
    {
      user_id: 1,
      name: '홍준성',
      created_at: '2019-09-11 03:58:11'
    },
    {
      user_id: 2,
      name: '아이린',
      created_at: '2019-09-11 03:58:11'
    },
    {
      user_id: 3,
      name: '조이',
      created_at: '2019-09-11 03:58:11'
    },
  ],
  Content: [
    {
      content_id: 1,
      user_id: 1,
      title: '홍준성의 강의 알람표',
      context: '아직 미정입니다,',
      created_at: '2019-09-11 03:58:11',
      updated_at: null
    },
    {
      content_id: 2,
      user_id: 3,
      title: '레드벨벳 많이 사랑해 주세요^^',
      context: '화이팅!',
      created_at: '2019-09-11 03:58:11',
      updated_at: null
    },
    {
      content_id: 3,
      user_id: 2,
      title: '생일 축하해주신 여러분 감사합니다!',
      context: '^^',
      created_at: '2019-09-11 03:58:11',
      updated_at: null
    },
  ],
  Comment: [
    {
      comment_id: 1,
      user_id: 1,
      content_id: 3,
      context: '생일 축하해요!',
      created_at: '2019-09-12 10:13:12',
      updated_at: null
    },
    {
      comment_id: 2,
      user_id: 3,
      content_id: 3,
      context: '주현언니 생일 축하해요!',
      created_at: '2019-09-12 10:13:12',
      updated_at: null
    },
    {
      comment_id: 3,
      user_id: 2,
      content_id: 1,
      context: '강의 잘보고 있습니다.',
      created_at: '2019-09-12 10:13:12',
      updated_at: null
    }
  ],
  SubComment: [
    {
      subcomment_id: 1,
      comment_id: 3,
      user_id: 1,
      context: '오 아이린님이 직접 댓글을 달아주시다니 ㅠ',
      created_at: '2019-09-12 10:23:12',
      updated_at: null
    }
  ]
}
