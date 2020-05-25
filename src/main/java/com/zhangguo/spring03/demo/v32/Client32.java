package com.zhangguo.spring03.demo.v32;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client32 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "springCfg32.xml" );
        DbUtils dao = ctx.getBean( DbUtils.class );
        System.out.println(dao);
    }
}
