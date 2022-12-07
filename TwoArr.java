import java.util.Arrays;
import java.util.Scanner;

public class TwoArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] arr=new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =sc.nextInt();
            }
        }

        System.out.println("Printting the content of the elements");

        // for (int i = 0; i < arr.length; i++) {
        //         for (int j = 0; j < arr[i].length; j++) {
        //             System.out.print(arr[i][j]+" ");
        //         }
        //         System.out.println();
        // }

        //Prints row array in , just print the row 
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //enhenc for loop
        // for(int[] a:arr){
        //     System.out.println(Arrays.toString(a));
        // }
    }
}
