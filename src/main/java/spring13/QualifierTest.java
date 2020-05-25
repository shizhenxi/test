package spring13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class QualifierTest {
    @Autowired
    @Qualifier("bookDaoA")
    IBookDao dao;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans13.xml" );
        QualifierTest obj = ctx.getBean( QualifierTest.class );
        System.out.println(obj.dao);
    }




}
interface IBookDao{

}
@Repository
class BookDaoA implements IBookDao{

}
@Repository
class BookDaoB implements IBookDao{

}
