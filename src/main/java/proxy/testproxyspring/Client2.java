package proxy.testproxyspring;

public class Client2 {
    public static void main(String[] args) {

        IMath math = DynamicProxy.getProxyObject( new Math() );
        int n1 = 1000,n2 = 100;
        math.add( n1,n2 );

        Student stu = DynamicProxy.getProxyObject( new Student() );
        stu.study();


    }
}
