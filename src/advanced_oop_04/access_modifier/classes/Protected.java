package advanced_oop_04.access_modifier.classes;

public class Protected {
    protected int password = 123;

    public static void main(String []args){

        Protected obj = new Protected();
        System.out.println(obj.password);
    }
}
