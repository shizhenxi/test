package proxy.testproxyspring;

import org.springframework.aop.framework.ProxyFactory;

public abstract class DynamicProxy {
    public  static <T> T getProxyObject(Object target){
        //代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(  );
        //设置要代理的对象
        proxyFactory.setTarget( target );
        //设置通知
        proxyFactory.addAdvice( new TimeSpanAdvice() );

        return (T)proxyFactory.getProxy();

    }
}
