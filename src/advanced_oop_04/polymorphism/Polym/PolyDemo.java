package advanced_oop_04.polymorphism.Polym;


class A {
    public void show(){
        System.out.println("show in A ");
    }
}
class B extends A{
    public void show(){
        System.out.println("show in B ");
    }
}
class C extends A {
    public void show(){
        System.out.println("show in C ");

    }
}

public class PolyDemo {
    public static void main (String []args ){

        A obj = new A();
        obj.show();                     // call class A (method)

        A obj1 = new B();
        obj1.show();                    // call class B

        obj1 = new C();                 // call class C
        obj1.show();

        obj1 = new A();
        obj1.show();                    // call class A


//    Dynamic method dispatch -- which method to call we are not sure
//    method ".show()" -- is decided at run time -- called runtime polymorphism

    }
}
