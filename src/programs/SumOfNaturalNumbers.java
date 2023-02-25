package programs;
import java.util.Scanner;

//In this program we understand sum of n natural numbers
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumMethod1(num);
        sumMethod2(num);
    }


    //Time complexity: O(n)
    //Space complexity: O(1)
    private static void sumMethod1(int num) {
        long start = System.nanoTime();

        int sum=0;
        for(int i = 1;i <= num ;i++){
            sum += i;
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time taken to calculate sum in sumMethod1 is: " + timeElapsed + " and sum is: " + sum );

    }



    //Time complexity: O(1)
    //Space complexity: O(1)
    private static void sumMethod2(int num) {
        long start = System.nanoTime();

        int sum = (num * (num + 1))/2;
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time taken to calculate sum in sumMethod2 is: " + timeElapsed + " and sum is: " + sum );
    }
}

//Result: to calculate first 100000 natural number sumMethod1 takes 1183500 nanoseconds
//                                                 sumMethod2 takes 300 nanoseconds
