package Strings;

public class strstr {
    public static void main(String[] args){
        String s ="ababaaaaaa";
        String x = "abaa";

    System.out.println(strstr(s,x));
    }
    static int strstr(String s, String x)
    {
        // Your code here
        int i =0;
        int j =0;


        while(i<s.length()){

            if(s.charAt(i)==x.charAt(j)){
                i++;
                j++;

                if(j==x.length()){

                    return  i-x.length();
                }
            }


            else{
                i = i - j + 1;
                j=0;
            }
        }
        return -1;
    }
}
