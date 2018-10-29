package com.snh.demo.domain;

import com.snh.demo.common.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserInfo  extends BaseEntity {

    @Column(name = "nick",columnDefinition = "varchar(255) COMMENT '用户昵称'")
    private String nick;

    @Column(name = "phone",columnDefinition = "varchar(255) COMMENT '用户名'")
    private String userName;

    @Column(name = "password",columnDefinition = "varchar(255) COMMENT '密码'")
    private String password;

    @Column(name = "private_key",columnDefinition = "varchar(255) COMMENT '用户的加密私钥'")
    private String privateKey;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
