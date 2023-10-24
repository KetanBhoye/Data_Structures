package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class demoTreeSet {
    public static void main(String args[]){
        TreeSet<Integer>Ts = new TreeSet<>();

        Ts.add(1);
        Ts.add(2);
        Ts.add(3);
        Ts.add(0);
        Ts.add(5);

    System.out.println(Ts.lower(2));
    System.out.println(Ts.higher(2));
    System.out.println(Ts.floor(2));
    System.out.println(Ts.ceiling(2));

    Ts.headSet(2).size();

//    Iterator<Integer> it = Ts.iterator();
//    while(it.hasNext()){
//      System.out.println(it.next());
//
//    }

    }


}
