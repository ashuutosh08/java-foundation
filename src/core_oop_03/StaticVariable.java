package core_oop_03;

//  class without static keyword


class Mobile {
    String brand;
    int price;
    String type;

    public void show(){
        System.out.println(brand + ":" + price + "-" + type);
    }
}


//  class with static keyword (Variable - type)


class Mobiles{
    String brand;
    int price;
    static String type;           // static members are tied to the class/ not individual object.

    public void show(){
        System.out.println(brand + ":" + price + "-" + type);
    }

}

public class StaticVariable {
    public static void main (String []args){

        Mobile s1 = new Mobile();
        s1.brand = "Apple";
        s1.price = 1000;
        s1.type = "Smartphone";

        Mobile s2 = new Mobile();
        s2.brand = "Samsung";
        s2.price = 1500;
        s2.type = "Smartphone";

        s1.show();
        s2.show();




        Mobiles s3 = new Mobiles();
        s3.brand = "Apple";
        s3.price = 1000;
        s3.type = "Smartphone";

        Mobiles s4 = new Mobiles();
        s4.brand = "Samsung";
        s4.price = 1500;
        s4.type = "Smartphone";

        Mobiles.type = "Phone";                 // "Phone" became static everywhere in "Mobiles" class
        Mobiles.type = "Keypad";                // "Phone" ------> "Keypad"

        s3.show();
        s4.show();




    }




}
