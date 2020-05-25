package proxy.proxyAop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//前置通知
public class AfterAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("---前置通知---");
    }
}


