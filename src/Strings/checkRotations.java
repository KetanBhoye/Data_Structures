package Strings;

public class checkRotations {
    public static void main(String[] args){
 String S ="ABC";
 String roatated ="CAB";
    System.out.println(isRotated(S,roatated));
    }
    public static boolean isRotated(String S, String rotated){
        if(S.length()!=rotated.length()){
            return false;
        }
        return ((S+S).indexOf(rotated)>=0);
    }
}
