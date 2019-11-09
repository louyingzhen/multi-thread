package chapter2.test12;

import chapter2.test11.MyObject;

public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        super();
        this.service = service;
        this.object = object;
    }
    @Override
    public void run(){
        super.run();
        service.testMethod1(object);
    }
}
