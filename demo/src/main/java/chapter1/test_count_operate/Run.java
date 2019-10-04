package chapter1.test_count_operate;

import chapter1.test6.CountOperate;

public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive= " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive= " + t1.isAlive());
    }
}
