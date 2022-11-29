package chap06_2;

public class Student {
  String name;
  String number;
  String address;
  int kor;
  int math;
  int eng;

  public Student(String name, String number, String address) {
    this.name = name;
    this.number = number;
    this.address = address;
  }

  public Student(String name, String number, String address, int kor, int math, int eng) {
    this.name = name;
    this.number = number;
    this.address = address;
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }

  int sum() {
    return this.kor + this.math + this.eng;

  }

  double avg() {
    return sum() / 3.0;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", number=" + number + ", address=" + address + ", kor=" + kor
        + ", math=" + math + ", eng=" + eng + "]";
  }


}
