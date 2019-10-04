package chapter2.synLockIn_1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
