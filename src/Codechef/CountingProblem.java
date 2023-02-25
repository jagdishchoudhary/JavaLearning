package Codechef;
import java.util.*;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- != 0){
            int n = sc.nextInt();
            int oddNums = 0;
            for(int i = 0; i <= n ;i++){
                int num = sc.nextInt();
                if(num % 2 != 0)
                    oddNums++;
            }

            if(oddNums>= 2 && oddNums % 2 ==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
