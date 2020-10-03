package data.jdbc.domain.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Comment {
    @Id
    private final Long id;
    private final String content;

    Comment(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public static Comment of(String content) {
        return new Comment(null, content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
