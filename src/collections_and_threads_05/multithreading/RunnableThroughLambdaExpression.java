package collections_and_threads_05.multithreading;

/*
      We can use lambda expression because Runnable is Functional Interface ( having single method)
 */


public class RunnableThroughLambdaExpression {
    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        };

        Runnable obj2 = () ->{
            for (int i = 1; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}