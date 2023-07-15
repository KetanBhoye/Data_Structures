package Matrix;

public class spiralTraversal {
    public static void main(String[] args){
        
    }

    int findK(int A[][], int n, int m, int k)
    {
// Your code here
        int tr = 0;
        int br = n-1;
        int lc =0;
        int rc = m-1;
        int count =0;
        while(n*m > count){
            for(int i = lc ; i <= rc ; i++){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[tr][i];
                }
            }
            tr++;
            for(int i = tr ; i <= br ; i++){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][rc];
                }
            }
            rc--;
            for(int i = rc ; i >= lc ; i--){
                if(tr > br){
                    break;
                }
                count++;
                if(count == k){
                    return A[br][i];
                }
            }
            br--;
            for(int i = br ; i >= tr ; i--){
                if(lc > rc){
                    break;
                }
                count++;
                if(count == k){
                    return A[i][lc];
                }
            }
            lc++;
        }
        return -1;
    }

}
