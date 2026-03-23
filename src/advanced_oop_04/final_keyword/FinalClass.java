package advanced_oop_04.final_keyword;


final class Calc {
    public void show(){
        System.out.println(" In Calc show ");
    }
    public void add(int a , int b ){
        System.out.println(a+b);    }
}

//  class AdvCalc extends Calc{ }  ------ we cannot extend or inherit class ' Calc ' ----- final
//  final(class)   ---- used to stop inheritance





public class FinalClass {

    static void main(String[] args) {

        Calc obj = new Calc();
        obj.add(3,4);


    }






}
