package B_Basics.DataTypes.NonPrimitive;

public class StringDataTypes {
    public static void main(String[] args) {
        String str = "String Data type";

        System.out.println("Value of str is: " + str);

        //concatenate two strings
        String str1 = "One ";
        String str2 = "Two";

        String str3 = str1.concat(str2);
        System.out.println("Result of concatenation " + str3);

    }
}
