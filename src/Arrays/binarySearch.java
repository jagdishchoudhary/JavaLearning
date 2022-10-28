package Arrays;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {51,32,7,13,9,10,11,16,23};
        Arrays.sort(arr);
        System.out.println("Enter search key");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int index = binary_search(arr, num);
        if(index != -1){
            System.out.println("Key found at index : " + index);
        }else {
            System.out.println("Key not found in list");
        }
    }

    private static int binary_search(int[] arr, int num) {

        int low = 0;
        int high = arr.length;

        while(low <= high){
            int mid = (low + high) / 2;
            if(num == arr[mid])
                return mid;
            else if (num > arr[mid]) {
                low = mid +1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }
}
