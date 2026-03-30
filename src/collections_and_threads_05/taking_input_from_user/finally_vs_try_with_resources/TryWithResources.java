package collections_and_threads_05.taking_input_from_user.finally_vs_try_with_resources;

/*
     Try-with-resources -- let declare resources (like - Scanner, BufferedReader, FileReader) inside the 'try' block
                        -- and they automatically closed when the 'try' block finishes without needed of 'finally' block
 */

import java.util.*;

public class TryWithResources {
    public static void main (String []args){

        try(Scanner sc = new Scanner(System.in)){                       //'sc' - get closed automatically after execution of 'try' block
            int num = sc.nextInt();
            System.out.println("Numbered entered: " + num );
        }catch(Exception e ){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
