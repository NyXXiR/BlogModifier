package chap06_2;

public class StuArrEx {
  static Student[] stuArr;

  public static void main(String[] args) {
    stuArr = new Student[15];


    for (int i = 0; i < stuArr.length; i++) {
      insertStudent(i, "hong" + i, "01" + (i + 1), "seoul", 80 + i, 10 + i, 1 + i);
    }

    for (Student stu : stuArr) {
      System.out.println(stu);
    }

    searchStudentbyNum("011");
    updateScore("011", -1, 9, 13);
  }

  static void updateScore(String number, int kor, int math, int eng) {
    Student student = searchStudentbyNum(number);
    if (kor >= 0) {
      student.kor = kor;
    }
    if (math >= 0) {
      student.math = math;
    }
    if (eng >= 0) {
      student.eng = eng;
    }
    // for (int i = 0; i < stuArr.length; i++) {
    // if (stuArr[i].number.equals(number)) {
    // stuArr[i].kor = (kor > 0) ? kor : stuArr[i].kor;
    // stuArr[i].math = (math > 0) ? math : stuArr[i].math;
    // if (eng > 0) {
    // stuArr[i].eng = eng;
    // }
    // System.out.println(stuArr[i]);
    // }
    // }
  }

  static void insertStudent(int i, String name, String number, String address, int kor, int math,
      int eng) {


    stuArr[i] = new Student(name, number, address, kor, math, eng);
  }



  static Student searchStudentbyNum(String number) {
    for (int i = 0; i < stuArr.length; i++) {
      if (stuArr[i].number.equals(number)) {
        System.out.println(stuArr[i]);

      }
    }
    return null;
  }
}
