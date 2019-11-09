package chapter2.test12;

import chapter2.test11.MyObject;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
