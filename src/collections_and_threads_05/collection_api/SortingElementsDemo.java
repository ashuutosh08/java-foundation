package collections_and_threads_05.collection_api;

/*
     Sorting Elements - Java collections (like ArrayList, TreeSet, etc.) need a way to sort objects.
                      - for primitives -- easy to sort
                      - custom objects -- need rules to sort


     Comparable - present in 'java.lang'
                - used to define natural sorting
                - class itself implements it
                - only one sorting logic

     Comparator - present in 'java.util'
                - used for custom sorting
                - separate class (not inside class)
                - can have multiple sorting logics


 */



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingElementsDemo {
    public static void main(String []args){

        List<Integer> nums = new ArrayList<>();                         // not compulsory to put <Integer> both side (since java 1.7)

        nums.add(20);
        nums.add(13);
        nums.add(10);
        nums.add(50);

//  Comparable
        Collections.sort(nums);                                         // sorts the elements
        System.out.println(nums);                                       // output: [10, 13, 20, 50]

//  Comparator

        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if(i%10> j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums1 = new ArrayList<>();
            nums1.add(87);
            nums1.add(56);
            nums1.add(21);
            nums1.add(98);

            Collections.sort(nums1,com);
        System.out.println(nums1);                                      //sorted output:[21, 56, 87, 98](second digit)





    }
}
