package Functions;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print("FibonacciSeries : 1 1 ");
        for(int i = 1; i <= 10; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}
