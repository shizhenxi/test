package spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        //IOC容器
        ApplicationContext cxt = new ClassPathXmlApplicationContext( "beans02.xml" );
        Person tom  = cxt.getBean( "tom" ,Person.class);
        //Address address = cxt.getBean( "address",Address.class );
        Person rose1  = cxt.getBean( "rose" ,Person.class);
        Person rose2  = cxt.getBean( "rose" ,Person.class);
        //System.out.println( rose1 );
        //System.out.println( rose2 );
        System.out.println(tom);
        System.out.println( rose1 == rose2 );

    }
}
