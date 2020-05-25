package com.zhangguo.Spring051.ioc01;

import entities.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   @org.junit.jupiter.api.Test
    public void testStoreBook(){
        BookService bookservice = new BookService();
        bookservice.storeBook( "《Spring MVC权威指南 第一版》" );
    }
    @org.junit.jupiter.api.Test
    public void testMethod3() throws Exception{
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springCfg.xml");
        Thread.sleep(2000);
        Person mark1=ctx.getBean("mark",Person.class);
        System.out.println("Person初始化了");
        Thread.sleep(2000);
        Person mark2=ctx.getBean("mark",Person.class);
        System.out.println("Person初始化了");
        System.out.println(mark1==mark2);
    }
}
