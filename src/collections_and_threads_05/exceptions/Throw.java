package collections_and_threads_05.exceptions;

/*
    throw - used to manually create and throw exception
          - instead of waiting java to throw exception, you force it yourself
 */

public class Throw {
    public static void main (String []args){

        int a = 18;
        int b = 20;                         // if greater - Denominator is greater than Numerator
                                            // if 0 - Default output  + e(Default output java.lang.ArithmeticException: / by zero)

        try{
            int c = a/b;
            if(c == 0)
                throw new ArithmeticException("Denominator is greater than Numerator ");

        }catch(ArithmeticException e){
            System.out.println("Default output " + e);
        }catch(Exception e){
            System.out.println("Something went wrong ");
        }


    }
}
