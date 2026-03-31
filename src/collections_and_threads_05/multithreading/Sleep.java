package collections_and_threads_05.multithreading;

/*
     sleep() - it is used to pause the execution of thread for specific time
             - take a break and continue later
      syntax - Thread.sleep(time_in_milliseconds);
             - 1 sec = 1000 milliseconds
 */


class A2 extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println("Hii");
           try{
               Thread.sleep(1000);                          // try-catch used - because 'Thread.sleep()' throws 'Interrupted Exception'
           }catch(Exception e){
               System.out.println("Error: " + e );
           }
        }

    }
}
class B2 extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);                         // sleep will let loop Thread run with the gap of 1 sec
            }catch(Exception e){                                  // every iteration will wait for 1 second (1000 millisecond)
                System.out.println("Error: " + e);
            }
        }

    }
}

public class Sleep {
    public static void main (String []args){

        A2 obj1 = new A2();
        B2 obj2 = new B2();

        obj1.start();
        obj2.start();



    }
}
