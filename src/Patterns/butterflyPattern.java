package Patterns;

public class butterflyPattern {
    public static void main(String[] args) {

        /*

        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *

         */

        for(int i = 1; i <= 8; i++){
                int star = i;
                if(i > 4)
                    star = 9-i;
                int spaces = 8 - 2 * star;

                for(int j = 1; j <= star; j++)
                    System.out.print("*");
                for(int j = 1; j <= spaces; j++)
                    System.out.print(" ");
                for(int j = 1; j <= star; j++)
                    System.out.print("*");

            System.out.println();

        }
    }
}
