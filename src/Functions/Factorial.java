package Functions;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int fact = factorial(num);

        System.out.println("Factorial of " + num + " is equals to " + fact);
    }

    private static int factorial(int num) {
        int fact = 1;
        while(num > 1)
            fact = fact * num--;
        return fact;
    }
}
