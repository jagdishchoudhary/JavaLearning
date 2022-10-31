package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {7, 3, 8, 1, 2};
        System.out.println("Before Sorting");
        printList(arr);
        arr = bubbleSortalgo(arr);
        System.out.println("After Sorting");
        printList(arr);
    }

    private static int[] bubbleSortalgo(int[] arr) {

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
