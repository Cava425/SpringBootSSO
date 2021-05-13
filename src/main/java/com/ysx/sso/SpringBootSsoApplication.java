package com.ysx.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ysx.sso.mapper")
public class SpringBootSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSsoApplication.class, args);
    }

}
