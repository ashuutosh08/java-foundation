package collections_and_threads_05.multithreading;

/*
       Runnable Interface - used to define a task a thread will execute
                          - defines what work a thread should do
                          - Thread implements Runnable

  Requirement of Runnable - java doesn't support multiple inheritance of classes
                          - with Runnable - your class can still extend another class

           ex-

           class A {
           public void (){
           }
           }
           class B extends A, threads                    ----------- we cannot do this(multiple inheritance )

    with Runnable

           Class A {
           public void (){
           }
           }
           class B extends A implements Runnable         ------- can do this


 */

class A3 implements Runnable {
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
class B3 implements Runnable {
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

public class RunnableDemo {
    public static void main(String []args ){

        Runnable obj1 = new A3();
        Runnable obj2 = new B3();

        Thread t1 = new Thread(obj1);                   // creating thread object and passing task to it - thread now knows what work to execute
        Thread t2 = new Thread(obj2);                   // obj1,obj2 - referring the methods of respective classes

        t1.start();
        t2.start();


    }
}
