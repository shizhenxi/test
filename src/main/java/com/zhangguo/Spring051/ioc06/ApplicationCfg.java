package com.zhangguo.Spring051.ioc06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 容器的配置类
 */
@Configuration
@ComponentScan(basePackages="com.zhangguo.Spring051.ioc06")
public class ApplicationCfg {
    @Bean
    @Lazy
    public User getUser(){
        return new User("成功");
    }
}
