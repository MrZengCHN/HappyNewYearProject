package com.example.jingxin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.jingxin.mapper")
public class JingXinApplication {

    public static void main(String[] args) {
        SpringApplication.run(JingXinApplication.class, args);
    }

}
