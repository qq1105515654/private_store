package com.snh.demo.domain;

import org.springframework.beans.factory.annotation.Value;

public class MailInfo {

    private String host;

    private String userName;

    private String password;

    private Integer port;

    public String getHost() {
        return host;
    }

    @Value("${spring.mail.host}}")
    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    @Value("${spring.mail.username}")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Value("${spring.mail.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    @Value("${spring.mail.port}")
    public void setPort(Integer port) {
        this.port = port;
    }
}
