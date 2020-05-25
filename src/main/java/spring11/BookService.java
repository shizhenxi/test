package spring11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookService {
    public static void main(String[] args) {
        //容器
        ApplicationContext cxt =
                new ClassPathXmlApplicationContext( "beans11.xml" );
        //从容器中获得对象
        IBookDao dao1 = cxt.getBean( "bookDao", IBookDao.class );
        IBookDao dao2 = cxt.getBean( "bookDao", IBookDao.class );
        System.out.println(dao1 == dao2);
        IBookDao dao = cxt.getBean( "bookDao", IBookDao.class );
        dao.add();
    }
}
