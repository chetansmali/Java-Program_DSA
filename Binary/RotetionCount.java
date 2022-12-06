public class RotetionCount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        //if array is sorted no. of rotation are 0
        //int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(CountRotation(arr));
    }

    static int CountRotation(int[] arr){
        int pivot=findpivot(arr);
        //if array is roteated the pivot+1 =>that is pivot is returing the index value
        return pivot+1;
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
