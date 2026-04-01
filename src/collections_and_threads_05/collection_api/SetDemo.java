package collections_and_threads_05.collection_api;

/*
        Set - interface in Collections
            - duplicate elements not allowed
            - not index based (not follows sequence)
            - can store null
        Hashset - Doesn't give sorted values
        Treeset - gives sorted values
 */


import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main (String []args){

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(12);                                                   // inserting elements
        nums.add(23);
        nums.add(3);
        nums.add(30);
        nums.add(7);
        nums.add(7);                                                    // Ignored - unsupported repeated elements

        System.out.println(nums );

        for(int n : nums ){                                             // prints each elements
            System.out.println(n);
        }


        Set<Integer> nums2 = new TreeSet<Integer>();

        nums2.add(34);
        nums2.add(12);
        nums2.add(1);
        nums2.add(19);
        nums2.add(8);

        System.out.println(nums2 );                                      // gives sorted elements

        for(int a : nums2){                                              // prints using for loop
            System.out.println(a);
        }

        Iterator<Integer> values = nums2.iterator();                     // prints elements through Iterator interface
        while(values.hasNext()) {
            System.out.println(values.next());
        }



    }
}
