package collections_and_threads_05.collection_api;

/*
    List - Interface in Collections
         - maintain insertion order
         - allow duplicate elements
         - supports index based access

    ArrayList - it is a 'class' implements 'List'
 */
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String []args){


//  We can simply insert elements and access without complex methods

        List<Integer> nums = new ArrayList<Integer>();                  // Object created of ArrayList class
        nums.add(12);                                                   // inserting elements
        nums.add(23);
        nums.add(3);
        nums.add(30);
        nums.add(7);
        nums.add(7);                                                    // List - supports repeated value


        System.out.println(nums );                                      //output: [12, 23, 3, 30, 7]
        System.out.println(nums.get(1));                                //printing elements through index - output: 23
        System.out.println(nums.indexOf(23));                           //find the index by elements output:1(index)



    }
}

