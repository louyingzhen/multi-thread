package chapter2.test11;

public class MyObject {
    public synchronized void speedPrintString() {
        System.out.println(
                "speedPrintString ____getLock time="
                        + System.currentTimeMillis()
                        + "run ThreadName="
                        + Thread.currentThread().getName());
        System.out.println("--------------------");
        System.out.println(
                "speedPrintString releaseLock time="
                        + System.currentTimeMillis()
                        + " run ThreadName="
                        + Thread.currentThread().getName());
    }
}
