import java.util.Scanner;

public class StudentTest {

  String name;
  String number;
  String address;
  int kor;
  int math;
  int eng;


  public StudentTest(String name, String number, String address) {
    this.name = name;
    this.number = number;
    this.address = address;
  }

  public StudentTest(int kor, int math, int eng) {
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }



  public static void main(String[] args) {
    // TODO Auto-generated method stub
    StudentTest student1 = null;
    StudentTest student2 = null;
    StudentTest student3 = null;
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int selectNum = 0;

    StudentTest[] stu = {student1, student2, student3};


    while (run) {
      System.out.println("1)인적사항입력 2)점수입력 3)점수조회 4) 점수변경 5)종료");
      System.out.println("입력>>");
      // 여기에 메인 화면 글자 입력

      selectNum = sc.nextInt();

      if (selectNum == 1) {
        for (int i = 0; i < stu.length; i++) {

          System.out.println(i + "번 학생 이름 입력");
          String a = sc.next();

          System.out.println(i + "번 학생 번호 입력");
          String b = sc.next();

          System.out.println(i + "번 학생 주소 입력");
          String c = sc.next();

          stu[i] = new StudentTest(a, b, c);

        }
      }
      if (selectNum == 2) {
        for (int i = 0; i < stu.length; i++) {
          System.out.println(i + "번 학생 국어 점수 입력");
          stu[i].kor = sc.nextInt();
          System.out.println(i + "번 학생 수학 점수 입력");
          stu[i].math = sc.nextInt();
          System.out.println(i + "번 학생 영어 점수 입력");
          stu[i].eng = sc.nextInt();
        }
      }
      if (selectNum == 3) {
        System.out.println("국어 영어 수학");
        for (int i = 0; i < stu.length; i++) {

          System.out.print(stu[i].kor + " " + stu[i].math + " " + stu[i].eng);
          System.out.println("\n");

        }

      }
      if (selectNum == 4) {
        System.out.println("몇 번 학생의 정보를 변경하고 싶습니까?");
        System.out.println(stu[0].number);
        System.out.println(stu[1].number);
        System.out.println(stu[2].number);

        String answer = sc.next();
        for (int i = 0; i < stu.length; i++) {
          if (answer.equals(stu[i].number)) {
            System.out.println("바꾸고 싶은 과목을 입력하십시오");
            System.out.println("1) kor 2) math 3) eng");
            int subjectAnswer = sc.nextInt();
            System.out.println("바꾸고 싶은 과목의 점수를 입력하십시오");
            int modifiedScore = sc.nextInt();

            for (int j = 0; j < stu.length; j++) {
              if (subjectAnswer == 1) {
                stu[i].kor = modifiedScore;
              }
              if (subjectAnswer == 2) {
                stu[i].math = modifiedScore;
              }
              if (subjectAnswer == 3) {
                stu[i].eng = modifiedScore;
              }
            }

          }
        }
      }


      if (selectNum == 5) {
        System.out.println("program shutdown");
        break;
      }
    }
  }



}


