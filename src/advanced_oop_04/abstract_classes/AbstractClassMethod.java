package advanced_oop_04.abstract_classes;

/*
   Abstract class -- Incomplete class, it says here is blueprint but the details must be filled by subclass
   Abstract method -- method without body
   Cannot create object from abstract class directly, by reference it's possible with subclass object
   Class must be abstract if it has abstract method
   compulsory to implement all the abstract methods in subclass if not
    -it will be declared extended abstract class

 */

abstract class Car {                                                    // Abstract class

    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Music Playing ");
    }
}
abstract class WagonR extends Car{                                      // Abstract class

    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedWagonR extends WagonR {                                       // Concrete class
    public void fly(){
        System.out.println("Flying");
    }
}

public class AbstractClassMethod {
    public static void main(String []args){

       Car obj = new UpdatedWagonR();
       obj.playMusic();
       obj.drive();
       obj.fly();
    }
}
