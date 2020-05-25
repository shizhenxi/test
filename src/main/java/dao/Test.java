package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void testMethod6() throws Exception{
        //通过spring配置文件初始化一个容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "springCfg2.xml" );
        Thread.sleep( 6000 );
        IBookDao dao = ctx.getBean( "mssql", IBookDao.class );
        dao.add( "<<Java EE>>" );
    }
    @org.junit.jupiter.api.Test
    public void testMethod5() throws Exception{
        //通过spring配置文件初始化一个容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "springCfg2.xml" );
        IBookDao dao = ctx.getBean( "mySqlBookDao", IBookDao.class );
        dao.add( "<<Java EE>>" );
    }
}
