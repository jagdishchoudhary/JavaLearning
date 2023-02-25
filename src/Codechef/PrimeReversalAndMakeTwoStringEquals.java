package Codechef;
import java.util.*;

public class PrimeReversalAndMakeTwoStringEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- != 0){
            int size = sc.nextInt();
            String A = sc.next();
            String B = sc.next();

            System.out.println(isEquals(A, B, size));

        }
    }

    private static String isEquals(String A, String B, int size) {
        if(A.equals(B)){
            return "YES";
        }
        int zerosInA = 0, zerosInB = 0;
        for(int i = 0; i < size; i++)
        {
            if(A.charAt(i) == '0')
                zerosInA++;
            if(B.charAt(i) == '0')
                zerosInB++;
        }

        if(zerosInA == zerosInB)
        return "YES";
        else
            return "NO";
    }

}
