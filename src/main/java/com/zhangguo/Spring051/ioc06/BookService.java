package com.zhangguo.Spring051.ioc06;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 图书业务类
 */
@Service
public class BookService {
    @Resource
    IBookDao bookDao;
    public void storeBook(String bookName){
        System.out.println("图书上货");
        String result = bookDao.addBook( bookName );
        System.out.println(result);
    }
}
