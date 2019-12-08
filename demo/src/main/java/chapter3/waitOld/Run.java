package chapter3.waitOld;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadsSubtract subtarct1Thread = new ThreadsSubtract(subtract);
        subtarct1Thread.setName("subtarct1Thread");
        subtarct1Thread.start();
        ThreadsSubtract subtract2Thread = new ThreadsSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
