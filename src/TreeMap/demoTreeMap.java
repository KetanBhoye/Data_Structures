package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class demoTreeMap {
    public static void main(String[] args){
        TreeMap<Integer,String>Tm = new TreeMap<>();
        Tm.put(1,"one");
        Tm.put(2,"two");
        Tm.put(3,"three");
        Tm.put(4,"four");
        Tm.put(5,"five");
    System.out.println(Tm.containsKey(1));
    System.out.println(Tm.containsValue("five"));
    System.out.println(Tm.higherKey(4));
    System.out.println(Tm.lowerKey(4));
    System.out.println(Tm.floorKey(5));

//    for(Map.Entry<Integer,String>e:Tm.entrySet()){
//      System.out.println(e.getKey()+" "+e.getValue());
//    }
    }
}
