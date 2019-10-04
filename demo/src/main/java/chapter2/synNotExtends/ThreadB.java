package chapter2.synNotExtends;

import chapter2.synchronizedMethodLockObject.MyObject;

public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
