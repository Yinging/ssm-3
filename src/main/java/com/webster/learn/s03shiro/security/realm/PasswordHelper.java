package com.webster.learn.s03shiro.security.realm;

import com.webster.learn.s02mybatis.entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Service;


/**
 * 密码md5加密储存的帮助类,
 * 主要提供encryptPassword()函数,传入一个User,会写入加密后的密码,和盐
 */
@Service
public class PasswordHelper {

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 3;

    public void encryptPassword(User user) {

        String salt = randomNumberGenerator.nextBytes().toHex();

        String newPassword = new SimpleHash(algorithmName, user.getPassword(),
                user.getUsername()+salt,
                hashIterations).toHex();

        user.setSalt(salt);
        user.setPassword(newPassword);
    }

	public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}


    /*这是上面代码的简化不规范模式,规范用法是Test文件里的*/
    public static void main(String[] args) {
        String algorithmName = "md5";
        String username = "zhaoliu";
        String password = "666666";
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        int hashIterations = 3;
        SimpleHash hash = new SimpleHash(algorithmName, password,
                username + salt, hashIterations);
        String encodedPassword = hash.toHex();
        System.out.println("password="+encodedPassword);
        System.out.println("salt="+salt);
    }


}
