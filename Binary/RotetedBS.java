public class RotetedBS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=6;
        System.out.println(search(arr,target));
        
    }

    static int search(int[] arr,int target){
        int pivot=findpivot(arr);   

        //if did not found pivot jsut normal binary search
        if(pivot == -1){
            return  BinarySer(arr,target,0,arr.length-1);
        }
        
        //if pivot is found then we have two asc arrays
        //case 1
        if(arr[pivot] == target){
            return pivot;
        }

        //case 2
        if(target >= arr[0]){
            return BinarySer(arr, target, 0, pivot-1);
        }
        
        return BinarySer(arr, target, pivot+1, arr.length-1);

    }


    static int BinarySer(int[] arr,int target,int start,int end){
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
         return-1;
    }

    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            //4 cases over here 

            //case 1
            //that 1st condition to avoid IndexOutofBound
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            //case 2
            //that 1st condition to avoid IndexOutofBound
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            //case 3
            if(arr[mid] <= arr[start]){
                 end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

}
