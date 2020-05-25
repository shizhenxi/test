package proxy.testproxycglib;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

public class DynamicProxy implements MethodInterceptor {
    Object target;



    public void lazy(){
        try {
            Thread.sleep( new Random(  ).nextInt( 1000 ) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Object getProxyObject(Object object) {
        this.target = object;
        //新增一个代码生成器对象
        Enhancer enhancer = new Enhancer();
        //指定拦截回调对象，当目标对象中的方法被调用时谁来拦截
        enhancer.setCallback( this );
        //设置被代理对象的类型
        enhancer.setSuperclass( target.getClass() );
        //返回生成的代码
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前");
        Object result = methodProxy.invoke( target,objects);
        System.out.println(result);
        System.out.println("后");
        return result;
    }
}
