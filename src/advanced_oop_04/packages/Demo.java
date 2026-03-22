package advanced_oop_04.packages;

import advanced_oop_04.packages.classes.*;
/*
    'import'-- allow access  "classes" of package 'packages'
     ex--import advanced_oop_04.packages.classes.*;
        or import advanced_oop_04.packages.classes.Calc;
     '*' -- all files under 'classes'(not folders)
 */



public class Demo {
    public static void main(String []args){

        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();

        int r1 = obj.add(3,8);
        int r2 = obj1.multi(3,8);
        System.out.println(r1 + " " + r2);

    }
}
