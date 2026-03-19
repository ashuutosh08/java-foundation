package core_oop_03;

class Demo {
    private String name;
    private int age;

//  'this' solves name conflicts b/w parameter and instance variable
//    it also removes need of second name


//   public void setAge(int a){
//       age = a;               -- Java knows: 'age' = instance field, 'a' = parameter

    public void setAge(int age) {
        this.age = age;        //-- replacement of double naming 'age = a'
    } // this.age - instance variable
      // age - local parameter

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class ThisKeywordEncapsulation {
    static void main() {


        Demo obj = new Demo();

        obj.setAge(17);
        obj.setName("Ashutosh");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }



}
