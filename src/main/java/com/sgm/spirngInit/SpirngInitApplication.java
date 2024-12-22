package com.sgm.spirngInit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.sgm.spirngInit.mapper")
@EnableAspectJAutoProxy(exposeProxy = true) //暴露代理对象
public class SpirngInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpirngInitApplication.class, args);
    }

}
