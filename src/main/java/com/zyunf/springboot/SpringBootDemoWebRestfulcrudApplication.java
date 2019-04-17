package com.zyunf.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.zyunf.springboot.mapper")
@SpringBootApplication
public class SpringBootDemoWebRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoWebRestfulcrudApplication.class, args);
    }

}
