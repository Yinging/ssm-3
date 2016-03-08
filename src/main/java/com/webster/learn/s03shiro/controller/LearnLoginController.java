package com.webster.learn.s03shiro.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "learn")
public class LearnLoginController {

	public static Logger log = LoggerFactory.getLogger(LearnLoginController.class);


    /*显示登录界面*/
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login() {
        /*todo 判断用户已登录,则跳转首页*/
        return "learn/login";
    }


    /*登出的实现由FormAuthenticationFilter提供*/
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String loginPost() {
        return "learn/login";
    }

    /*登出的实现由Shiro提供*/
    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout() {
        return "learn/learn";

    }

}
