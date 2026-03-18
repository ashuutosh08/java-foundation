package core_oop_03;

public class StringBasics {
    static void main() {

//  In java String is class

        String name = "Ashutosh";


//  Creating object of class String

        String name1 = new String("Ashutosh");              // passing value to String "Ashutosh"
        System.out.println(name1);
        System.out.println("Hello " +name1);                        // exceptionally we can concatenate String
        System.out.println(name1.charAt(4));                        // character at index no. output: "t"
        System.out.println(name1.concat(" Singh"));             // concatenate String


//  Single String with multiple references

        String s1 = "Shyam";
        String s2 = "Shyam";

        System.out.println(s1 == s2);                               // output : true

        // two references with one String. Get call from String "Shyam" stored in STRING CONSTANT POOL under heap.



//  Immutable String (can't  change)

//        We can only create new string object contained updated String

        String str = "Ashutosh";                                    //String object created
        str = str + "Singh";                                        // here it's not updated, created new String object for further usage

        // str = "AshutoshSingh", "Ashutosh"(still in memory) will be eligible for garbage collection




//  mutable String (can change) StringBuffer(thread safe)/StringBuilder(not thread safe)

        StringBuffer sb = new StringBuffer("Hello");                //String object created
        sb = sb.append("World");                                    // modified sb by "HelloWorld"
        sb.length();
        sb.insert(5 , "-");
        System.out.println(sb);




    }
}
