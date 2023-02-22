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

  public static int[][] copyRagged(int[][] arr) {
    int[][] copyOfRag = new int [arr.length][];
    for(int r = 0; r < arr.length; r++){{ // copy row; add to array
      copyOfRag[r] = arr[r];
        }
      }
    return copyOfRag;
  }

  public static void printTranspose(double[][] arr) {   //column = rows; rows = columns
    for (int c = 0; c < arr[0].length; c++){
      for (int x = 0; x < arr.length; x++){
        System.out.print(arr[x][c] + " ");
      }
    }
    
  }
  public static void main(String[] args) {
    int[][] arr1 = new int[][]{
      {1, 0, 8},
      {4, 5, 5},
      {10, 11, 12}};
    int[][] arr2 = new int[][]{
      {1, 0, 6},
      {4, 5, 5},
      {7, 4, 5},
      {10, 11, 12}};
    int[][] arr3 = new int[][]{
      {1, 0},
      {4, 5, 5},
      {7,},
      {10, 11, 12}};
    double[][] arr4 = new double[][] {
      {99, 85, 98},
      {98, 57, 79},
      {92, 77, 74},
      {94, 62, 81},
      {99, 94, 92},
      {80, 76.5, 67},
      {76, 58.5, 90.5},
      {92, 66, 91},
      {77, 70.5, 66.5},
      {89, 89.5, 81}};

      //System.out.println(Arrays.deepToString(copySquare(arr1)));
      //System.out.println(Arrays.deepToString(copyRectangle(arr2)));
      //System.out.println(Arrays.deepToString(copyRagged(arr3)));
      printTranspose(arr4);
  }
}