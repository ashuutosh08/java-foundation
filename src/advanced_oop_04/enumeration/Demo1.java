package advanced_oop_04.enumeration;

enum Status{
    Running, Failed, Pending, Success
}
public class Demo1 {
    public static void main (String []args){

        Status s = Status.Success;

//      By if-else

        if(s == Status.Running){
            System.out.println("All good");
        } else if (s == Status.Failed) {
            System.out.println("Try Again");
        }else if (s == Status.Pending){
            System.out.println("Please Wait");
        }else {
            System.out.println("Done");
        }

//      By switch

        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
            default:
                System.out.println("Done");
        }

    }

}


