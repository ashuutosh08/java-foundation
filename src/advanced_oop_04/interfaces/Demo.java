package advanced_oop_04.interfaces;

/*
    Need of interfaces:
    - needed to define rules
    - it defines methods without implementation
    - allows to specify what should be done,
    - while classes decides how to do it and provides actual logics

    interfaces = class with only "public abstract" method
    instantiation = we cannot create object of 'A'(cause it's not a class/ it's a Interface)
                    For that we need 'Implement' keyword - let us create object of Interfaces by reference 'A'.
    implement - it must contain all the abstract methods of ' interface '
    interfaces - can have variables (but will be ' static ' and ' final ').
               - no need of object to call and must contain some value.
    inheritance - class->class-----extends
                  class->interface-----implements
                  interface-> interface-----extends

 */

interface A{
    int age = 12;
    String area = "Hyderabad";

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A,Y{

    public void show() {
        System.out.println("in Show");
    }
    public void config() {
        System.out.println("in Config");
    }
    public void run(){
        System.out.println("Running");
    }

}
public class Demo {
    public static void main(String []args){

        System.out.println(A.area + ":" + A.age);

        A obj;
        obj = new B();
        obj.config();
        obj.show();

        X obj1 = new B();
        obj1.run();
    }
}
