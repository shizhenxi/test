package dao;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.stereotype.Component;

@Component
public class MySqlBookDao implements IBookDao {
    /**
     * 添加图书
     * @param name
     */
    public void add(String name) {
        System.out.println("添加图书到MySQL数据库成功："+name);
    }
}
