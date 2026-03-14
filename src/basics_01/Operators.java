package basics_01;

public class Operators {
    public static void main (String []args){


//        Arithmetic Operators

        int a = 9;
        int b = 4;

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int di = a/b;                  // provides only quotient
        int mod = a%b;                 // provides the remainder


//        Relational Operator

        int a1 = 7;
        int b1 = 9;

        boolean bl = a1==b1;            // equal to that is false
        boolean bl1 = a1!=b1;           // not equal to that is true
        boolean bl2 = a1>b1;            // greater than that is false
        boolean bl3 = a1<b1;            // less than that is true
        boolean bl4 = a1>=b1;           // greater than equal that is false
        boolean bl5 = a1<=b1;           // less than equal that is true


//        Logical Operator

        int a2 = 5;
        int b2 = 8;

        int a3 = 7;
        int b3 = 4;

        // Ampersand(&&)AND -- checks the all given conditions to be true to provide true

        boolean bl6 = (a2<b2) && (a3>b3);   // provides true

        // Pipe(||)OR -- checks at least one to be true to provide true

        boolean bl7 = (a2<b2) || (a3<b3);   // provides true

        // Exclamation(!) NOT -- negate the actual boolean value

        boolean bl8 = !(a2<b2);            // provides false






    }
}
