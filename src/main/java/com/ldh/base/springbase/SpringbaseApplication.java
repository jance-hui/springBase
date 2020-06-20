package com.ldh.base.springbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldh.base.springbase.mapper")
public class SpringbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbaseApplication.class, args);
    }

}
