package com.oujh.seatetest.seatademo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oujh.seatetest.seatademo.mapper")
public class StorageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
	}

}
