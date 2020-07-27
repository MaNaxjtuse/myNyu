package com.example.demo997;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo997")
public class Demo997Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo997Application.class, args);
    }

}
