package chap06;

public class KoreanEx {

  public static void main(String[] args) {

    Korean k1 = new Korean("박자바", "011225-1234567", "영국");

    System.out.println(k1.name);
    System.out.println(k1.ssn);
    System.out.println(k1.nation);

    Korean k2 = new Korean("임규훈", "000000-0000000");
    System.out.println(k2.name);
    System.out.println(k2.ssn);
    System.out.println(k2.nation);
  }

}
