package core_oop_03;


class Calculator {                              //class created
    public int add(int n1 , int n2){            // method created
        return n1 + n2 ;
    }

}

public class Add_Numbers_Through_Method {

    public static void main(String[]args){

        Calculator obj = new Calculator();        // created instance
        int output = obj.add(6,7);
        System.out.println(output);



    }
}
