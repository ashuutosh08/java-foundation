package core_oop_03;


class Mobile1 {
    String brand;
    int price;
    String type;
    static String category;

    static{                                             // static block created (runs at once after class loads and before main method execute into jvm)
        category = " Electronics";                      // use to assign laterals common for all objects(assign at once)
        System.out.println("Static block executed");

    }

    public void show(){
        System.out.println(brand + ":" + price + "-" + type + category);
    }
}


public class StaticBlock {
    public static void main() {

        Mobile1 obj = new Mobile1();
         obj.brand = "Apple";
         obj.price = 1000;
         obj.type = "Phone";

        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Samsung";
        obj1.price = 900;
        obj1.type = "Phone";

         obj.show();
         obj1.show();

    }
}
