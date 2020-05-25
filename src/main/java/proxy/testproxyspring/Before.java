package proxy.testproxyspring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
//前置通知
public class Before implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("---前置通知---");
    }
}
//后置通知
class After implements AfterReturningAdvice{

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("---后置通知---");
    }
}
//环绕通知
class Surround implements MethodInterceptor{
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("---环绕通知前---"+mi.getMethod());
        Object result = mi.proceed();
        System.out.println("---环绕通知后---"+mi.getArguments());
        return result;
    }
}
