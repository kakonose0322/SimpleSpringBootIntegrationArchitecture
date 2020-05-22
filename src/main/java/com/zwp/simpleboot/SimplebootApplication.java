package com.zwp.simpleboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

// 自动扫描接口
@MapperScan("com.zwp.simpleboot.mapper")
@SpringBootApplication
// 此注解，如果项目中需要使用servlet和filter
// 可以在类中使用注解实现，主要配置Durid监控时需要用到
@ServletComponentScan
public class SimplebootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimplebootApplication.class, args);
    }
}
