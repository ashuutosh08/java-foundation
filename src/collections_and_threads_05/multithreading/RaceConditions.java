package collections_and_threads_05.multithreading;

/*
      Race Condition - multiple threads access and modify shared data at the same time - leading unpredictable outputs
                     - 'race' - threads are competing to finish first

      during the threads execution main method executes the code apart from threads that is --- System.out.println(c.count);
      - prints the count without even threads complete the loop
      - To force main method to wait till threads complete loop we use "Thread.join();"
      - we still cannot get the exact result for that we use "synchronized" in method
 */

class Counter {
    int count;

    public synchronized void increment(){
        count++;
    }

}

public class RaceConditions {
    public static void main(String []args)throws Exception{
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <=10000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () ->{
            for (int i = 1; i <=10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();                      // wait for thread 't1'
        t2.join();                      // wait for thread 't2' ----- then execute line '47'(System.out.println(c.count);)

        System.out.println(c.count);


    }
    }


