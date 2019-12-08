package chapter3.waitOld;

import chapter2.synNotExtends.Sub;

public class ThreadsSubtract extends Thread {

    private Subtract r;

    public ThreadsSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
