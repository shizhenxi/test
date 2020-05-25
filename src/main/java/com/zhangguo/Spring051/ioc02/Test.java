package com.zhangguo.Spring051.ioc02;

import com.zhangguo.Spring051.ioc02.BookService;
import entities.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   @org.junit.jupiter.api.Test
    public void testStoreBook(){
       //容器
       ApplicationContext ctx=new ClassPathXmlApplicationContext("IOCBeans02.xml");
       BookService bookservice=ctx.getBean(BookService.class);
       bookservice.storeBook("《Spring MVC权威指南 第二版》");
    }

}
