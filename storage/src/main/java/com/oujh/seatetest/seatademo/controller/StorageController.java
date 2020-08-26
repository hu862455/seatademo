package com.oujh.seatetest.seatademo.controller;

import com.oujh.seatetest.seatademo.entity.Storage;
import com.oujh.seatetest.seatademo.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageRepository storageRepository;

    @GetMapping("/reduce")
    @Transactional
    public Storage reduceStorage(@RequestParam("storageId") Integer storageId){
        Storage storage = storageRepository.findById(storageId).get();
        if(storage.getNum() > 0) {
            storage.setNum(storage.getNum() - 1);
            storageRepository.save(storage);
        }else{
            throw new RuntimeException("库存不足");
        }
        return storage;
    }

}
