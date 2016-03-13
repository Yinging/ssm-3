package com.webster.learn.s02mybatis.entity;

import javax.persistence.*;

@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private Short age;

    private String salt;

    private Boolean locked;

    private Long deposit;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return age
     */
    public Short getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * @param locked
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * @return deposit
     */
    public Long getDeposit() {
        return deposit;
    }

    /**
     * @param deposit
     */
    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }
}