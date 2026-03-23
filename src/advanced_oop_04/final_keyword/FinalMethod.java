package advanced_oop_04.final_keyword;

/* final method --- used to stop overriding method
   final variable --- to make constant
   final Class --- to stop inheritance
 */




class A {
    public void show(){
        System.out.println("A");

    }
}
class B extends A {
    public void show(){
        System.out.println("B");
    }
}
// in class 'A' and 'B' -- method overriding will work perfectly



//class C {
//    public final void show1(){
//        System.out.println("C");
//
//    }
//}
//class D extends C {
//    public void show1(){                        //show1(); --  will give error ('show1()' is final )
//        System.out.println("D");
//
//    }
//}




public class FinalMethod {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();


    }



 }

