package proxy.test;

public class Test {

    IMath math = (IMath) new DynamicProxy().getProxyObject( new Math() );
    int n1 = 1000; int n2 = 100;
    @org.junit.jupiter.api.Test
    public void testA(){
        math.add(n1,n2);
    }

}
