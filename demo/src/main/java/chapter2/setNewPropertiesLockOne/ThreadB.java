package chapter2.setNewPropertiesLockOne;

public class ThreadB extends Thread {

    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
