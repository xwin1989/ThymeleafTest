package com.nx.domain;

/**
 * Created by neal.xu on 2014/10/9.
 */
public class User {
    private Integer id;
    private String userName;
    private Money money;

    public User(Integer id, String userName, Money money) {
        this.userName = userName;
        this.id = id;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
