public class SplitArr {
    public static void main(String[] args) {
        int[] arr={7,2,5,8,10};
        int m=2;
        System.out.println(splitAarray(arr, m));
    }

    static int splitAarray(int[] arr,int m){
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start, arr[i]);
            end+=arr[i];
        }

        //Binary search
        while(start < end){
            int mid=start+(end-start)/2;
            //calculate how may pices you can derived this is with this max sum
            int sum=0;
            int pices=1;

            for (int num : arr) {
                if(sum+num > mid){
                    //you can not add in this subarray,make new one
                    //say you add this num is subarray, then sum=bum
                    sum=num;
                    pices++;    
                }else{
                    sum+=num;
                }
                if(pices > m){
                    start=mid+1;
                }else{
                    end=mid;
                }
            }
        }
        return end; //here start == end both are same

    }
}
