package com.oujh.seatetest.seatademo.repository;

import com.oujh.seatetest.seatademo.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
public interface StorageRepository extends JpaRepository<Storage, Integer> {
}
