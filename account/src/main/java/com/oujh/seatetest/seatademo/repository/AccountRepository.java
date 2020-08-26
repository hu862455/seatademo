package com.oujh.seatetest.seatademo.repository;

import com.oujh.seatetest.seatademo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
