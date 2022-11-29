package chap06_2;

public class StuEx {

  public static void main(String[] args) {
    Student stu;
    stu = new Student("임규훈", "20151094", "서울 영등포구", 91, 80, 70);
    double avg1 = stu.avg();
    System.out.println(avg1);
  }

}
