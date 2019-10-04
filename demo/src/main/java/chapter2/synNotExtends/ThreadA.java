package chapter2.synNotExtends;

import chapter2.synchronizedMethodLockObject.MyObject;

public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
