package collections_and_threads_05.taking_input_from_user;

/*
       Scanner class - used to take input from user
       - it can read different data types easily - int, float, double, String etc
       - no manual conversion needed

 */

import java.util.*;

public class ScannerInput {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Hii, " + name + " you are "+ age + " years old ");


        sc.close();

//      sc.close(); - in java classes that deals with IO operations should be closed when you're done to prevent resource leakage.



    }
}
