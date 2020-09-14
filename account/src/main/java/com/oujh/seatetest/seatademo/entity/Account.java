package com.oujh.seatetest.seatademo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@TableName("t_account")
public class Account {

    private int id;
    private String userName;
    private double balance;        //余额
    private Date updateTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
