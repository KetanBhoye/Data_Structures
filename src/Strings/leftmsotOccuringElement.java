package Strings;


public class leftmsotOccuringElement {
    public static void main(String[] args){
    System.out.println(    isOccuring("abcabc"));
    }

    final  static  int CHAR = 256;
    public static int  isOccuring(String str){
        int[] count = new int[CHAR];
         int res = -1;
        for(int i=0;i<str.length();i++){
           count[str.charAt(i)]++;
        }
        for(int i =0;i<str.length();i++){
            if(count[str.charAt(i)]>1){
                res = i;
                return res;
            }
        }
        return res;

    }
}
