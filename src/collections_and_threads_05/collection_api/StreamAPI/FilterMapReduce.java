package collections_and_threads_05.collection_api.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMapReduce {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4,5,8,1,3);

        Predicate<Integer> p = new Predicate<Integer>() {                       // predicate gives boolean value

            public boolean test(Integer n) {
                if(n % 2 == 0)
                    return true;
                else
                    return false;
            }
        };

        Function<Integer, Integer> fun = new Function<Integer, Integer>() {

            public Integer apply(Integer n) {
                return n*2;
            }
        };


        int result = num.stream()
                         .filter(p)
//  or                   .filter(n-> n%2 ==0)
                         .map(fun)
//  or                   .map(n -> n*2)
                         .reduce(0,(c,e)->c+e );


        System.out.println(result);



//  gives sorted values


        Stream<Integer> sortedValue = num.stream()
                .filter(n -> n%2 ==0)
                .sorted();

        sortedValue.forEach(n-> System.out.println(n));

    }
}
