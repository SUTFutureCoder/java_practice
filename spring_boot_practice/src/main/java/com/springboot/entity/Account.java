package com.springboot.entity;

import javax.persistence.*;

/**
 * 账户实体
 */
@Entity
@Table(name = "t_account")
public class Account {

    @Id
    @GeneratedValue
    private Integer id;

    private String userName;

    @Column(length = 50)
    private float balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}
