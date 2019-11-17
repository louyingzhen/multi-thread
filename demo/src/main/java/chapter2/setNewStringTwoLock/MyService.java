package chapter2.setNewStringTwoLock;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyService {
    private String lock = "123";

    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(
                        Thread.currentThread().getName() + "begin" + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(
                        Thread.currentThread().getName() + "end" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
