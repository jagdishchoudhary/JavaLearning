package Codechef;
import java.util.*;

class CandyLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- != 0){
            int totalPackets = sc.nextInt();
            List<Integer> candies = new ArrayList<>();
            for(int i = 0; i < totalPackets; i++){
                candies.add(sc.nextInt());
            }
            System.out.println(isHappy(totalPackets,candies));
        }
    }

    private static String isHappy(int totalPackets, List<Integer> candies) {
        int totalCandies = 0;
        for(int i = 0; i < totalPackets; i++){
            totalCandies = totalPackets + candies.get(i);
        }
        if(totalCandies % 2 != 0)
            return "YES";
        else
            return "NO";

    }
}
