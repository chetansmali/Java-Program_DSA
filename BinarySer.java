import javax.lang.model.util.ElementScanner14;

public class BinarySer {
    public static void main(String[] args) 
    {
        // int[] arr={-55,-22,-5,0,2,4,6,8,12,15,22,45,55,62,74};
        // int target=55;
        int[] arr={99,84,81,75,71,65,55,40,22,10,-5,-15,-50};
        int target=55;
        System.out.println(search(arr, target) );
        
    }

    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=true;

        while(start<=end){
            //find wether the array is soted or not =>Asc
            if(arr[start]<arr[end]){
                isAsc=true;
            }else{
                isAsc=false;
            }

            if(isAsc)
            {
             int mid=start+(end - start)/2; //best way to find mid ele => m=s-e/2 exceed the int range
             if(target==arr[mid]){
                return mid;
             }
            if(target > arr[mid]){
                start=mid+1;
            } 
            else
            {
                end=mid-1;
            }
            }

            else{
                int mid=start+(end - start)/2; //best way to find mid ele => m=s-e/2 exceed the int range
             if(target==arr[mid]){
                return mid;
             }
            if(target < arr[mid]){
                start=mid+1;
            } 
            else
            {
                end=mid-1;
            }
        } 
        }
        return -1;
    }
}

