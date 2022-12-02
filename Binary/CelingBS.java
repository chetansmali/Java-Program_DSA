import javax.lang.model.util.ElementScanner14;

public class CelingBS {
    public static void main(String[] args) {
        int[] arr={2,4,8,9,12,14,16,17,18};
        int target=15;
        System.out.println(celing(arr, target) );
        
    }

    //Ceiling number return index of smallest no >= target
    static int celing(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end - start)/2; //best way to find mid ele => m=s-e/2 exceed the int range
            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target >arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
         }
   return start;
    }
}
