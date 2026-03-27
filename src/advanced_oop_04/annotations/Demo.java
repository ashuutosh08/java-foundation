package advanced_oop_04.annotations;

/*
  Annotations -- it is metadata(data about data )
              -- it doesn't directly change logics in program
              -- it gives extra information to compiler or runtime
 */

class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override                                                   // @Override - is annotation that tells compiler this method is overridden
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");


    }
    }

    public class Demo {
    public static void main(String []args){

        A obj = new A();
        obj.showTheDataWhichBelongsToThisClass();            // here method override happens
    }
}
