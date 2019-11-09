package chapter2.twoStop;

import chapter2.doubleSynBlockOneTwo.ObjectService;

public class Service {
    Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            System.out.println("MethodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {}
            System.out.println("MethodA end");
        }
    }

    Object object2 = new Object();

    public synchronized void methodB() {
        synchronized (object2) {
            System.out.println("MethodB begin");
            System.out.println("MethodB end");
        }
    }
}
