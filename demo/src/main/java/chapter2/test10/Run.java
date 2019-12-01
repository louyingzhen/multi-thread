package chapter2.test10;

public class Run {
    public static void main(String[] args) {
        PrintString printStringServic = new PrintString();
        new Thread(printStringServic).start();
        System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
        printStringServic.setContinuePrint(false);
    }
}
