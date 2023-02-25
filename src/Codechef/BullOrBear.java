package Codechef;
import java.util.*;

public class BullOrBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- != 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X > Y)
                System.out.println("LOSS");
            else if(X < Y)
                System.out.println("PROFIT");
            else
                System.out.println("NEUTRAL");
        }
    }
}
