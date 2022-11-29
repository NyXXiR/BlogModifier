package chap06_2;

public class Car3Ex {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car3 myCar = new Car3();

    myCar.setGas(5); // myCar의 setGas()메소드를 호출하였음

    boolean gasState = myCar.isLeftGas();
    if (gasState) {
      System.out.println("출발~");
      myCar.run();
    }
    if (myCar.isLeftGas()) {
      System.out.println("가스를 주입할 필요 없음");

    } else {
      System.out.println("가스 주입 필요");
    }

  }

}
