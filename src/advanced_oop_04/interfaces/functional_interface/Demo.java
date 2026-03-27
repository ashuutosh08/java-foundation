package advanced_oop_04.interfaces.functional_interface;

/*
   Functional Interface - interface with only one Abstract method \
                        - also called SAM( Single Abstract Method)
 */

@FunctionalInterface                                    // Annotation will ensure it 'A' is functional interface
interface A{
    void show();
}

// class B implements A{
//    public void show(){
//        System.out.println("in show ");
//    }
//}


public class Demo {
    public static void main(String []args){

        A obj = new A()                                 // here we are using anonymous class(instead of class 'B' )
        {
            public void show(){
                System.out.println("in  show ");
            }
        };
        obj.show();

    }
}
