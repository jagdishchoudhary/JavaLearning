package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int N = sc.nextInt();
        System.out.println("Enter Array elements");
        for(int i = 0; i < N; i++)
            array.add(sc.nextInt());

        printArray(array);
        array = sortArray(array);
        printArray(array);
    }

    private static ArrayList<Integer> sortArray(ArrayList<Integer> array) {
        Collections.sort(array);
        return array;
    }


    private static void printArray(ArrayList<Integer> array) {
        for(int i = 0; i < array.size(); i++)
            System.out.print(array.get(i));
        System.out.println();
    }
}
