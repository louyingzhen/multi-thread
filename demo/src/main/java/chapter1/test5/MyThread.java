package chapter1.test5;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("run 方法的打印：" + Thread.currentThread().getName());
    }
}
