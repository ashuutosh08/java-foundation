package collections_and_threads_05.exceptions.throwss;

public class Throww {

    static void checkAge(int age){
        try{
            if(age < 18){
                throw new Exception("Not eligible");
            }System.out.println("Eligible");
        }catch (Exception e){
            System.out.println("Handled here :" + e.getMessage());
        }
    }

    public static void main (String []args){

        checkAge(8);
    }


}
