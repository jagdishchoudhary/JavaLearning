package Arrays;

import java.util.*;

public class percentageInSem {
    public static void main(String[] args) {
        int marks[] = new int[6];
        System.out.println("Enter marks");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <=5; i++)
            marks[i] = sc.nextInt();

        int sum = 0;
        for(int i = 0; i <= 5; i++)
            sum += marks[i];

        System.out.println("Percentage : " + sum / 6 * 100);
    }
}
