package core_oop_03;

public class Array {

    public static void main (String[]args){


        int num[] = new int[4];                  // creating array variable with size 4

        num[0] = 3;                             // adding int elements to the array num[]
        num[1] = 5;
        num[2] = 4;
        num[3] = 1;

        System.out.println(num[0]);             // print element on index [0] ----output: 3


        int num1[] = {3,5,4,1};                 // creating array with added element at once

        for (int i=0; i<4; i++){

            System.out.println(num1[i]);        // prints all the elements of the array at once

        }





    }
}
