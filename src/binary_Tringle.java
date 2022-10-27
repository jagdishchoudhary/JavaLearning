public class binary_Tringle {

    public static void main(String[] args) {


        boolean flag = true;
        for(int i = 1; i <= 5; i++) {

            if(i % 2 == 0)
                flag = false;
            else
                flag = true;


            for(int j = 1; j <= i; j++){
                if(flag)
                    System.out.print("1");
                else
                    System.out.print("0");

                flag = ! flag;
            }
            System.out.println();

        }
    }
}
