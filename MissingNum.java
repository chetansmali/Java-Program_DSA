import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swip(arr,i,correct);
            }else{
                i++;
            }
        }

        //serach for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    static void swip(int[] num,int first,int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
