package com.zhangguo.Spring051.ioc06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void testStoreBook(){
        //容器，注解配置应用程序容器，spring通过反射ApplicationCfg.class初始化容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext( ApplicationCfg.class );
        BookService bookService = ctx.getBean( BookService.class );
        bookService.storeBook( "《Spring MVC权威指南 第四版》" );
        User user1 = ctx.getBean( "user1",User.class );
        user1.show();
        User getUser = ctx.getBean( "getUser",User.class );
        getUser.show();
    }
}
