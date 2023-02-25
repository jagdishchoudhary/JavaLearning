package Codechef;
import java.util.*;
class EqualCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- != 0){
            int numOfPlayers = sc.nextInt();
            System.out.println(52 % numOfPlayers);
        }
    }
}
