package com.oujh.seatetest.seatademo.controller;

import com.oujh.seatetest.seatademo.entity.Account;
import com.oujh.seatetest.seatademo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/reduceBalance")
    @Transactional
    public Account reduceBalance(@RequestParam("accountId") Integer accountId,
                                 @RequestParam("price") Double price){
        Account account = accountRepository.findById(accountId).get();
        if(account.getBalance() > price) {
            account.setBalance(account.getBalance() - price);
            account.setUpdateTime(new Date());
            accountRepository.save(account);
        }else{
            throw new RuntimeException("余额不足");
        }
        return account;
    }

}
