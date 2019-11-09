package chapter2.deadLockTest;

import chapter2.doubleSynBlockOneTwo.ObjectService;
import chapter2.doubleSynBlockOneTwo.ThreadB;

public class DealThread implements Runnable {

    private String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if ("a".equals(username)) {
            synchronized (lock1) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按lock1-lock2代码顺序执行了");
                }
            }
        }
        if ("b".equals(username)) {
            synchronized (lock2) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按lock2-lock1代码顺序执行了");
                }
            }
        }
    }
}
