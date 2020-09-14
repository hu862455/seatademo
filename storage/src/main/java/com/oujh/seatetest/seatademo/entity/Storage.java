package com.oujh.seatetest.seatademo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@TableName("t_storage")
public class Storage {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String storageName;
    private int num;
    private Date updateTime;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
