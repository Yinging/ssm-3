package com.webster.learn.s03shiro;

import com.webster.learn.s02mybatis.entity.Learner;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
	private String algorithmName = "md5";
	private int hashIterations = 2;

	public void setRandomNumberGenerator(
			RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public void encryptPassword(Learner learner) {

		learner.setSalt(randomNumberGenerator.nextBytes().toHex());

		String newPassword = new SimpleHash(algorithmName, learner.getPassword(),
				ByteSource.Util.bytes(learner.getCredentialsSalt()),
				hashIterations).toHex();

		learner.setPassword(newPassword);
	}

	public static void main(String[] args) {
		String algorithmName = "md5";
		String learnername = "zhaoliu";
		String password = "666666";
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
		int hashIterations = 3;
		SimpleHash hash = new SimpleHash(algorithmName, password,
				learnername + salt, hashIterations);
		String encodedPassword = hash.toHex();
		System.out.println("password="+encodedPassword);
		System.out.println("salt="+salt);
	}

}
