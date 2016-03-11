package com.webster.learn.s02mybatis.entity;

import javax.persistence.*;

@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bland;

    private String color;

    private Long price;

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
     * @return bland
     */
    public String getBland() {
        return bland;
    }

    /**
     * @param bland
     */
    public void setBland(String bland) {
        this.bland = bland == null ? null : bland.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Long price) {
        this.price = price;
    }
}