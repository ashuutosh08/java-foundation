package collections_and_threads_05.multithreading;

/*
    Thread priority - it is the number 1 --10 that tells CPU which thread should be given preference
                    - 1---- least priority(Thread.MIN_PRIORITY)
            Default - 5---- normal priority(Thread.NORM_PRIORITY)
                    - 10--- highest priority(Thread.MAX_PRIORITY)

    Priority - means importance(can suggest only to scheduler) / not control


 */

class A1 extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println("Hii");
        }

    }
}
class B1 extends Thread {
    public void run(){
        for(int i = 1; i < 5; i++){
            System.out.println("Hello");
        }

    }
}

public class ThreadPriority {
    public static void main(String []args){

        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj1.setPriority(Thread.MAX_PRIORITY);                                   // high priority thread may run fast
        obj2.setPriority(Thread.MIN_PRIORITY);                                   // low priority thread may run slow comparatively high one


        obj1.start();
        obj2.start();

        System.out.println(obj1.getPriority() + ": " + obj2.getPriority());      // tell priority of object(10 : 1)

        obj1.setPriority(2);                                                     // setting priority manually (within 1-10)
        obj2.setPriority(5);
    }
}
