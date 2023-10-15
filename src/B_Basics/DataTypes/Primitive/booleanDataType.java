package B_Basics.DataTypes.Primitive;


/** @Type: boolean
 * @Description: true or false
 * @Default: false
 * @Size: 1 bit
 * @Range: true, false
 */

public class booleanDataType {
    public static void main(String[] args) {
        // declaring
       boolean flag = true;
       System.out.println("value of flag: " + flag);

       //Inverting
       flag = !flag;
       System.out.println("value of flag: " + flag);
    }
}
