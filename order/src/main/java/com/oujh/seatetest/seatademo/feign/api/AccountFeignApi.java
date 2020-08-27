package com.oujh.seatetest.seatademo.feign.api;

import com.oujh.seatetest.seatademo.feign.dto.AccountDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RequestMapping("/account")
@FeignClient(value="account-service")
public interface AccountFeignApi {

    @GetMapping("/reduceBalance")
    public AccountDto reduceBalance(@RequestParam("accountId") Integer accountId,
                                    @RequestParam("price") Double price);

}
