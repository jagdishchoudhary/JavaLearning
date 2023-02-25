package Codechef;
import java.util.*;
public class TourOfKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- != 0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int total = 5 * N + 7 * M;
            System.out.println(total);
        }
    }
}
