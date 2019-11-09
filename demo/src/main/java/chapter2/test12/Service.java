package chapter2.test12;

import chapter2.test11.MyObject;

public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println(
                        "testMethod1 _____getLock time="
                                + System.currentTimeMillis()
                                + " run ThreadName="
                                + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(
                        "testMethod1 releaseLock time="
                                + System.currentTimeMillis()
                                + "run ThreadName="
                                + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
