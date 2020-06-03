public class Post {
    private final Comments comments;

    public Post(Comments comments) {
        this.comments = comments;
    }

    public Comments getComments() {
        return comments;
    }
}
