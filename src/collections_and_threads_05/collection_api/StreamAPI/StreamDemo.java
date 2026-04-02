package collections_and_threads_05.collection_api.StreamAPI;

/*
     Stream - used to process collection of data
            - it is a sequence of elements that supports operations (like filter, map, reduce )
            - uses lambda expressions
            - can be parallel
            - we can use Stream only at once
            - supports functional programming
 */

import java.util.*;
import java.util.stream.Stream;
public class StreamDemo {
    public static void main (String []args){

        List<Integer> num = Arrays.asList(4,5,8,1,3);

        Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n-> n%2 ==0);                 // gives only even no.
        Stream<Integer> s3 = s2.map(n -> n*2);                       // doubles value
        int result = s3.reduce(0,(c,e)->c+e );         // sum values

//  alternate way


//        int result1 = num.stream()
//                         .filter(n-> n%2 ==0)
//                         .map(n -> n*2);
//                         .reduce(0,(c,e)->c+e );




//        s1.forEach(n-> System.out.println(n));
//        s1.forEach(n-> System.out.println(n));                              // it will give error(single usage )
//        s3.forEach(n -> System.out.println(n));
//        System.out.println(result);
//


    }
}
