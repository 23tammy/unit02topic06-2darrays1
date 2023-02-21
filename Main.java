import java.util.Arrays;

public class Main {
  public static int[][] copySquare(int[][] arr) {
    int side = arr.length;
    int[][] copyOfSqr = new int[side][side];
    for(int r = 0; r < side; r++){
      for(int c = 0; c < side; c++){
        copyOfSqr[r][c] = arr[r][c];
      }
    }
    return copyOfSqr;
  }

  public static int[][] copyRectangle(int[][] arr) {
    int[][] copyOfRec = new int[arr.length][arr[0].length];
    for(int r = 0; r < arr.length; r++){
      for(int c = 0; c < arr[0].length; c++){
        copyOfRec[r][c] = arr[r][c];
      }
    }
    return copyOfRec;
  }

  public static void copyRagged(int[][] arr) {
    for(int r = 0; r < arr.length; r++){
      System.out.println(Arrays.toString(arr[r]));
      for(int c = 0; c < arr[r].length; c++){ //notice r :copy individual rows, add to 2d array?
        
        
      System.out.println((arr[r][c]));
      }
    }
    //return copyOfRag;
  }
  public static void main(String[] args) {
    int[][] arr = new int[][]{
      {1, 0},
      {4, 5, 5},
      {7, 8, 9},
      {10, 11, 12}};

      copyRagged(arr);

      //System.out.println(Arrays.deepToString(copySquare(arr)));
      //System.out.println(Arrays.deepToString(copyRectangle(arr)));
      //System.out.println(Arrays.deepToString(copyRagged(arr)));
  }
}