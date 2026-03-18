package core_oop_03;



// class (the blueprint)
public class ClassMethodObjectCar {

//    properties of class (data and state )

    String type;
    double engineCapacity;



//        method (action to be performed )
        public void carSpecs(){
            System.out.println("It has " + engineCapacity + "cc engine "+ "and it is " + type );

        }
        public static void main(String[]args){

//            Object creation( building real thing from the class/ blueprint)

            ClassMethodObjectCar myCar = new ClassMethodObjectCar();          // creating new instance/object  of variable type 'Car'
            myCar.engineCapacity = 2.1;     // looks inside object and assign data to its property
            myCar.type = "Sedan";           //                         assign data to its property

            myCar.carSpecs();               // calling method to perform action --- Output: It has 2.1cc engine and it is Sedan

//        Another Object(from same object)

            ClassMethodObjectCar friendCar = new ClassMethodObjectCar();
            friendCar.engineCapacity = 1.2 ;
            friendCar.type = "Hatchback ";

            friendCar.carSpecs();           // Output: It has 1.2cc engine and it is Hatchback





        }

    }
