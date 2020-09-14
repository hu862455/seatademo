package com.oujh.seatetest.seatademo.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@TableName("t_storage")
public class Storage {

    private int id;
    private String storageName;
    private int num;
    private Date updateTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStorageName() {
        return storageName;
    }
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
