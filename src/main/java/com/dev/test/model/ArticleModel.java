package com.dev.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_article")
public class ArticleModel {

    @Id
    @Column(name="article_no")
    @GeneratedValue
    private Integer articleNo;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="writer")
    private String writer;

    @Column(name="regdate", nullable= false)
    private Date regDate = new Date();

    @Column(name="viewcnt")
    private int viewCnt;

    @Transient
    private String[] files;

    @Column(name="file_cnt")
    private int fileCnt;

    public ArticleModel() {
        this.fileCnt=0;
        this.viewCnt=0;
    }

    @Override
    public String toString() {
        return "ArticleModel{" +
                "articleNo="+articleNo+
                ", title="+title+ '\'' +
                ", content="+content+ '\'' +
                ", writer="+writer+'\'' +
                ", regDate="+regDate+
                ", viewCnt="+viewCnt+
                ", fileCnt="+fileCnt+
                "}";
    }

}

