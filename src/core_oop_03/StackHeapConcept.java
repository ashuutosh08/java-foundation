package core_oop_03;

class Cal{
    int num = 5;

    public int add(int n1, int n2){                 // method 1
        return n1 + n2;

    }
}


public class StackHeapConcept {
    public static void main(String []args ){        //method 2

        Cal obj = new Cal();
        Cal obj1 = new Cal();

        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);


    }
}


/*
        Stack--
        stack memory is where java keep track of method execution and local variable.
        when 'main' starts the a 'frame'  get created on the stack

        Reference/local variable- obj , obj1/ n1, n2
        These reference variable lives in the stack without containing actual data of 'Cal' class.
        instead stack holds the memory address of obj on the Heap memory.

        Heap--
        heap is where actual objects live .
        every time we create new object like 'obj', java create space in heap to store new instance for that class

        Instance variable - num
        instance variable lives in the heap
 */