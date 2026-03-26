package advanced_oop_04.abstract_classes;

abstract class Abc{
    public abstract void show();
    public abstract void config();

}


public class AbstractAnonymousInnerClass {
    public static void main(String[]args){

        Abc obj = new Abc(){                        // created object for Anonymous inner class/ not Abstract class
            public void show(){
                System.out.println("In  new show");
            }
            public void config(){
                System.out.println(" In config");
            }
        };
        obj.show();
        obj.config();
    }
}
