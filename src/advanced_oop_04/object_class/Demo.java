package advanced_oop_04.object_class;


/*
      --toString() Method

 * - toString() is from Object class
 * - It is called automatically when we print object
 * - Default output is not meaningful  ----(A@8efb846  ----- A(class name ) -- @ -- 8efb846(hexadecimal no. - memory address))
 * - So we override it to show object data
 */

import java.util.Objects;

class A {
    String model;
    int price;

    public String toString(){
        return(model + ":" + price);
    }
//    public boolean equals(A that ){
//       return this.model.equals(that.model)  && this.price == (that.price);
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof A a)) return false;
        return price == a.price && Objects.equals(model, a.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }

}

public class Demo {

   public static void main(String[] args) {

       A obj = new A();
       obj.model = "Lenovo";
       obj.price = 1000;

       A obj1 = new A();
       obj1.model = "Lenovo";
       obj1.price = 1000;

       System.out.println(obj.toString());
       System.out.println(obj);                                         // both print -- works as same('obj' calls method 'obj.toString' automatically)

       boolean result = obj.equals(obj1);                               // without 'equals' method -- give false -- it compares memory address of both 'obj1' and 'obj'
       System.out.println(result);
       System.out.println(obj.hashCode() + " " +  obj1.hashCode());     //- If two objects are equal according to equals(), they must have the same hashcode.










   }
}
