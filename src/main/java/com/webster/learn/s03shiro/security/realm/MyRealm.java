package com.webster.learn.s03shiro.security.realm;

import com.webster.learn.s02mybatis.entity.User;
import com.webster.learn.s02mybatis.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;


/**
 * 自定义Realm，相当于Shiro和数据库之间的dao
 */
public class MyRealm extends AuthorizingRealm {

    @Resource
    UserService userService;

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
        //查看当前用户是否存在
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("username",name);
        User user = userService.selectByExample(example).get(0);

        if (user == null) {
            // 抛出 帐号找不到异常
            throw new UnknownAccountException();
        }
        // 判断帐号是否锁定
        if (user.getLocked().equals(Boolean.TRUE)) {
            // 抛出 帐号锁定异常
            throw new LockedAccountException();
        }
        // 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配  
        return new SimpleAuthenticationInfo(
                user.getUsername(), // 用户名
                user.getPassword(), // 密码
                ByteSource.Util.bytes(user.getUsername()+user.getSalt()),// salt=username+salt
                getName() // realm name
        );

    }


}