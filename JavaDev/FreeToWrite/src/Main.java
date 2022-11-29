import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    Boolean run = true;
    int X = sc.nextInt();
    int cnt = 0;
    while (run) {
      if (X == 1) {

        break;
      }
      if (X % 3 == 0) {
        X = X / 3;
        cnt++;

      }
      if (X % 2 == 0) {
        X = X / 2;
        cnt++;
      } else {
        X = X - 1;
        cnt++;
      }

    }

    System.out.println(cnt);


  }


}


