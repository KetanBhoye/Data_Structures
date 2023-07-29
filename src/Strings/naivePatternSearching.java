package Strings;

public class naivePatternSearching {
    public static void main(String[] args){

        PatternSearch("ABCABCABAABCD","ABA");
    }

    public static void PatternSearch(String S1,String S2){
        int n = S1.length();
        int m = S2.length();

        for(int i=0;i<n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(S2.charAt(j)!=S1.charAt(i+j))
                    break;


            }
            if(j==m){
                System.out.println(i);
            }
        }
    }
}
