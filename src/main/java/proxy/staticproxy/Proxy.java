package proxy.staticproxy;

import java.util.Random;

public class Proxy implements IMath {
    IMath target = new Math();
    public void add(int n1, int n2) {
        long pan = System.currentTimeMillis();
        lazy();
        target.add( n1,n2 );
        System.out.println("用时："+(System.currentTimeMillis()-pan));
    }

    public void sub(int n1, int n2) {
        long pan = System.currentTimeMillis();
        lazy();
        target.sub( n1,n2 );
        System.out.println("用时："+(System.currentTimeMillis()-pan));
    }

    public void mut(int n1, int n2) {
        long pan = System.currentTimeMillis();
        lazy();
        target.mut( n1,n2 );
        System.out.println("用时："+(System.currentTimeMillis()-pan));
    }

    public void div(int n1, int n2) {
        long pan = System.currentTimeMillis();
        lazy();
        target.div( n1,n2 );
        System.out.println("用时："+(System.currentTimeMillis()-pan));
    }

    public void lazy() {
        try {
            Thread.sleep( new Random(  ).nextInt(1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
