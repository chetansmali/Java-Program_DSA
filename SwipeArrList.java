import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwipeArrList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] list={10,2,5,3,44,6,9,7};

        int max=swip(list);

        System.out.println(Arrays.toString(list));
        System.out.println(max);
    }

    static int swip(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
