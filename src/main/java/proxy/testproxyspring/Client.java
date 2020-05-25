package proxy.testproxyspring;

import org.springframework.aop.framework.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        //代理工厂
        ProxyFactory proxy = new ProxyFactory(  );
        //设置要代理的对象
        proxy.setTarget( new Math() );


        //设置通知
        proxy.addAdvice( new Before() );
        proxy.addAdvice( new After() );
        proxy.addAdvice( new Surround() );
        proxy.addAdvice( new TimeSpanAdvice() );
        IMath math = (IMath) proxy.getProxy();
        int n1 = 1000,n2 = 100;
        math.add( n1,n2 );


        ProxyFactory factory = new ProxyFactory(  );
        factory.setTarget( new Student() );

        factory.addAdvice( new Before() );

        Student stu = (Student) factory.getProxy();
        stu.study();


    }
}
