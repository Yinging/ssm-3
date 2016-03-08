package com.webster.learn.s03shiro.security;

import com.webster.learn.s02mybatis.entity.Learner;
import com.webster.learn.s02mybatis.service.LearnerService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;


/**
 * 自定义Realm，相当于Shiro和数据库之间的dao
 */
public class LearnRealm extends AuthorizingRealm {

    @Resource
    private LearnerService learnService;

    /**
     * 回调函数,用于权限验证
     *
     * @param principals 用户名
     * @return 验证信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        //todo 获取权限
        return null;
    }

    /**
     * 回调函数,用于登录验证，通过LearnerService查找数据库
     *
     * @param token 钥匙
     * @return 验证信息
     * @throws AuthenticationException 无法验证的异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String name = (String) token.getPrincipal();
        // 调用learnService查询是否有此用户  
        Learner learner = learnService.findByName(name);
        if (learner == null) {
            // 抛出 帐号找不到异常
            throw new UnknownAccountException();
        }
        // 判断帐号是否锁定  
        if (Boolean.TRUE.equals(learner.getLocked())) {
            // 抛出 帐号锁定异常  
            throw new LockedAccountException();
        }
        // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配  
        return new SimpleAuthenticationInfo(
                learner.getName(), // 用户名
                learner.getPassword(), // 密码
                ByteSource.Util.bytes(learner.getCredentialsSalt()),// salt=learnername+salt
                getName() // realm name
        );

    }

    /**
     * 清除缓存
     */
    public void clearAllCache() {
        getAuthenticationCache().clear();
        getAuthorizationCache().clear();
    }

}