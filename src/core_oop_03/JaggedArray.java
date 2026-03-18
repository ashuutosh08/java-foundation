package core_oop_03;

public class JaggedArray {
    public static void main(String[]args){

//   Jagged array -- when the size of arrays are not same inside array.

        int num[][] = new int[3][];
        num[0] = new int[3];            //defines size of array inside index 0 of element
        num[1] = new int[4];            //defines size of array inside index 1 of element
        num[2] = new int[2];            //defines size of array inside index 2 of element

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                num[i][j] = ((int)(Math.random()*10));
            }
        }

//        print-- for each loop

        for(int[] n : num){
            for(int m : n){
                System.out.print(m+ " ");
            }
           System.out.println(" ");

        }



    }
}
