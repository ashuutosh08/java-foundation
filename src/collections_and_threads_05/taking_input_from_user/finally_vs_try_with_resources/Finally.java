package collections_and_threads_05.taking_input_from_user.finally_vs_try_with_resources;

import java.util.Scanner;

/*
    finally - special section of codes that always executes after 'try' or any 'catch' block (regardless exception thrown or not)
    finally - used for closing the resources manually

 */
public class Finally {
    public static void main (String [] args ){

        int a = 20;
        int b = 0;

        try{
            int result = a/b;               // this will throw exception
        }catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }finally{
            System.out.println("This will always run. Whether exception caught or not ");
        }

            Scanner sc = null;
        try{
            sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("you entered number: " + num );
        }catch(Exception e){
            System.out.println("Error:" + e);
        }finally {
            sc.close();                         //Ensures Scanner 'sc' is closed no matter exception thrown or not
            System.out.println("sc-closed ");
        }

    }

}
