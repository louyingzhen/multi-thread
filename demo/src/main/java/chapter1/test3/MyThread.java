package chapter1.test3;

public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        //线程共享数据的示例不要使用for语句，因为使用同步后其他线程就得不到运行机会了
        //一直由一个线程进行减法运算
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }
}
