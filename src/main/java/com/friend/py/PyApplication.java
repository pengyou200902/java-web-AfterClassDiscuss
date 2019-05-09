package com.friend.py;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.friend.py.dao")
public class PyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PyApplication.class, args);
    }

}

