package com.zhangguo.Spring051.ioc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 图书业务类
 */
@Service
public class BookService {
    @Resource(name = "bookDao")
    IBookDao bookDao;
    public IBookDao getBookDao(){
        return bookDao;
    }



    public void setBookDao( IBookDao bookDao){
        this.bookDao = bookDao;
    }
    public void storeBook(String bookName){
        System.out.println("图书上货");
        String result = bookDao.addBook( bookName );
        System.out.println(result);

    }

}
