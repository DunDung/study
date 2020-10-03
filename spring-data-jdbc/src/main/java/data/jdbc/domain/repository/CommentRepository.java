package data.jdbc.domain.repository;

import data.jdbc.domain.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
