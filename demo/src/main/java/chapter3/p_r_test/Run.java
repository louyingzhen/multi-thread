package chapter3.p_r_test;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(r);
        pThread.start();
        cThread.start();
    }
}
