package proxy.proxyAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans.xml" );
        Math math = ctx.getBean( "proxy",Math.class );
        int n1 = 1000,n2 = 100;
        math.add( n1,n2 );
    }
}
