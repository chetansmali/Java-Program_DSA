public class InfinityArrBS {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,99,110,130,140,160,170};
        int target=110;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;        

        if(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }

        System.out.println(arr[end]);
        System.out.println(arr[start]);

        return binaryser(arr,target,start,end);  
    }

    static int binaryser(int[] arr,int target,int start,int end){
        while(start<=end){  
            int mid=start+(end-start)/2;
             if(target < arr[mid]){
                end=mid-1;
            }else if(target> arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
