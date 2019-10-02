package chapter1.test2;

public class MyThread extends Thread {
  int count = 5;

  public MyThread(String name) {
    super();
    this.setName(name);
  }

  public void run() {
    super.run();
    while (count > 0) {
      count--;
      System.out.println("由" + this.currentThread().getName() + "计算，count" + count);
    }
  }
}
