import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swip(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    static void swip(int[] num,int first,int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
