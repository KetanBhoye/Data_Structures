package Strings;

public class checkSubsequence {
    public static void main(String[] args){
    System.out.println(lcs(6,6,"ABCDGH","AEDFHR"));

    }
//    public static  boolean isSubsequence(String s,String k){
//        int i =0;
//        int j =0;
//        while (i<s.length()&&j<k.length()){
//            if(s.charAt(i)==k.charAt(j)){
//                i++;
//                j++;
//            }
//            else {
//                i++;
//            }
//        }
//        if(j==k.length()){
//            return  true;
//        }
//        return false;
//    }

    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int count =0;
        int temp = 0;

        for(int i=0;i<x;){

            for(int j=temp;j<y;){
                if(s1.charAt(i)==s2.charAt(j)){
                    temp = j+1;
                    count++;
                    i++;
                    j++;
                    break;
                }
                else if(s1.charAt(i)!=s2.charAt(j)){
                    j++;
                }



            }
            i++;


        }
        return count;

    }
}
