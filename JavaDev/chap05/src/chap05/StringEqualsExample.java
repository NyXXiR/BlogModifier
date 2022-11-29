package chap05;

public class StringEqualsExample {

  public static void main(String[] args) {

    // 148p
    String strVar1 = "신민철";
    String strVar2 = "신민철";


    int[] x = {};
    int y[] = null;
    int[] z = new int[] {};



    if (strVar1 == strVar2) {
      System.out.println("strVar1과 strVar2는 같은 것을 참조함");


    } else {
      System.out.println("strVar1과 strVar2는 참조가 다르다");

    }

    if (strVar1.equals(strVar2)) {

    }


  }

}

// 4 3 2 2 3
