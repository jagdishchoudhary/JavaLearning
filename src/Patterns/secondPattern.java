package Patterns;

public class secondPattern {
    public static void main(String[] args) {
        // Hollow rectangle
        /*

        ******
        *    *
        *    *
        *    *
        ******

         */

//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= 6; j++){
//                if(i == 1 || i == 5){
//                    System.out.print("*");
//                }else {
//                    if(j == 1 || j == 6){
//                        System.out.print("*");
//                    }else {
//                        System.out.print(" ");
//                    }
//                }
//
//            }
//            System.out.println();
//
//        }

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 6; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
