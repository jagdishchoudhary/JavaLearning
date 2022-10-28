package Arrays;

import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,4,8,11,3,45,12,22};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search key");
        int num = sc.nextInt();

        int index = linear_Search(arr, num);

        if(index != -1){
            System.out.println("Key found at index : " + index);
        }else{
            System.out.println("Key not found in list");
        }
    }

    private static int linear_Search(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
