package com.dev.test.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleJpaRepository extends JpaRepository<ArticleModel, Integer> {
    ArticleModel findByArticleNo(Integer no);

    List<ArticleModel> findAllBy();
}
