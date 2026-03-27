package advanced_oop_04.enumeration;

enum Laptop{
    Macbook(2000), XPS(1800), ThinkPad(1600), Surface;

      private int price;



    private Laptop(int price) {
        this.price = price;
    }
    private Laptop(){
        price = 1900;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String []args){

        Laptop lap = Laptop.Macbook;
        System.out.println(lap +":" + lap.getPrice() );


        Laptop obj = Laptop.XPS;
        obj.setPrice(2700);



        for(Laptop la : Laptop.values()){
            System.out.println(la + ":" + la.getPrice());

        }


    }
}
