package core_oop_03;

/*
super() is the way to call parent class constructor from child class constructor
It calls automatically if not defined

 */



class A{
    public A(){                                     // Default constructor
        super();                                    // because class A extends Object (class) by default
        System.out.println("in A ");
    }
    public A(int n){
        super();
        System.out.println("in A int ");            // parameterized constructor
    }
}
class B extends A{
    public B(){                                     // Default constructor
        super(5);
        System.out.println("in B ");
    }
    public B(int n){
/*        this();
          this(); --->   public B(int n)(itself) ---> public B() ---> public A() ---reason all are default(without parameter)
           or // calls both constructors of class B and default of class A
*/
        super(n);                                    // It is there by default even if not mentioned
        System.out.println("in B int ");            // parameterized constructor
    }
}

public class ConstructorSuperMethod {
    public static void main(String []args){

        B obj = new B();                          // here class B called( Default const.) -- automatically it will call class A constructor
        B obj1 = new B(3);                     // call parameterized constructor A as well
        B obj2 = new B();                         // call parameterized A by default B, just by passing value "super(5); at line 23"
    }
}
