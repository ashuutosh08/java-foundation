package advanced_oop_04.class_casting;

class A{
    public void show1(){
        System.out.println("Show in A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("Show in B");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {


// up casting -- parent reference child object

        A obj = (A)new B();        // calls method 'A' -- it is implicit(works without mentioned )
        obj.show1();               //  Converting a child (subclass) object into a parent (superclass) reference

// down casting -- convert back to child reference

        B obj1 = (B) obj;
        obj1.show2();               // access child-class methods that aren’t visible through the parent reference.

//  rule -- down casting only works if the object is of child type


    }


}
