package com.snh.demo.domain;

import com.snh.demo.common.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog extends BaseEntity {

    @Column(name = "blog_title",columnDefinition = "varchar(255) COMMENT '博客标题'")
    private String blogTitle;

    @Column(name = "blog_content",columnDefinition = "text COMMENT '博客内容'")
    private String content;

    @Column(name = "blog_read_count",columnDefinition = "bigint COMMENT '阅读总数'")
    private Integer readCnt;

    @Column(name = "blog_like_count",columnDefinition = "bigint COMMENT '顶总数'")
    private Integer likeCnt;

    @Column(name = "blog_stamp_count",columnDefinition = "bigint COMMENT '踩总数'")
    private Integer stampCnt;

    @Column(name = "blog_share_count",columnDefinition = "bigint COMMENT '分享总数'")
    private Integer shareCnt;


    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReadCnt() {
        return readCnt;
    }

    public void setReadCnt(Integer readCnt) {
        this.readCnt = readCnt;
    }

    public Integer getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(Integer likeCnt) {
        this.likeCnt = likeCnt;
    }

    public Integer getStampCnt() {
        return stampCnt;
    }

    public void setStampCnt(Integer stampCnt) {
        this.stampCnt = stampCnt;
    }

    public Integer getShareCnt() {
        return shareCnt;
    }

    public void setShareCnt(Integer shareCnt) {
        this.shareCnt = shareCnt;
    }
}
