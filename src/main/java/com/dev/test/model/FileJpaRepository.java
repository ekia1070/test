package com.dev.test.model;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface FileJpaRepository extends JpaRepository<FileModel, Integer> {
    FileModel findByFileName(String file_name);
    FileModel findByFileId(Integer id);

    @Transactional
    void deleteByFileName(String file_name);
}