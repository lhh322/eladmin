package me.zhengjie.modules.system.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;
import java.util.Map;

import static org.hibernate.annotations.QueryHints.CACHEABLE;

@Repository
public interface ContentRepository {

    @QueryHints(value = @QueryHint(name = CACHEABLE, value = "true"))
    @Query(value = "SELECT c FROM Content c WHERE c.title LIKE %:title% AND c.category = :category AND c.label = :label", nativeQuery = true)
    Page<Map<String, Object>> searchContent(@Param("title") String title,
                                            @Param("category") String category,
                                            @Param("label") String label,
                                            Pageable pageable);


}
