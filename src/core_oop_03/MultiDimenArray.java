package core_oop_03;

public class MultiDimenArray {
    public static void main(String[] args) {

        int arr[][] = new int[3][4];                               // new multi-d array created


        for (int i=0; i<3; i++) {

            for (int j=0; j<4; j++) {
                arr[i][j] = (int) (Math.random() * 10);                // adding random elements through [Math.random()] x 100 cause it give random [0.0-1.0]

//                System.out.println(arr[i][j]);
            }
        }


//        Print each element

        for (int i=0; i<3; i++) {

            for (int j=0; j<4; j++) {

                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }

//        print through enhanced loop(for each)

        for(int[] n : arr ){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }








    }
}




