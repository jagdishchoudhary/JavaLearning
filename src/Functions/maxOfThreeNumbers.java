package Functions;
import java.util.*;

public class maxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = maximumNumber(a,b,c);
        System.out.println("Maximum among " + a + "," + b + " and " + c + " is " + max);
    }

    private static int maximumNumber(int a, int b, int c) {

        if(a > b){
            if(a > c)
                return a;
            else
                return c;
        }else {
            if(b > c)
                return b;
            else
                return c;
        }
    }
}
