package com.snh.demo.common.base.domain;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class BaseEntity  implements Serializable {

    @Id
    @Column(name = "id",columnDefinition = "bigint COMMENT '主键'")
    private Long id;

    @CreationTimestamp
    @Column(name = "create_time",columnDefinition = "DATETIME COMMENT '创建时间'")
    private Date createTime;

    @Column(name = "create_user_name",columnDefinition = "varchar(120) COMMENT '创建人'")
    private String  createUserName;

    @UpdateTimestamp
    @Column(name = "update_time",columnDefinition = "DATETIME COMMENT '修改时间'")
    private Date updateTime;

    @Column(name = "update_user_name",columnDefinition = "varchar(120) COMMENT '修改人'")
    private String updateUserName;

    @Column(name = "status",columnDefinition = "bigint COMMENT '数据状态 0可用，1删除'")
    private Integer status=0;

    @Column(name = "enable",columnDefinition = "bigint COMMENT '禁用状态：默认0 可用，1禁用'")
    private Integer enable=0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
