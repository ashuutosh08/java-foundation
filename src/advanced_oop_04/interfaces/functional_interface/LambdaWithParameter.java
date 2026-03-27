package advanced_oop_04.interfaces.functional_interface;

@FunctionalInterface
interface Y {
    void show (int i);
}

public class LambdaWithParameter {
    public static void main(String [] args){

//   or Y obj = i ->
        Y obj = (int i) -> System.out.println("In show : " + i);
        obj.show(32);
    }

}
