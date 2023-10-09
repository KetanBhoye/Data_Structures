package POTD;

public class surroundThe1s {
    public static void main(String[] args){
   int[][] matrix =
           {{ 1, 0, 0},
           {  1, 1, 0},
           {  0, 1, 0}};
    }

  public int Count(int[][] matrix) {
    // code here
    int r[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    int c[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    int nr = matrix.length;
    int nc = matrix[0].length;

    int res = 0;

    for (int i = 0; i < nr; i++) {
      for (int j = 0; j < nc; j++) {
        if (matrix[i][j] == 0) continue;
        int count = 0;
        for (int k = 0; k < 8; k++) {
          int newr = i + r[k];
          int newc = j + c[k];
          if (newr >= 0 && newr < nr && newc >= 0 && newc < nc && matrix[newr][newc] == 0) count++;
        }
        if (count != 0 && count % 2 == 0) res++;
      }
    }
    return res;
}
}
