package com.zhangguo.Spring051.ioc06;

/**
 * 图书数据访问接口
 */
public interface IBookDao {
    /**
     * 添加图书
     */
    public String addBook(String bookName);
}
