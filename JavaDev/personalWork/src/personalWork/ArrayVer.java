package personalWork;

import java.util.Scanner;

public class ArrayVer {

  public static void main(String[] args) {
    boolean run = true;

    int scores[];
    int pick;

    Scanner scan = new Scanner(System.in);

    int[][] answers = new int[3][];

    while (run) {
      System.out.println("----------------------------");
      System.out.println("1.조사인원수 - 2.답변입력 - 3.브랜드별 별점 - 4.가장 많이/적게 간 브랜드 - 5.브랜드별 후기 - 6.종료");
      System.out.println("----------------------------");
      System.out.println(">>원하는 행동을 고르세요<<");
      pick = scan.nextInt();

      if (pick == 1) {
        System.out.println("조사 인원수는 몇명인가요?");
        System.out.println(answers.length + "명");
      }

      if (pick == 2) {
        for (int i = 0; i < answers.length; i++) {
          System.out.println(i + 1 + "번 응답을 기록합니다.(모두 숫자로 입력)");
          System.out.println(">>2-1 어떤 브랜드 커피를 마셨습니까?<<");
          System.out.println("1)메가커피 - 2)커피그루나루 - 3)커피베이 - 4)베라");
          System.out.print("나의 대답> ");
          int brandAnswer = scan.nextInt();
          System.out.println("");

          System.out.println(">>2-2 어떤 브랜드 커피를 마셨습니까?<<");
          System.out.println("선택한 브랜드 커피에 별점을 매겨주세요.");
          System.out.print("나의 대답> ");
          int starAnswer = scan.nextInt();
          System.out.println("");

          System.out.println(">>2-3 후기를 작성하시겠습니까? 참여:1 / 거절:0 <<");
          System.out.print("나의 대답> ");
          int reviewAnswer = scan.nextInt();
          System.out.println("");

          answers[i] = new int[] {brandAnswer, starAnswer, reviewAnswer};
        }
      }
      if (pick == 3) {
        double megaStarSum = 0;
        double gruStarSum = 0;
        double brStarSum = 0;
        double bayStarSum = 0;
        int megaCnt = 0;
        int gruCnt = 0;
        int brCnt = 0;
        int bayCnt = 0;
        int[] arr = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {
          arr[i] = answers[i][0];
          if (arr[i] == 1) {
            megaStarSum += answers[i][1];
            megaCnt++;
          } else if (arr[i] == 2) {
            gruStarSum += answers[i][1];
            gruCnt++;
          } else if (arr[i] == 3) {
            brStarSum += answers[i][1];
            brCnt++;
          } else if (arr[i] == 4) {
            bayStarSum += answers[i][1];
            bayCnt++;
          }
        }
        double result1 = megaStarSum / megaCnt;
        double result2 = gruStarSum / gruCnt;
        double result3 = brStarSum / brCnt;
        double result4 = bayStarSum / bayCnt;

        String megaAvg = String.format("%.1f", result1);
        String gruAvg = String.format("%.1f", result2);
        String brAvg = String.format("%.1f", result3);
        String bayAvg = String.format("%.1f", result4);

        System.out.println("브랜드명 - 평균별점 - 총 참여인원 순");
        System.out.println("메가커피: " + result1 + "(" + megaCnt + ")");
        System.out.println("커피그루나루: " + gruAvg + "(" + gruCnt + ")");
        System.out.println("배스킨라빈스: " + brAvg + "(" + brCnt + ")");
        System.out.println("커피베이: " + bayAvg + "(" + bayCnt + ")");

        // String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);

      }



      // answers[0][0] ~ answers[i][0] => 어떤 브랜드 골랐는지
      // answers[0][0] ~ answers[0][j] => 별점을 몇 점을 줬는지
      // answers[i][0] ~[i][1] = 어떤 브랜드를 골랐고 몇 점을 줬는지


      // arr[] = {1,2,3,1}


      if (pick == 4) {
        int arr[] = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
          arr[i] = answers[i][0];
        }

        int modeNum = 0; // 최빈값
        int[] index = new int[arr.length + 1]; // 값별 갯수(count)저장
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
          index[arr[i]]++; // count
        }
        for (int i = 0; i < arr.length; i++) {
          if (max < index[i]) {
            max = index[i];
            modeNum = i;
          }
        }
        if (modeNum == 1) {
          System.out.println("가장 많이 간 브랜드는 메가커피입니다.");
        } else if (modeNum == 2) {
          System.out.println("가장 많이 간 브랜드는 커피그루나루입니다.");
        } else if (modeNum == 3) {
          System.out.println("가장 많이 간 브랜드는 배스킨라빈스입니다.");
        } else if (modeNum == 4) {
          System.out.println("가장 많이 간 브랜드는 커피베이입니다.");
        }
      }

    }


  }
}

