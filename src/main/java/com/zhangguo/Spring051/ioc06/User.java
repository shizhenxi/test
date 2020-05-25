package com.zhangguo.Spring051.ioc06;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("user1")
@Lazy
public class User {
    public User(){
        System.out.println("创建User对象");
    }
    public User(String msg){
        System.out.println("创建User对象"+msg);
    }
    public void show(){
        System.out.println("一个学生对象！");
    }

}
