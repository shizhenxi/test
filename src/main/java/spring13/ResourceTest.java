package spring13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ResourceTest {
    @Resource(name="carB")
    ICarDao dao;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans13.xml" );
        ResourceTest bean = ctx.getBean( ResourceTest.class );
        System.out.println(bean.dao);
    }
}
interface ICarDao{

}
@Repository("carA")
class CarDaoA implements ICarDao{

}
@Repository("carB")
class CarDaoB implements ICarDao{

}
