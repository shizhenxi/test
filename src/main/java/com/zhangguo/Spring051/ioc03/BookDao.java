package com.zhangguo.Spring051.ioc03;

import org.springframework.stereotype.Repository;

/**
 * 图书数据访问实现类
 */
@Repository
public class BookDao implements IBookDao {
    /**
     * 添加图书
     * @param bookName
     */
    public String addBook(String bookName) {

       return "添加图书"+bookName+"成功！";
    }
}
