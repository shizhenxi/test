package com.zhangguo.Spring051.ioc02;


import org.springframework.stereotype.Component;

/**
 * 图书数据访问实现类
 */
@Component("bookdaoObj")
public class BookDAO implements IBookDAO {
    public String addBook(String bookname) {
        return "添加图书"+bookname+"成功！";
    }
}