package Codechef;
import java.util.*;
public class ExpenseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-- != 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int totalIncome = (int) Math.pow(2,X);

            for(int i = 1; i <=N; i++){
                totalIncome = totalIncome/2;
            }
            System.out.println(totalIncome);
        }
    }
}
