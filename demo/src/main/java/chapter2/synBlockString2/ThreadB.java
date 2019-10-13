package chapter2.synBlockString2;


import java.security.Security;

public class ThreadB extends Thread {
    private chapter2.synBlockString2.Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.b();
    }
}
