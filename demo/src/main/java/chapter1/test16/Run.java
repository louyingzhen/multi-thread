package chapter1.test16;

public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();
            MyThread2 mythread2 = new MyThread2();
            mythread2.setPriority(10);
            mythread2.start();
        }
    }
}
