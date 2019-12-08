package chapter3.TwoThreadTransData;

public class Test {

    public static void main(String[] args) {
        MyList sevice = new MyList();
        ThreadA a = new ThreadA(sevice);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(sevice);
        b.setName("B");
        b.start();
    }
}
