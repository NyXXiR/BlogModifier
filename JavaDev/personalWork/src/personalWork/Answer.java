package personalWork;

import java.util.Scanner;

public class Answer {

  int brand;
  int star;
  int reason;


  public Answer(int brand, int star, int reason) {

    this.brand = brand;
    this.star = star;
    this.reason = reason;
  }

  public static void main(String[] args) {
    // 프로그램 형식은 chap01 > exercise09 참고

    Scanner sc = new Scanner(System.in);
    int customerNum = 0; // 초기화
    boolean run = true;
    // 선언한 Answer 수만큼 설문 인원을 설정할 수 있음
    Answer answer1 = null;
    Answer answer2 = null;
    Answer answer3 = null;
    Answer answer4 = null;
    Answer answer5 = null;
    Answer answer6 = null;
    Answer answer7 = null;
    Answer answer8 = null;
    Answer answer9 = null;
    Answer answer10 = null;
    Answer[] answers =
        {answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10};


    // 1. 답변입력 2. 선호브랜드 분석 3. 가장 많이/적게 간 브랜드 4. 브랜드별 후기 5.종료
    // 2-1. 브랜드별 별점 보기(별점갯수+평균별점), 2-2. 브랜드 결정 요인
    while (run) {

      System.out.println("------------------------------------------------------");
      System.out.println("1.응답인원수 2.답변입력 3.브랜드별 별점 4.브랜드 선호 이유 5. 가장 많이/적게 간 브랜드 6.종료");
      System.out.println("------------------------------------------------------");
      System.out.println("선택> ");

      int selectNum = sc.nextInt();

      // 1. 인원수

      if (selectNum == 1) {
        // customerNum = 3으로 고정.
        System.out.println("답변할 인원 수를 선택하세요(최대 10)");
        customerNum = sc.nextInt();

      }
      // 2. 답변입력
      if (selectNum == 2) {

        for (int i = 0; i < customerNum; i++) {
          System.out.println((i + 1) + "번 응답을 기록합니다.(모두 숫자로 입력)");

          System.out.println("어떤 브랜드 커피를 마셨습니까?");
          System.out.println("1) 메가커피 2) 커피그루나루 3) 커피베이 4) 배스킨라빈스");
          int brandAnswer = sc.nextInt();


          System.out.println("해당 브랜드의 별점을 매겨주세요.(1~10까지 입력)");
          int starAnswer = sc.nextInt();
          System.out.println("브랜드를 선택할 때 가장 중시하는 요소는?");
          System.out.println("1) 맛 2) 이동거리 3)친절함");
          int reasonAnswer = sc.nextInt();

          answers[i] = new Answer(brandAnswer, starAnswer, reasonAnswer);
        }
      }
      // 3. 선호브랜드 분석
      // answer1, answer2, answer3는 brand, star, reason을 보유하고 있음.
      // 브랜드별 별점 보기 / (선택한 총 인원수) 평균 별점 출력
      // 브랜드 결정 요인
      if (selectNum == 3) {
        // 별점 보기
        // 평균 별점(총 참여인원수)
        // 4줄이 나와야 함- 메가커피, 커피그루나루, 배스킨라빈스, 커피베이

        double megaStarSum = 0;
        double gruStarSum = 0;
        double brStarSum = 0;
        double bayStarSum = 0;
        int megaCnt = 0;
        int gruCnt = 0;
        int brCnt = 0;
        int bayCnt = 0;


        int[] arr = new int[customerNum];

        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].brand;
          if (arr[i] == 1) {
            megaStarSum += answers[i].star;
            megaCnt++;
          } else if (arr[i] == 2) {
            gruStarSum += answers[i].star;
            gruCnt++;
          } else if (arr[i] == 3) {
            brStarSum += answers[i].star;
            brCnt++;
          } else if (arr[i] == 4) {
            bayStarSum += answers[i].star;
            bayCnt++;
          }
        }
        double result1 = megaStarSum / megaCnt;
        double result2 = megaStarSum / megaCnt;
        double result3 = brStarSum / brCnt;
        double result4 = bayStarSum / bayCnt;

        String megaAvg = String.format("%.1f", result1);
        String gruAvg = String.format("%.1f", result2);
        String brAvg = String.format("%.1f", result3);
        String bayAvg = String.format("%.1f", result4);

        System.out.println("브랜드명 - 평균별점 - 총 참여인원 순");
        System.out.println("메가커피: " + megaAvg + "(" + megaCnt + ")");
        System.out.println("커피그루나루: " + gruAvg + "(" + gruCnt + ")");
        System.out.println("배스킨라빈스: " + brAvg + "(" + brCnt + ")");
        System.out.println("커피베이: " + bayAvg + "(" + bayCnt + ")");

        // String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);

      }

      if (selectNum == 4) {
        // 브랜드 선호 이유
        double tasteCnt = 0;
        double distanceCnt = 0;
        double kindCnt = 0;
        int[] arr = new int[customerNum];
        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].reason;
          if (arr[i] == 1) {
            tasteCnt++;
          } else if (arr[i] == 2) {
            distanceCnt++;
          } else if (arr[i] == 3) {
            kindCnt++;
          }

        }
        String resultTaste = String.format("%.2f", tasteCnt / customerNum * 100);
        String resultDistance = String.format("%.2f", distanceCnt / customerNum * 100);
        String resultKind = String.format("%.2f", kindCnt / customerNum * 100);

        System.out.println("맛: " + resultTaste + "%");
        System.out.println("이동거리: " + resultDistance + "%");
        System.out.println("친절함: " + resultKind + "%");
      }



      // 5. 가장 많이 간 브랜드?
      if (selectNum == 5) {
        int[] arr = new int[customerNum];
        for (int i = 0; i < customerNum; i++) {
          arr[i] = answers[i].brand;
        }
        int[] mode = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
          mode[arr[i]]++;
        }
        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수 출현횟수

        for (int i = 0; i < arr.length; i++) {
          if (modeCnt < mode[i]) {

            modeCnt = mode[i];
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

      // 5. 프로그램 종료
      if (selectNum == 6) {
        break;
      }

    }
    System.out.println("정말\t너무\t힘들\t어요");
  }
}


// 아쉬운 점
// 최빈값만 구현, 가장 적은 값 구현 X
// 겹치는 코드가
// 있어 리팩토링해보면
// 좋을 것
// 같다는 생각.
// 모아둔 객체
// 데이터에서 각
// 항목만 빼내는
// 부분이 반복되었음.
// 값을 벗어나는
// 답을 내도
// 객체에 그대로
// 입력됨.조건을 벗어나는
// 응답을 방지하고 싶었음


//



// 1.
//
// 몇 명인지
// 입력받음 ㄴ customerNum:2.
// 데이터 입력
// ㄴ 어떤
// 브랜드 커피를 마셨는가?(1~4)
// ㄴ브랜드에 별점
//
// 매겨달라(1~10) >starCount++, starRate.nextInt();
// ㄴ후기 작성할 생각 있냐?(Y/N)
// ㄴ(if Y)후기를 입력하세요 > 입력한 후기는 앞서 입력한 각 브랜드에 할당
// (if N)빈 배열 요소 생성 " "
//
// 3. 선호브랜드 분석
// 3-1. 브랜드별 별점 보기
// ㄴ각 브랜드 숫자 입력 >
//
// 평균 별점(별점 준 인원수)
// 3-2.
//
// 4. 가장 많이 간 / 적게 간 브랜드
// ㄴ입력받은 브랜드 커피 count++ 해서 최대값/최소값 출력
//
// 5. 브랜드별 후기 보기
// ㄴ 브랜드 입력 1~4 / 5. 전체보기
//
// 6. 종료


