package chap06;

public class Korean {
  // 필드
  String nation = "대한민국";
  String name;
  String ssn;

  // 생성자
  public Korean(String name, String ssn, String nation) {

    // 알아보기 힘든 n,s 등을 사용하는 대신 참조변수 this를 사용하였음.
    // name=n;
    // ssn=s;
    this.name = name;
    this.ssn = ssn;
    this.nation = nation;
  }

  public Korean(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
  }
}

