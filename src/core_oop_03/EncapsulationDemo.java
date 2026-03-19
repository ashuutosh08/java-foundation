package core_oop_03;

// Encapsulation is for data hiding and for controlled access. By declaring variables as 'private'



class Human {
    private String name = "Ashutosh";                                // here are private instance variables
    private int age = 11 ;                                       // can't access outside Human Class
    private String name1;
    private int age1;

//

 //  To get access private variable we need Method

    public String getName(){                                    // method names --- flexible
        return name;
    }
    public int getAge(){
        return age;

    }

 //  To Assign(set) laterals to the private variable we need method as well

    public void setName(String n){
        name1 = n;
    }
    public void setAge(int a){
        age1 = a;
    }

 //  Method to get the previous private variable(name1, age1)

    public String getName1(){
        return name1;
    }
    public int getAge1(){
        return age1;

    }

}

public class EncapsulationDemo {
    public static void main(String [] args){

        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());



        obj.setAge(12);                     // Assigning age value
        obj.setName("Singh");               // Assigning name value

        System.out.println(obj.getName1() + " : " + obj.getAge1());           // getting value after setting


    }
}
