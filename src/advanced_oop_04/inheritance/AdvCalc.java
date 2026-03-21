package advanced_oop_04.inheritance;

/* "AdvCalc extends Calc" ( defines - AdvCalc inherited from Calc)
    it is called by class file not java(delete Calc.java won't affect)
         extends works at the class level, not the file level.
         If the parent class’s compiled definition (.class) is missing,
         your subclass won’t work. If only the .java source is missing but the
         .class is still present, it will work —
         but you can’t modify or recompile the parent.

    AdvCalc can use the methods of Calc (+,-)

 */

public class AdvCalc extends Calc {                                        // AdvCalc -- derived class(Calc)
    public int multi(int a , int b){
        return a * b ;
    }
    public int div(int a , int b){
        return a/b;

    }
}
