package Strings;


public class checkAnagram {
    static final int CHAR=256;

    public static void main(String[] args){
        String str1 = "abaac";
        String str2 = "aacba";
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }
    static boolean areAnagram(String s1, String s2)
    {

        if (s1.length() != s2.length())
            return false;

        int[] count=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }


        for(int i=0;i<CHAR;i++){
            if(count[i]!=0)return false;
        }
        return true;
    }
}
