package collections_and_threads_05.exceptions;

/*
    Try - Put risky code here
    Catch - Handle the error if it occurs

    Working-
    1. code inside try runs
    2. if no error - catch is ignored
    3. if error occurs - jump to catch
    4. error get handled there

 */

public class TryCatchExample {
    public static void main(String []args){


//  ex-1

        int a = 10;
        int b = 0;

        try{                                                    //(ErrorType variable name )
            int result = a/b;                                   // here cannot divide by zero - it will jump to catch
            System.out.println(result);
        }catch(Exception e){                                    // Exception - parent class of all exceptions
            System.out.println("Error found " + e);              // 'e' - gives types of exception(ArithmeticException)
        }

        System.out.println("Bye");


//  ex-2

        int arr[] = new int[5];

        try{
           System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println("Error found" + e);              // 'e' - ArrayIndexOutOfBoundsException
        }


    }
}
