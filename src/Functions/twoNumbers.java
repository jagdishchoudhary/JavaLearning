package Functions;
import java.util.*;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

       int lcm = lcmOfTwoNumbers(a,b);
       System.out.println("LCM of "+ a + " and " + b + " is " + lcm);

        int gcd = greatestCommonDivisor(a,b);
        System.out.println("GCD of "+ a + " and " + b + " is " + gcd);

    }

    private static int greatestCommonDivisor(int a, int b) {
        if(b == 0)
            return a;
        return greatestCommonDivisor(b, a % b);
    }

    private static int lcmOfTwoNumbers(int a, int b) {


        int lcm = 1;
        while(lcm % a != 0 || lcm % b != 0)
            lcm++;

        return lcm;
    }
}
