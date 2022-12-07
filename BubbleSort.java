import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            //for each step,max item will come at  the largest respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swip if the element is smaller then previous item
                if(arr[j] < arr[j-1]){
                    //swap elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
