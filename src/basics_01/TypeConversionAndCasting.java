package basics_01;

public class TypeConversionAndCasting {
    public static void main(String []args){


//    Type Conversion

        byte b = 127;
        int i = b;
        System.out.println(i);

        float f = 3.4f;
        int d = (int)f;
        System.out.println(d);    // it gives int without decimal number --3

//    Type casting

        byte b1 = 127;
        int i1 = (int)b1;
        System.out.println(i1);

        int i2 = 256;
        byte b2 = (byte)i2;
        System.out.println(b2);  // print 0 ( int 256 % byte range 256 = remainder 0 )


//    Type Promotion

        byte b3 = 1;
        byte b4 = 20;

        int b5 = b3 * b4;               // or byte b5 = (byte) (b3 * b4) --- casting
        System.out.println(b5);


    }
}
