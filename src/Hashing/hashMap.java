package Hashing;
 import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public  static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);

        if(map.containsKey("zero")){
      System.out.println("Starting point found !");
        }
        else{
      System.out.println("Could not find Start point !");
        }
        for(Map.Entry<String,Integer>e: map.entrySet()){
      System.out.println(e.getKey()+" "+e.getValue());
        }


    }
}
