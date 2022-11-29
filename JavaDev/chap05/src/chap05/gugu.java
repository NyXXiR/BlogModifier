package chap05;

public class gugu {

  public static void main(String[] args) {
    // TODO Auto-generated method stub



    int[][] gugu = new int[9][9];
    System.out.println(gugu.length);


    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 9; j++) {
        gugu[i][j] = (i + 2) * (j + 1);
        System.out.println((i + 2) + "*" + (j + 1) + "=" + gugu[i][j]);
      }
    }

  }


}

