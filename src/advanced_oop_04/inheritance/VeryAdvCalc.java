package advanced_oop_04.inheritance;


/*
    Inherit __ Calc --> AdvCalc --> VeryAdvCalc

    VeryAdvCalc -- have methods of AdvCalc, Calc both ---> VeryAdvCalc  extends AdvCalc(AdvCalc extends Calc)
 */

public class VeryAdvCalc  extends AdvCalc {
    public double power(int a , int b){
        return Math.pow(a,b);

    }
}
