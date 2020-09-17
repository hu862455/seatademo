package com.oujh.seatetest.seatademo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oujh.seatetest.seatademo.entity.Order;
import com.oujh.seatetest.seatademo.feign.api.AccountFeignApi;
import com.oujh.seatetest.seatademo.feign.api.StorageFeignApi;
import com.oujh.seatetest.seatademo.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageFeignApi storageFeignApi;
    @Autowired
    private AccountFeignApi accountFeignApi;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") Integer id){
        return orderMapper.selectById(id);
    }

    @GetMapping()
    public IPage<Order> getOrders(@RequestParam("currPage") int currPage, @RequestParam("pageSize") int pageSize){
        IPage<Order> page = new Page<Order>();
        page.setCurrent(currPage);
        page.setSize(pageSize);
        return orderMapper.selectPage(page, null);
    }

    /**
     * 创建订单
     * 创建订单完成后会调用库存服务和账户服务扣减赋存和余额
     * @param storageId
     * @param accountId
     * @return
     */
    @GetMapping("/save")
    @GlobalTransactional(name="create-order", rollbackFor = Exception.class)    //开启全局事务
    public Order saveOrder(@RequestParam("storageId") Integer storageId, @RequestParam("accountId") Integer accountId){
        Order order = new Order();
        order.setCreateTime(new Date());
        order.setOrderName("test");
        order.setPrice(50);
        orderMapper.insert(order);
        //模拟扣减库存
        storageFeignApi.reduceStorage(storageId);
        //模拟扣减余额
        accountFeignApi.reduceBalance(accountId, 10.5);
        return order;
    }

}
