package com.oujh.seatetest.seatademo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oujh.seatetest.seatademo.entity.Account;
import com.oujh.seatetest.seatademo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @GetMapping("/reduceBalance")
    public Account reduceBalance(@RequestParam("accountId") Integer accountId,
                                 @RequestParam("price") Double price){
        Account account = accountMapper.selectById(accountId);
        if(account.getBalance() > price) {
            account.setBalance(account.getBalance() - price);
            account.setUpdateTime(new Date());
            accountMapper.updateById(account);
        }else{
            throw new RuntimeException("余额不足");
        }
        return account;
    }

    @GetMapping()
    public IPage<Account> getOrders(@RequestParam("currPage") int currPage, @RequestParam("pageSize") int pageSize){
        IPage<Account> page = new Page<Account>();
        page.setCurrent(currPage);
        page.setSize(pageSize);
        return accountMapper.selectPage(page, null);
    }

}
