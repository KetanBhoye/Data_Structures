package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");

    System.out.println(set);
    System.out.println(set.contains("1"));
        Iterator<String> i = set.iterator();
        while (i.hasNext()){
      System.out.println(i.next());
        }

  }
}
