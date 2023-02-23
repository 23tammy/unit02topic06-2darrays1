import java.util.Arrays;

public class Main {
  // good
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

  // good
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
      // FIXME: this doesn't actually create a copy. See my demo in main.
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
      System.out.println();
    }
    
  }

  public static double[][] withWeightedAverage(double[][] spread, double[] weights) {
    int rows = spread.length;
    int col = spread[0].length;
    double[][] newSpread = new double[rows + 1][col + 1];

    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < col; c++) {
            newSpread[r][c] = spread[r][c];
        }
    }

    //  row avg
    for (int r = 0; r < rows; r++) {
        double total = 0;
        for (int i = 0; i < col; i++) {
            double value = spread[r][i] * weights[i];
            total += value;
        }
       newSpread[r][col] = total;
    }

    //  column avg
    for (int c = 0; c < col+1; c++) {
        double total = 0;
        for (int r = 0; r <rows; r++) {
            total += newSpread[r][c];
        }
        newSpread[rows][c] = total / rows;
    }

    for (int i = 0; i < newSpread.length; i++){ //pretty rows
      System.out.println(Arrays.toString(newSpread[i]));
    }

    return newSpread;
  }
  public static void main(String[] args) {
    // int[][] arr1 = new int[][]{
    //   {1, 0, 8},
    //   {4, 5, 5},
    //   {10, 11, 12}};
    // int[][] arr2 = new int[][]{
    //   {1, 0, 6},
    //   {4, 5, 5},
    //   {7, 4, 5},
    //   {10, 11, 12}};
    int[][] arr3 = new int[][]{
      {1, 0},
      {4, 5, 5},
      {7,},
      {10, 11, 12}};

    int[][] copyOfarr3 = copyRagged(arr3);
    // changing values in the copy shouldn't affect the original array
    copyOfarr3[0][0] = 9999;
    // but it does. Because it's not technically a true copy
    System.out.println(Arrays.deepToString(arr3));

    // double[][] arr4 = new double[][] {
    //   {99, 85, 98},
    //   {98, 57, 79},
    //   {92, 77, 74},
    //   {94, 62, 81},
    //   {99, 94, 92},
    //   {80, 76.5, 67},
    //   {76, 58.5, 90.5},
    //   {92, 66, 91},
    //   {77, 70.5, 66.5},
    //   {89, 89.5, 81}};

    //   double[] weights = { 0.25, 0.25, 0.50 };

      //System.out.println(Arrays.deepToString(copySquare(arr1)));
      //System.out.println(Arrays.deepToString(copyRectangle(arr2)));
      //System.out.println(Arrays.deepToString(copyRagged(arr3)));
      //printTranspose(arr4);
      //withWeightedAverage(arr4, weights);
  }
}