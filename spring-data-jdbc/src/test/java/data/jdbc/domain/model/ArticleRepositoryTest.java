package data.jdbc.domain.model;

import data.jdbc.domain.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;

import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJdbcTest
class ArticleRepositoryTest {
    @Autowired
    ArticleRepository articleRepository;

    @DisplayName("create")
    @Test
    void create() {
        Article article = Article.of("title", "content", new HashSet<>());
        article.addComment(Comment.of("1"));
        Article save = articleRepository.save(article);

        Article find = articleRepository.findById(save.getId()).get();

        assertThat(find).isEqualToComparingFieldByField(save);
    }
}