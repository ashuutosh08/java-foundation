package core_oop_03;


 class Calc {
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1*n2*n3;
    }
    public double add(int n1 , double n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String []args){

        Calc obj = new Calc();
        int output = obj.add(2,3);
        System.out.println(output);

        double output1 = obj.add(2,2);
        System.out.println(output1);

        int output2 = obj.add(2,5,7);
        System.out.println(output2);

    }
}
/*Method Overloading- multiple methods with same name.

       1. Method overloading is not depend -----the name of method (add - in this class)
                                         -----the return type (int, double )
       2. Depends on ----- parameter holding by the method
                     ----- can have same no. of parameter but with different type
                     (int n1, int n2)
                     (int n1, int n2, int n3)
                     (int n1 , double n2)

 */








