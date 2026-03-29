package collections_and_threads_05.exceptions;

public class MultipleCatch {
    public static void main(String []args){

        int a = 10;
        int b = 2;
        String s = null;

        int arr[] = new int[5];

        try{
            int j = a / b;
            System.out.println(s.length());
            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Cannot be divided by 0 ");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in Array's index limit ");
        }catch(Exception e){                                                // parent class of exception should place always at the bottom (cause it can handle every exception)
            System.out.println("Something went wrong ");
        }
    }
}
