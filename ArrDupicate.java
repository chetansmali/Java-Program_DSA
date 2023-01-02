public class ArrDupicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,5,5};
        int n=arr.length;

        int ans=removeDuplicate(arr,n);
        //array is updated by the below function and return the size of array
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static int removeDuplicate(int[] arr, int n){
        if(n == 0 || n == 1){
            return n;
        }

        int j=0;
        //if not same then added the ith element in jth postion
        //if ele are same then skip
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        //added the last element in the array
        //if the same ele are repited at last then it will run till the j size
        //so if what ever last ele is there added
        //if same ele are last then j will not increment
        arr[j++] = arr[n-1];

        return j;
    }
}
