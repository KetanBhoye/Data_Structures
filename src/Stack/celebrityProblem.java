package Stack;

import java.util.Stack;

public class celebrityProblem {
    public static void main(String[] args){
    int[][] mat = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0},
            {1, 1, 1, 0}
    };
    System.out.println(isCelebrity(mat));
    }
    public static int isCelebrity(int[][] mat){
        Stack<Integer>S = new Stack<>();
        for(int i=0;i<mat.length;i++){
            S.push(i);
        }
        while(S.size()>=2){
            int i = S.pop();
            int j = S.pop();
            if(mat[i][j]==1){
                S.push(j);
            }
            else{
                S.push(i);
            }
        }
        int pot = S.pop();
        for(int i=0;i<mat.length;i++){
            if(i!=pot){
                if(mat[i][pot]==0||mat[pot][i]==1){
          System.out.println("Celebrity is not present");
                    return -1;

                }
            }
        }
        return pot;
    }
}
