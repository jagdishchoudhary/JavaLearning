package collection;

import java.util.HashSet;
import java.util.Set;


public class BasicSet {
    public static void main(String[] args) {
        //creating an empty set
        Set<Integer> set = new HashSet<>();
        //Adding elements in set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);

        //size of set
        System.out.println("Size of set is : " + set.size());

    }
}
