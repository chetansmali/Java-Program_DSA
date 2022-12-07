import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        //run the step n-1 times
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j > 0; j--) {
                if( arr[j] < arr[j-1]){
                    swipArr(arr, j, j-1);
                }else{
                    break;
                }
           }
        }
    }

    static void swipArr(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
