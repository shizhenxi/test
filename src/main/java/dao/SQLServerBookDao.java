package dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("mssql")
@Lazy
public class SQLServerBookDao implements IBookDao {

    public SQLServerBookDao(){
        System.out.println("SQLServerBookDao构造方法被调用");
    }
    /**
     * 添加图书
     * @param name
     */
    public void add(String name) {
        System.out.println("添加图书到SQLServer数据库成功："+name);
    }
    @PostConstruct
    public void init(){
        System.out.println("SQLServerBookDao初始化完成了！");

    }
    @PreDestroy
    public void destory(){
        System.out.println("SQLServerBookDao准备销毁了！");
    }
}
