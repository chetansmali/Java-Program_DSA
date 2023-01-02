import java.util.Arrays;

public class ArrFindMax {
    //this pro is find max and change its position to 1st
    public static void main(String[] args) {
        int[] arr={5,3,8,9,7,2};
        for (int i = 0; i < arr.length; i++) {
            int k=maxfun(arr,i+1,arr.length);
           // System.out.println(k);
            if(arr[i] < arr[k]){
                arr[i]=arr[k];
            }

            int idx=k;
           //if(idx==arr.length-1){arr[idx]=0;}
            while(idx>0 && idx!=arr.length-1){
                 arr[idx]=arr[idx+1];
                 idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static int maxfun(int[] arr,int i,int n){
        int max1=0;
        int ind=0;
        for (int index = i; index < n; index++) {
                if(arr[index] > max1){
                    max1=arr[index];
                    ind=index;
                }
        }
      // System.out.println(Arrays.toString(arr));
        return ind;
    }
}
