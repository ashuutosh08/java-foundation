package advanced_oop_04.interfaces.functional_interface;

interface Z {
    int add(int a , int b);
}

public class LambdaWithReturnType {
    public static void main(String []args){

        Z obj = (a, b) -> a+b;

//  or  Z obj = new z(){
//              public int add( int a, int b){
//                return a+b;
//            }







        int result = obj.add(3,5);

        System.out.println(result);
    }
}
