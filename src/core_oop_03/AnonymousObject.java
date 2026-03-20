package core_oop_03;

class Aa {

    public Aa() {
        System.out.println("object is created ");
    }
    public void show(){
        System.out.println("In a show");
    }
}

public class AnonymousObject {
    public static void main (String []args){


        Aa obj = new Aa();
//         here are 2 steps first create obj "new Aa();" and then assigning the value " Aa obj"

        obj.show();

        new Aa();               // it is anonymous object (can be used only once )

    }
}
