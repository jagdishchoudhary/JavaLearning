package Codechef;
import java.util.*;

public class MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int A = sc.nextInt();
            int C = sc.nextInt();
            int B = (A + C) / 2;

            if(2 * B == A + C)
                System.out.println(B);
            else
                System.out.println("-1");
        }
    }
}

