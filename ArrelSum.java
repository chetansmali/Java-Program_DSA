import java.util.Arrays;

public class ArrelSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        System.out.println(Arrays.toString(sum(arr)));
    }

    static int[] sum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}
