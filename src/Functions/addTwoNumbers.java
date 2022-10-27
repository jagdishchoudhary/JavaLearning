package Functions;
import java.util.*;
public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumOfTwoNumbers(a,b);
        System.out.println("Sum of " + a + " and " + b + " is equals to " + sum);

    }

    private static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
}
