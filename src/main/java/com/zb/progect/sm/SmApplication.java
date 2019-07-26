package com.zb.progect.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zb.progect.sm.dao")

public class SmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmApplication.class, args);
    }

}
