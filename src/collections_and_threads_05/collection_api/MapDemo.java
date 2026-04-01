package collections_and_threads_05.collection_api;

/*
     Map - Interface, and part Collection Framework(collection API)
         - stores data as key value pairs
         - key must be unique
         - value can be duplicate
         - allows fast searching using key
 HashMap - asynchronized
 HashTable - synchronized works with threads

 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main (String []args){

        Map<String, Integer> students = new HashMap<>();

        students.put("Harsh",20);
        students.put("Anshuman",45);
        students.put("Pranav",78);
        students.put("Sachin",20);

        students.put("Sachin",67);                              // overwrites(updates) the key value of "Sachin" -> 67

        System.out.println(students);                           // prints all the elements

        System.out.println(students.get("Harsh"));              // prints value associated with key "Harsh"

        System.out.println(students.keySet());                  // prints all the keys output: [Anshuman, Pranav, Harsh, Sachin]

        for(String s : students.keySet()){
            System.out.println(s + ":-" + students.get(s));     // prints 'keys' with 'values'
        }



    }
}
