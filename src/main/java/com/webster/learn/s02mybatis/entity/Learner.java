package com.webster.learn.s02mybatis.entity;

import com.google.common.base.Objects;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * user  用于ehcache和shiro的测试
 * Created by Webster on 2016/2/22.
 */
@Component
public class Learner implements Serializable{



    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String password;
    private String salt;
    private Integer age;

    private Boolean locked = Boolean.FALSE;
    public Learner() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getCredentialsSalt() {
        return name + salt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learner learner = (Learner) o;
        return Objects.equal(id, learner.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Learner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", age=" + age +
                ", locked=" + locked +
                '}';
    }
}
