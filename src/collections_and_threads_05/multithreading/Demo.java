package collections_and_threads_05.multithreading;

/*
     Threads - it is small unit of execution inside process or program.
             - one process can have multiple threads

     Multithreading - running multiple threads simultaneously.
                    - ex- 1 thread -- reading input
                          2 thread -- processing
                          3 thread -- printing output


    Creating threads in Java - 1. threads(extends thread class)
                             - 2. runnable(implements runnable interface)


    Thread Execution - start() - method used to begin new thread execution
                     - start() creates new thread
                     - and then calls the run() method internally
                     - you should not call run() method directly

*/

class A extends Thread {
    public void run(){
        for(int i = 1; i < 100; i++){
            System.out.println("Hii");
        }

    }
}
class B extends Thread {
    public void run(){
        for(int i = 1; i < 100; i++){
            System.out.println("Hello");
        }

    }
}

public class Demo {
    public static void main(String []args){

        A obj1 = new A();
        B obj2 = new B();
        obj1.start();                       //start() method let run the both methods (run) simultaneously
        obj2.start();

    }
}
