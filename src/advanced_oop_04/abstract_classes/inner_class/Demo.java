package advanced_oop_04.abstract_classes.inner_class;

class A {
    int a;
    public void show(){
        System.out.println("in show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class Demo {
    public static void main(String []args){

        A obj = new A();                                //object created of 'A'
        obj.show();
        obj.a = 12;

//  To create object of class 'B'

        A.B obj1 = obj.new B();                        // to create object first we need object of 'A' -- obj (cause of non-static class)
        obj1.config();

//  call if class 'B' - static

//        A.B obj1 = new A.B();
//        obj1.config();




    }
}
