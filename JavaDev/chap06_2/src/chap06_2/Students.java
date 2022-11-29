package chap06_2;

public class Students {
  Student[] stuArr;

  void init() {
    for (int i = 0; i < stuArr.length; i++) {
      insertStudent(i, "hong" + i, "01" + (i + 1), "seoul", 80 + i, 10 + i, 1 + i);
    }
  }

  void insertStudent(int i, String name, String number, String address, int kor, int math,
      int eng) {
    stuArr[i] = new Student(name, number, address, kor, math, eng);
  }

  Student searchStudentbyNum(String number) {
    for (int i = 0; i < stuArr.length; i++) {
      if (stuArr[i].number.equals(number)) {
        System.out.println(stuArr[i]);

      }
    }
    return null;

  }

  void updateScore(String number, int kor, int math, int eng) {
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
  }
}
