package advanced_oop_04.polymorphism;

/*  Overriding --- same(method name , parameters inside method) but in subclass
    Dynamic Method Dispatch --- runtime decision of "which add() to call"
    Overriding happens --- at runtime

 */

class Calc {
    public int add(int a , int b ){
        return a+b;
    }
}
class AdvCalc extends Calc{
    //Overrides
    public int add(int a , int b ){
        return a+b+1;

    }
}
public class MethodOverriding {
    public static void main (String [] args ){

        AdvCalc obj = new AdvCalc();      // no polymorphism (reference, object ---same )
        int r1 = obj.add(3, 4);
        System.out.println(r1);           // output: 8

        Calc obj1 = new AdvCalc();        // polymorphism {(reference-Calc,subclass object- AdvCalc) --- different}
        int r2 = obj1.add(3,4);
        System.out.println(r2);           // output: 8



//   Calling Superclass method

        Calc obj2 = new Calc();
        int r3 = obj2.add(3,3);
        System.out.println(r3);



    }
}
