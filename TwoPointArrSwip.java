import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class TwoPointArrSwip {
    public static void main(String[] args) {
        int[] arr={10,5,2,3,7,9,45,6,98,1};

        revarr(arr);

        System.out.println(Arrays.toString(args));
    }

    static void revarr(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start < end){
            swip(arr,start,end);
            start++;
            end--;
        }
    }

    static void swip(int[] arr,int ind1,int ind2){
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }

}
