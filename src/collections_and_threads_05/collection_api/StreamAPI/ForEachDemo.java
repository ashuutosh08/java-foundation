package collections_and_threads_05.collection_api.StreamAPI;

/*
   forEach() - method used to iterate over collections using lambda expressions.
             - belongs ot Iterable Interface
             - syntax

                    collection.forEach(element -> {
                        // action
                    });

             -

 */
import java.util.*;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String []args){

        List<Integer> num1 = Arrays.asList(4,5,7,9,2);                       // add elements simultaneously to List

//  working of forEach()

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        num1.forEach(con);


//  short form use of forEach()

        num1.forEach(num -> System.out.println(num));


// or   num1.forEach(System.out::println);



    }
}
