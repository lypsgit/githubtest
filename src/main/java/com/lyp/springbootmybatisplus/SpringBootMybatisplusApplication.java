package com.lyp.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.lyp.springbootmybatisplus.mapper")
@SpringBootApplication
public class SpringBootMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisplusApplication.class, args);
    }

}
