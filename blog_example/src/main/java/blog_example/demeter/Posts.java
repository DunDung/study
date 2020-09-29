package blog_example.demeter;

import java.util.List;

public class Posts {
    private final List<Post> posts;

    public Posts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addComment(int postId, String content) {
        posts.get(postId).addComment(content);
    }
}
