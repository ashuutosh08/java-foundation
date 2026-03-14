package control_flow_and_array_02;

public class ConditionalStatements {
    public static void main (String []args ) {



        int a = 2;
        int b = 7;
        int c = 9;

// if

        if (a < b)
            System.out.println("Greater");

// if else

        if (b % a == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

// nested if else

        if(c>b) {
            if (b > a) {
                System.out.println(c + ": is greatest number ");
            }
        } else {
            System.out.println("Nothing ");
        }



        int number = 15;

        if (number > 0) {
            System.out.println("Positive number");

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else {
            System.out.println("Not a positive number");
        }


        int n = 7;

        if(n == 1)
            System.out.println("Monday");
        else if(n ==2)
            System.out.println("Tuesday");
        else if(n ==3)
            System.out.println("Wednesday");
        else if(n ==4)
            System.out.println("Thursday");
        else if(n ==5)
            System.out.println("Friday");
        else if(n ==6)
            System.out.println("Saturday");
        else if(n ==7)
            System.out.println("Sunday");
        else
            System.out.println("There is no any day ");





//        Ternary if-else (shorthand way to write if-else)

        int x = 2;
        int y = 4;

        String str = y % x ==0 ? "even" : "odd" ;         //variable = (condition) ? value if true : value if false
        System.out.println(str);


        }
    }