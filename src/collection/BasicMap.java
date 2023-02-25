package collection;

import java.util.*;

public class BasicMap {
    public static void main(String[] args) {
      //Create a hashMap
        Map<Integer,Integer> map = new HashMap<>();

        //Adding pairs in map(key, value)
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);

        //Getting elements from map

        System.out.println("Value corresponding to 1 is : " + map.get(1));
        System.out.println("Value corresponding to 2 is : " + map.get(2));
        System.out.println("Value corresponding to 3 is : " + map.get(3));

        //Getting all keys of map in one set
        Set<Integer> keys = map.keySet();
        System.out.println("Keys of map are : " + keys);

        //delete a key from map
        map.remove(1);
        System.out.println("Keys after removing key 1 : " + map.keySet());

    }
}
