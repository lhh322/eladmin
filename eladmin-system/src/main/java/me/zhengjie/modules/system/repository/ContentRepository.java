package me.zhengjie.modules.system.repository;

import me.zhengjie.modules.system.domain.Article;
import me.zhengjie.modules.system.domain.Dept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;
import java.util.Map;

import static org.hibernate.annotations.QueryHints.CACHEABLE;

@Repository
public interface ContentRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {

    @QueryHints(value = @QueryHint(name = CACHEABLE, value = "true"))
    @Query(value = "select \n" +
            "title,\n" +
            "author,\n" +
            "category,\n" +
            "label,\n" +
            "recommend,\n" +
            "sticky,\n" +
            "reading\n" +
            "from tb_article where \n" +
            "1 = 1 and \n" +
            "(title = :title or :title is null)\n" +
            "and (category = :category or :category is null)\n" +
            "and (label = :label or :label is null)", nativeQuery = true)
    Page<Map<String, Object>> searchContent(@Param("title") String title,
                                            @Param("category") String category,
                                            @Param("label") String label,
                                            Pageable pageable);


}
