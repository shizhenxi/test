package proxy.dynamicproxy;

public class Math implements IMath {
    public void add(int n1, int n2){
        System.out.println(n1 + " + " + n2 + " = " +(n1 + n2));
    }
    public void sub(int n1, int n2){
        System.out.println(n1 + " - " + n2 + " = " +(n1 - n2));
    }
    public void mut(int n1, int n2){
        System.out.println(n1 + " * " + n2 + " = " +n1 * n2);
    }
    public void div(int n1, int n2){
        System.out.println(n1 + " / " + n2 + " = " +n1 / n2);
    }


}
