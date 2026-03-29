package collections_and_threads_05.exceptions;

class LowerMarksException extends RuntimeException{
    public LowerMarksException(String message){
        super (message);
    }
}

public class CustomException {
    public static void main (String []args){

        int marks = 2;

        try{
           if(marks < 32){
               throw new LowerMarksException("Fail");
           }


        }catch(LowerMarksException e){
            System.out.println("Result: " + e.getMessage());
        }

    }
}
