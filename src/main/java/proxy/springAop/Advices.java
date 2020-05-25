package proxy.springAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 通知
 */
public class Advices {
    //前置通知
    public void before(JoinPoint jp){
        System.out.println("-----before-----");
        System.out.println("方法名："+jp.getSignature()+"，参数："+jp.getArgs().length+"，代理对象："+jp.getTarget());
    }
    //后置通知
    public void after(JoinPoint jp){
        System.out.println("-----after-----");
    }
    //返回值通知
    public void afterReturning(JoinPoint jp, Object result){
        System.out.println("返回值通知");

    }
    //抛出异常通知
    public void afterThrowing(JoinPoint jp, Exception e){

    }
    //环绕通知
    //环绕通知需要携带ProceedingJoinPoint类型的参数
    //环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
    //而且环绕通知必须有返回值，返回值即为目标方法的返回值
    public Object aroundMethod(ProceedingJoinPoint pjp){
        return null;
    }

}
