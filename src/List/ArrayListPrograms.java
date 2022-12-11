package List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPrograms {
    public static void main(String[] args) {
        // Integer array
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        //For adding an element we use add(e) method
        intArr.add(10);
        intArr.add(7);
        intArr.add(16);
        intArr.add(13);

        for(int i = 0; i < intArr.size(); i++)
        System.out.println(intArr.get(i));

        //elements of array
        System.out.println(intArr);
        //For finding size of array we use size() method
        System.out.println("Size of Array is :" + intArr.size());
        //Sorting array in ascending order
        Collections.sort(intArr);

        //size of array
        System.out.println("After sorting array is :" + intArr);

        //Searching in ArrayList
        if(intArr.contains(7))
            System.out.println("7 is present in array");
        else
            System.out.println("7 is not present in array");

        //for removing elements we use remove(index) method
        intArr.remove(1);
        intArr.remove(2);

        System.out.println("Size of Array after removing some elements :" + intArr.size());


    }

}
