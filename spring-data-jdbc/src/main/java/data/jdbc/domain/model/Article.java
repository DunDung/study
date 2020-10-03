package data.jdbc.domain.model;

import org.springframework.data.annotation.Id;

import java.util.Set;

public class Article {
    @Id
    private final Long id;
    private final String title;
    private final String content;
    private final Set<Comment> comments;

    Article(Long id, String title, String content, Set<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.comments = comments;
    }

    public static Article of(String title, String content, Set<Comment> comments) {
        return new Article(null, title, content, comments);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public Long getId() {
        return id;
    }
}