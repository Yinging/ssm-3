package com.webster.learn.s01mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 返回learn的首页
 */
@Controller
@RequestMapping(value = "learn")
public class LearnIndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "learn/learn";
    }


}
