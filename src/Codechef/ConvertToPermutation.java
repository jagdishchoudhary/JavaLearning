package Codechef;
import java.util.*;
class ConvertToPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- != 0){
            int size = sc.nextInt();
            Set<Integer> nums = new HashSet<Integer>();
            int sum = 0;
            for(int i = 0; i < size; i++) {
                int num = sc.nextInt();
                nums.add(num);
                sum += num;
            }
            if(size * (size + 1) / 2 < sum)
                System.out.println(-1);

            if(size != nums.size() && size * (size + 1) / 2 == sum)
                System.out.println(-1);
            else
                System.out.println((size * (size + 1)) / 2 - sum);
        }
    }
}
