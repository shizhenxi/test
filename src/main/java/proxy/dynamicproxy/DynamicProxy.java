package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

public class DynamicProxy implements InvocationHandler {
    Object target;

    public Object getProxyObject(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),target.getClass().getInterfaces(),this  );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long pan = System.currentTimeMillis();
        lazy();
        Object result = method.invoke(target,args);
        System.out.println("用时："+(System.currentTimeMillis()-pan));
        return result;
    }
    public void lazy() {
        try {
            Thread.sleep( new Random(  ).nextInt(1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
