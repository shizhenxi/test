package spring13;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InjectTest {
    //注入给构造方法
    @Autowired
    public InjectTest(IUserDao dao2){

        this.dao2 = dao2;
    }
    //注入给成员变量，字段
    @Resource
    IUserDao dao1;
    IUserDao dao2;
    IUserDao dao3;
    IUserDao dao4;
    //注入给属性
    @Autowired
    public void setDao3(IUserDao dao3){
        this.dao3 = dao3;
    }
    //注入给方法参数
    @Autowired
    public void injectDao4(IUserDao dao4,IUserDao dao5){

        this.dao4 = dao4;
        System.out.println(dao5);
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans13.xml" );
        InjectTest obj = ctx.getBean( InjectTest.class );
        System.out.println(obj.dao1+"@1");
        System.out.println(obj.dao2+"@2");
        System.out.println(obj.dao3+"@3");
        System.out.println(obj.dao4+"@4");
    }


}

interface IUserDao{

}

@Repository
@Scope("prototype")
class UserDao implements IUserDao{

}
