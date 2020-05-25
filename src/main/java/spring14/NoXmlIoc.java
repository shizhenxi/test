package spring14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

public class NoXmlIoc {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext( AppCfg.class );
        IcarDao dao1 = ctx.getBean( "oracleDao",IcarDao.class );
        dao1.add( "Spring Pro Oracle" );
        IcarDao dao2 = ctx.getBean( "mysqlDao",IcarDao.class );
        dao2.add( "Spring Pro Mysql" );

    }
}
interface IcarDao{
    void add(String name);
}
@Repository("oracleDao")
class CarDao implements IcarDao{

    public void add(String name) {

        System.out.println("添加" + name + "成功！");
    }
}
@Configuration
@ComponentScan(basePackages = "spring14")
class AppCfg{

    @Bean
    IcarDao mysqlDao(){
        return new CarDao();
    }
}
