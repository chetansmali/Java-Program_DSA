import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are :");

        // for (int i = 0; i < arr.length; i++) {
        //         System.out.println(arr[i]+" ");
        // }

        // for(int a : arr){
        //     System.out.println(a);
        // }

        
    }
}
