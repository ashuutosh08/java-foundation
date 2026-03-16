package core_oop_03;

public class ThreeDimensionArray {
    static void main() {

        int arr [][][] = new int[3][4][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    arr[i][j][k] = ((int)(Math.random() * 10));
                }
            }
        }



//        print element

        for(int n[][] : arr){
            for(int m[] : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println("-----");
        }


    }
}
