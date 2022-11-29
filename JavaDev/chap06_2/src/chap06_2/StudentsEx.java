package chap06_2;

public class StudentsEx {


  public static void main(String[] args) {
    Students st = new Students();
    st.stuArr = new Student[10];
    st.init();
    System.out.println(st.searchStudentbyNum("011"));
    st.updateScore("011", 100, 100, 100);
    System.out.println(st.searchStudentbyNum("011"));



  }
}
