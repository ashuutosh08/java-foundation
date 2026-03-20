package core_oop_03;

/*
 Constructors
   A constructor is a special method that runs automatically
   when an object is created using 'new'

 Rules:
   1. Same name as the class
   2. No return type (not even void)
   3. Java provides a default constructor if you don't write one
   4. If you write your own, Java's default one is removed
*/



class Students {

    String name;
    int roll;

    public Students(){                                          //Default constructor
        name = "John";
        roll = 15;
    }

    public Students (String name, int roll){                    //parameterized constructor
        this.name = name;
        this.roll = roll;

    }
}
public class ConstrucotrDemo {
    public static void main (String []args){

        Students stu = new Students();                                // default constructor called
        System.out.println(stu.roll + " " + stu.name);                      // 0, null -- default value


        Students stu1 = new Students("Ashutosh", 45);        // parameterized constructor(constructor having parameter)
        System.out.println(stu1.name +" : " + stu1.roll);              // Ashutosh , 45 -- parameter value


    }
}
