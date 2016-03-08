package com.webster.learn.s01mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;


/**
 * 用于测试日志的类
 * Created by Webster on 2016/3/1.
 */
@Controller
@RequestMapping("learn/log")
public class LearnLog4jController {

    public static Logger log = LoggerFactory.getLogger(LearnLog4jController.class);
    public String returnView = "learn/learn";

    Integer id = 123455555;
    String symbol = "占位符";

    @RequestMapping(method = RequestMethod.GET)
    public String logIndex() {
        log.debug("Log4j 建议只使用 ERROR、WARN、INFO、DEBUG 四个级别");
        log.debug("debug信息");
        log.info("info信息");
        log.warn("warn信息");
        log.error("error信息");
        return returnView;

    }

    @RequestMapping(value = "debug", method = RequestMethod.GET)
    public String logDebug() {
        log.debug("测试日志输出～～～～～～～～～～～～～～～～～: {} and symbol : {} ", id, symbol);
        return returnView;

    }

    @RequestMapping(value = "error", method = RequestMethod.GET)
    public String logError() {
        log.error("测试error～～～～～～～～～～～～～～～～");
        return returnView;

    }

    @RequestMapping(value = "exception", method = RequestMethod.GET)
    public String logException() {
        log.info("三个参数:agrs1:{}; agrs2:{} 的info级别日志", "占位符1", "参数2",
                new IOException("测试抛出IO异常信息"));
        return returnView;

    }

}
