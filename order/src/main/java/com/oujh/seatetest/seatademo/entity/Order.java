package com.oujh.seatetest.seatademo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@TableName("t_order")
public class Order {

    private int id;
    private String orderName;
    private int price;
    private Date createTime;
    private Integer storageId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }
}
