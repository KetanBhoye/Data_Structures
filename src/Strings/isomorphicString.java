package Strings;

import java.util.HashMap;
import java.util.Map;

public class isomorphicString {
    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer>map = new HashMap<>();

        for(int i=0;i<line.length();i++){
        char a = line.charAt(i);
        map.put(a,map.getOrDefault(a,0)+1);

    }
        int max = 0;
        char res = ' ';
        for(Map.Entry<Character,Integer>e: map.entrySet()){

            if(e.getValue()>max){
                res = e.getKey();
                max = e.getValue();
            }
            else if(e.getValue()==max){


                if(e.getKey()>res){
          res = e.getKey();
        }

                max = e.getValue();
            }

        }
        return  res;
    }
    public static void main(String[] args){

    }
    static boolean isIsomorphic(String s,String x){
        if(s.length()!=x.length()){
            return  false;
        }
        HashMap<Character,Character>map = new HashMap<>();
        HashMap<Character,Boolean>map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = x.charAt(i);
            if(map.containsKey(a)){
                if (map.get(a)!=b){
                    return  false;
                }
            }
            else {
                if(map2.containsKey(b)){
                    return false;
                }
                else {
                    map.put(a,b);
                    map2.put(b,true);
                }
            }
        }
        return true;
    }

}
