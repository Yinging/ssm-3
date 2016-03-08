package com.webster.learn.s03shiro.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.UnavailableSecurityManagerException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Principal;

/**
 * ToDo...
 * Created by Vince on 2016/3/8.
 */


public class UserUtils {
    public static Logger log = LoggerFactory.getLogger(UserUtils.class);

    /**
     * 获取当前登录者对象
     */
    public static Principal getCurrentUser(){
        try{
            Subject subject = SecurityUtils.getSubject();
            Principal principal = (Principal)subject.getPrincipal();
            if (principal != null){
                return principal;
            }
        }catch (UnavailableSecurityManagerException | InvalidSessionException ignored) {
            log.debug("系统错误：{}",ignored);
            ignored.printStackTrace(); // 输出到控制台
        }
        return null;
    }

    /**
     * 获取当前登录者对象
     */
    public static void logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }
}