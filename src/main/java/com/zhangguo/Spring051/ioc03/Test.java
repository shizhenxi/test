package com.zhangguo.Spring051.ioc03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void testMethod01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "IOCBeans03.xml" );
        BookService bookService = ctx.getBean( BookService.class );
        bookService.storeBook( "《Java从入门到精通》" );
    }
}
