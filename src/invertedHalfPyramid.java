public class invertedHalfPyramid {
    public static void main(String[] args) {
        /*

        ****
        ***
        **
        *

         */

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Rotate by 180 degree\
        /*

             *
            **
           ***
          ****

         */

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(j < 5-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
