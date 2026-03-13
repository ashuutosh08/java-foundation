package basics_01;

public class VariablesAndDataType {
    public static void main (String []args){

        byte b = 127;            // -128 → 127
        short s = 542;           // −32,768 → 32,767
        int i = 10;
        long l = 5576L;          // ( l or L)

        float f = 4.2F;          //( f or F)
        double d = 4.3;

        char c = 'A'+'2'+'q';

        boolean bl = true;


        /*

         Data types --- byte,short, int, long, float, double, boolean
         Variables --- b,s,i,l,f,d,bl
         Laterals --- 127, 542, 10, 5576L, 4.2F, 4.3, true

        */

        int num = 0b100;        // it will give binary to decimal
        System.out.println(num);
        int num2 = 0x10A;
        System.out.println(num2); // it will give hexadecimal

        int num3 = 100_00_00_00;
        System.out.println(num3);  // it will give only zero without _(for convenient)


    }
}
