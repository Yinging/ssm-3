package com.webster.learn.s03shiro.controller;


import com.webster.learn.s03shiro.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "learn")
public class LearnLoginController {

	public static Logger log = LoggerFactory.getLogger(LearnLoginController.class);


    @RequestMapping(value = "login",method = RequestMethod.GET)
         public String login() {
        return "learn/login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String loginPost() {
        return "learn/login";
    }

    @RequestMapping(value = "logout",method = RequestMethod.GET)
    public String logout() {
        UserUtils.logout();
        return "learn/learn";

    }

}
