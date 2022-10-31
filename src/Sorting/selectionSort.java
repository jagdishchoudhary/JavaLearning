package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        System.out.println("Before Sorting");
        printArray(arr);

        arr = selectionSortAlgo(arr);

        System.out.println("After Sorting");
        printArray(arr);
    }

    private static int[] selectionSortAlgo(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            int smallest = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[smallest])
                    smallest = j;
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
}
