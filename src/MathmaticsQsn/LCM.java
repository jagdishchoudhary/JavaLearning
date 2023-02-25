package MathmaticsQsn;
import java.util.*;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- != 0){
            int N = sc.nextInt();
            for(int i = N; i >= 1; i--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
