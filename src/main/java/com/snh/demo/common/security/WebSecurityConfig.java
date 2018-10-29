package com.snh.demo.common.security;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    public void init(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/user/index");
        super.init(web);
    }



}
