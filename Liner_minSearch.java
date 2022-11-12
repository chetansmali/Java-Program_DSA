import java.util.Scanner;
import java.util.Arrays;

public class Liner_minSearch {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];

    System.out.println("Enter array elements :");
    for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
    }

    System.out.println(Arrays.toString(arr));
    System.out.println();
    System.out.println(min(arr));
    
 }  
 
 static int min(int[] arr){
    int min=arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(min>arr[i]){
            min=arr[i];
        }
    }
    return min;
 }
 
}
