package com.oujh.seatetest.seatademo.repository;

import com.oujh.seatetest.seatademo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
