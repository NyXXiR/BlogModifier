package chap06_2;

public class Car3 {
  // field
  int gas;

  // constructor

  // method
  void setGas(int gas) {
    this.gas = gas;
  }

  boolean isLeftGas() {
    if (gas == 0) {
      System.out.println("gas it out");
      return false;

    }
    System.out.println("gas ok");
    return true;
  }

  void run() {
    while (true) {
      if (gas > 0) {
        System.out.println("¥ﬁ∏≥¥œ¥Ÿ. (gas ¿‹∑Æ: " + gas + ")");
        gas -= 1;
      } else {
        System.out.println("∏ÿ√‰¥œ¥Ÿ.(gas ¿‹∑Æ: " + gas + ")");
        return;
      }
    }
  }

}

