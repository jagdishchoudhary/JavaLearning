package DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        //In java there are mainly 2 types of datatypes
        //1.Primitive     2. Non-Primitive
        //Primitive further divided into 8 datatypes
        //1.boolean, 2.char, 3.byte, 4.short, 5.int, 6.long, 7.float, 8.double

        //boolean
        boolean flag = true;//can have true or false
        System.out.println("Size of boolean variables : not defined " );

        //char
        char ch = 'e';
        System.out.println("Range of char = " + Character.MIN_VALUE + " <= char <= " + Character.MAX_VALUE);

        //byte
        byte num = 23;
        System.out.println("Range of byte = " + Byte.MIN_VALUE + " <= byte <=" + Byte.MAX_VALUE);

       //short
       short st = 343;
       System.out.println("RAnge of short : " + Short.MIN_VALUE + " <= short <= " + Short.MAX_VALUE);

       //int
        int intnum = 4344;
        System.out.println("Range of int : " + Integer.MIN_VALUE + " <= int <= " + Integer.MAX_VALUE);

        //long
        long number = 34243234;
        System.out.println("Range of long :" + Long.MIN_VALUE + " <= long <= " + Long.MAX_VALUE);

        //float
        float flt = 4.33f;
        System.out.println("Range of float = " + Float.MIN_VALUE + " <= float <= " + Float.MAX_VALUE);

        //double
        double dn = 23423.34d;
        System.out.println("Range of double = " + Double.MIN_VALUE + " <= Double <= " + Double.MAX_VALUE);



    }
}
