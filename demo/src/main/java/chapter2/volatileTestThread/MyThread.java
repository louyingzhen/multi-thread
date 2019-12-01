package chapter2.volatileTestThread;

import lombok.Builder;

public class MyThread extends Thread {
    volatile public static int count;
    // 注意一定要添加static关键字
    // 这样synchronized与static锁的内容就是MyThread类了，也就达到同步效果了
    private static void addCount(){
        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }
    @Override
    public void run(){
        addCount();
    }
}
