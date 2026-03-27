package advanced_oop_04.enumeration;

/*
    Enumeration(enum) - special kind of class - used to define collection of named constant
    Each 'constant' in the enum is an object(instance) of that class

 */
enum Day{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

public class Demo {
    public static void main(String []args){
        Day d = Day.Sunday;
        System.out.println(d);
        System.out.println(d.ordinal());                // Output: 6 (index of object in class 'D')

        Day[] ss = Day.values();
        System.out.println(ss[3]);                         // prints desired  elements of enum class

        for(Day s : ss){                                   // prints all the elements of enum with indexes
            System.out.println(s + ":" + s.ordinal());
        }


    }
}
