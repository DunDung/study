package data.jdbc.domain.repository;

import data.jdbc.domain.model.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Override
    List<Article> findAll();
}
