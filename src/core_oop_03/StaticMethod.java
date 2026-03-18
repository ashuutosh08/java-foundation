package core_oop_03;


class Mobiles2{

//  Instance variable -- by each object separately
    String brand;
    int price;
//  static variable -- shared by all objects
    static String type;


//  instance method require object to call
//   here we can directly call brand. price and type
    public void show(){
        System.out.println(brand + ":" + price + type);
    }
// here we can call only static variable(we can't access brand and price )
//   so, we have used reference obj1 to access them
  public static void show1(Mobiles2 obj1){
      System.out.println(obj1.brand + ":" + obj1.price + type);

  }

}
public class StaticMethod {
    public static void main(String []args){

        Mobiles2 obj1 = new Mobiles2();
        obj1.brand = "Apple";
        obj1.price = 600;


        Mobiles2 obj2 = new Mobiles2();
        obj2.brand = "Samsung";
        obj2.price = 1000;

        Mobiles2.type = " Smartphone";          // setting static variable(shared to all objects )


        obj1.show();                            // print Apple data
        obj2.show();                            // print Samsung data

//      Calling static method -- no object needed
//       But we pass object manually to access its data
        Mobiles2.show1(obj1);

    }
}
