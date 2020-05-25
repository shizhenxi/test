package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class TestMath {
    public static void main(String[] args) {
        IMath math = (IMath)new DynamicProxy().getProxyObject(new Math());
        int n1 = 1000; int n2 = 200;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mut(n1,n2);
        math.div(n1,n2);
    }


}
