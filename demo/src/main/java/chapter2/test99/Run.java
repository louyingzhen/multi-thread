package chapter2.test99;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
