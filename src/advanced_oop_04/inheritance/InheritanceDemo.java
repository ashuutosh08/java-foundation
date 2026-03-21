package advanced_oop_04.inheritance;

public class InheritanceDemo {
    public static void main(String []args){

        VeryAdvCalc obj = new VeryAdvCalc();                    //Using AdvCalc - we can use methods of Calc as well ( inheritance)

        int r1 = obj.add(2,3);
        int r2 = obj.multi(4, 11);
        int r3 = obj.sub(9, 5);
        int r4 = obj.div(15,3);
        double r5 = obj.power(2,2);


        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);





//         Calc -> AdvCalc -------> single level Inheritance
//        Calc -> AdvCalc -> VeryAdvCalc -------> multi-level Inheritance

/*        java doesn't support  multiple inheritance to avoid Ambiguity
            class A(methods- a, b)
            class B(methods- c, a)

            class C inherited from A and B
            if it call method(c) --- Ambiguity occurs

            that's why Java doesn't support multiple Inheritance
 */




    }
}
