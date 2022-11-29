import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double paidDollar;
    double paidPound;
    int paidDate;
    double sum = 0;
    double exchangeRate;
    boolean run = true;

    while (run) {
      System.out.println("---------해외결제계산기----------");
      System.out.println("1.달러결제추가 | 2.파운드결제추가 | 3.흑우력측정 | 4.종료");
      System.out.println("------------------------------");
      System.out.println("선택 >");
      int input = sc.nextInt();
      if (input == 1) {
        System.out.println("결제한 달러 금액은?");
        paidDollar = sc.nextDouble();
        System.out.println("결제한 날짜는?");
        paidDate = sc.nextInt();
        // 날짜반영 구현안됨
        double dollarRateCal = 1400;
        sum += paidDollar * dollarRateCal;
        System.out.println("환산 결제 금액: " + sum);
      }
      if (input == 2) {
        System.out.println("결제한 파운드 금액은?");
        paidPound = sc.nextDouble();
        System.out.println("결제한 날짜는?");
        paidDate = sc.nextInt();
        double poundRateCal = 1600;
        sum += paidPound * poundRateCal;
        System.out.println("환산 결제 금액: " + sum);
      }
      if (input == 3) {
        if (sum < 30000) {
          System.out.println("돈을 잘 아끼는 편");
        } else if (sum < 100000) {
          System.out.println("흑우 입문");
        } else if (sum < 300000) {
          System.out.println("훌륭한 흑우");
        } else {
          System.out.println("지갑이 위험함;;");
        }
      }
      if (input == 4) {
        run = false;
      }

    }
    System.out.println("프로그램 종료");
  }
}

// 프로그램이 계산
// 기능을 대신해
// 준다
//
// 만들
// 것
//
// 계산기
//
// 결제 날짜, 해당
//
// 날짜 결제금액(외환) 입력받으면
// 총 얼마 결제했는지 보여주는 프로그램 작성
//
//
// 원화로 환산한 결제액 x = 해당 날짜의 환율 *결제금액
//
// 총합= sum of x
//
