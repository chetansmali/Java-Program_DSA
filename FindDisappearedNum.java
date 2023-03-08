import java.util.Arrays;

public class FindDisappearedNum {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swip(arr,i,correct);
            }else{
                i++;
            }
        }

        //serach for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return new int[]{index+1};
            }
        }

        return new int[]{arr.length};
    }

#This will swip the numbers in ordered manner
    static void swip(int[] num,int first,int second){
        int temp = num[first];
        num[first] = num[second];
        num[second] = temp;
    }
}
