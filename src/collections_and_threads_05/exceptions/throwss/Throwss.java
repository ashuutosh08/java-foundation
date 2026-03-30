package collections_and_threads_05.exceptions.throwss;

/*
     -throws is written after the method name(void test() throws Exception)
     -it only declares the exception may occur
     -actual exception is created using 'throw'
     -used for ducking (passing responsibility)
     -passes exception handling to caller method
     -always used with method (void test() throws Exception)

     -works with 'throw'
        void test() throws Exception {
            throw new Exception("Error");
}
 */

public class Throwss {

    static void checkAge(int age ) throws Exception{                //declare exception
        if(age < 18){
            throw new Exception("Not eligible");                    //exception created(using throw)
        }System.out.print("Eligible");
    }


    public static void main (String []args){



        try{                                                        //caller method handling the exception decked by method
            checkAge(18);
        }catch(Exception e){
            System.out.println("Handled in main: " + e.getMessage());
        }

    }
}
