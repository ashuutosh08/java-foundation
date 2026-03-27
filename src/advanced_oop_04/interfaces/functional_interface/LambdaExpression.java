package advanced_oop_04.interfaces.functional_interface;

/*
    Lambda expression - works with functional interfaces

 */
@FunctionalInterface
 interface X{
    void show();
}


public class LambdaExpression {
    public static void main(String []args){
        A obj = () -> System.out.println("in show");
        obj.show();


//  or
//        A obj = () -> {
//            System.out.println("In show");
//        }


    }
}
