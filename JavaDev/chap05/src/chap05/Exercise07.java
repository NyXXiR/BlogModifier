package chap05;

public class Exercise07 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int max = 0;

    int[] array = {1, 5, 3, 8, 2};


    max = array[0];
    for (int i = 0; i < array.length - 1; i++) {
      max = (array[i] > array[i + 1]) ? array[i] : array[i + 1];
    }

    System.out.println("max: " + max);
  }

}
