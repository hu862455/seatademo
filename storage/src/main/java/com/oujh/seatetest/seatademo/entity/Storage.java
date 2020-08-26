package com.oujh.seatetest.seatademo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@Entity(name="t_storage")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
