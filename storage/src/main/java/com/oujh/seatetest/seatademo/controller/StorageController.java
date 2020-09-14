package com.oujh.seatetest.seatademo.controller;

import com.oujh.seatetest.seatademo.entity.Storage;
import com.oujh.seatetest.seatademo.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageMapper storageMapper;

    @GetMapping("/reduce")
    public Storage reduceStorage(@RequestParam("storageId") Integer storageId){
        Storage storage = storageMapper.selectById(storageId);
        if(storage.getNum() > 0) {
            storage.setNum(storage.getNum() - 1);
            storageMapper.updateById(storage);
        }else{
            throw new RuntimeException("库存不足");
        }
        return storage;
    }

}
