package com.dev.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_article_file")
public class FileModel {

    @ManyToOne
    @JoinColumn(name="article_no")
    private ArticleModel article;

    @Id
    @Column(name="id")
    @GeneratedValue()
    private Integer fileId;

    @Column(name="file_name")
    private String fileName;

    @Column(name="reg_date")
    private Date regDate = new Date();

    @Column(name="original_file_name")
    private String origFileName;

    @Override
    public String toString() {
        return "FileModel{" +
                "fileName=" + fileName + '\'' +
                ", origName=" + origFileName + '\'' +
                ", regDate=" + regDate +
                "}";
    }
}
