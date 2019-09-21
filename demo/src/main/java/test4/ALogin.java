package test4;

public class ALogin extends Thread {
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
