package com.snh.demo.controller;


import com.snh.demo.common.base.controller.BaseController;
import com.snh.demo.common.utils.VerifyCodeUtil;
import com.snh.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class LoginController extends BaseController<UserInfo> {


    @PostMapping("/register")
    public Object registerUser(HttpServletRequest request,UserInfo user){


        return success("注册成功!");
    }


    @RequestMapping("/login")
    public Object login(HttpServletRequest request,UserInfo user){


        return success();
    }


    @RequestMapping("/index")
    public ModelAndView getIndex(){

        return new ModelAndView("index");
    }

    @RequestMapping("/verity")
    public void  getVerityCode(HttpServletRequest request,String phone){
        String verityCode= VerifyCodeUtil.generateVerifyCode(6,"1234567890");
        HttpSession session=request.getSession();
        session.setAttribute("verify",verityCode);




    }

}
