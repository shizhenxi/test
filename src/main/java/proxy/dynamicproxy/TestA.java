package proxy.dynamicproxy;

public class TestA {
    public static void main(String[] args) {
        TestA a = new TestA();
        System.out.println(a.f( 2 ));
    }
    public int f(int n){
        if(n == 1){
            return 1;
        }
        return  n*f(n-1);
    }
}
