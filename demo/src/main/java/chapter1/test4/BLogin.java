package chapter1.test4;

public class BLogin extends Thread {

  public void run() {
    LoginServlet.doPost("b", "bb");
  }
}
