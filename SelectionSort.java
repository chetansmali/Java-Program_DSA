import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            //find the max element in remaining array and swap with last index
            int last=arr.length-i-1; //last position of the array by ith pass
            int max=getMax(arr,0,last); 
            swipArr(arr, max, last);
        }
    }

    static int getMax(int[] arr,int start,int end){
        int max=start;
        for (int i = 0; i < arr.length; i++) {
                if(arr[max] > arr[i]){
                    max=i;
                }
        }
        return max;
    }

    static void swipArr(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
