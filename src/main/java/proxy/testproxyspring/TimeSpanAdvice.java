package proxy.testproxyspring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Random;

public class TimeSpanAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation mi) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = mi.proceed();
        System.out.println("耗时："+(System.currentTimeMillis()-start));
        return result;
    }
    public void lazy(){
        try {
            Thread.sleep( new Random(  ).nextInt(1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
