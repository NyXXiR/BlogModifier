import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int balance = 0;

    for (;;) {
      System.out.println(">>");
      int ss = sc.nextInt();
      if (ss == 1) {
        System.out.println("예금액>");
        int sss = sc.nextInt();
        balance += sss;
        System.out.println("잔액>" + balance);
      }
      if (ss == 4) {
        break;
      }
    }



    while (run) {
      System.out.println("----------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("----------------------------------");
      System.out.println("선택 >");

      int input = sc.nextInt();
      if (input == 1) {
        int add = sc.nextInt();
        balance += add;
        System.out.println("선택 >" + input);
        System.out.println("예금액>" + balance);
      } else if (input == 2) {
        int subtract = sc.nextInt();
        balance -= subtract;
        System.out.println("선택 >" + input);
        System.out.println("출금액>" + subtract);
      } else if (input == 3) {
        System.out.println("선택 >" + input);
        System.out.println("잔고>" + balance);

      } else if (input == 4) {
        run = false;

      }

    }
    System.out.println("프로그램 종료");
  }
}
