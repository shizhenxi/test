package spring12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class BookStore {
    @Autowired
    BookService service;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "beans12.xml" );
        BookStore store = ctx.getBean( BookStore.class );
        store.service.addNewBook();
        A a = ctx.getBean( "a", A.class );
        System.out.println(a);
    }

}
@Component
class A {
}
@Component
class B extends A{

}
