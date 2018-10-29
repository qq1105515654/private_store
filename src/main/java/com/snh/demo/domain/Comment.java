package com.snh.demo.domain;

import com.snh.demo.common.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment  extends BaseEntity {

    @Column(name = "blog_id",columnDefinition = "bigint COMMENT '所属博客的ID'")
    private Long blogId;

    @Column(name = "higher_up_id",columnDefinition = "bigint COMMENT '此评论的上一级ID'")
    private Long higherUpId;

    @Column(name = "from_id",columnDefinition = "bigint COMMENT '发送用户ID'")
    private Long fromUid;

    @Column(name = "to_id",columnDefinition = "bigint COMMENT '接收用户ID'")
    private Long toUid;

    @Column(name = "content",columnDefinition = "varchar(255) COMMENT '评论内容'")
    private String content;


}
