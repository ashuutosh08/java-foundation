package control_flow_and_array_02;

public class Loops {
    public static void main(String []args ){

//        while loop

        int i = 1;

        while(i<=10){
            System.out.println(i + ". Hello");
            i++;
        }


//        Do while loop

        int j = 1;

        do{
            System.out.println(j + ". Hii");
            j++;

        }while(j<=7);


//        for loop

        int k = 1;

        for(k=1 ; k<=15 ; k++){
            System.out.println(k + ". Hey ");
        }





//        Example-- week days with working hours (nested loop )

        int a = 1;

        for(a=1 ; a<6 ; a++ ){
            System.out.println("Day "+ a);
                    for(int b = 1; b<=8 ; b++){
                       System.out.println(b+8 + "-" + (b+9));
                    }
        }




    }
}
