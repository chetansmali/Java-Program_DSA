import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,6,5,5,5,8,9};
        int t=5;
        System.out.println(Arrays.toString(search(arr,t)));
    }

    static int[] search(int[] arr,int t){
        int[] ans={-1,-1};
        
        int start=firstIndex(arr,t,true);
        int end=firstIndex(arr,t,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int firstIndex(int[] arr, int t, boolean fvalue){
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end - start)/2; //best way to find mid ele => m=s-e/2 exceed the int range
            if(t <arr[mid]){
                end=mid-1;
            }
            else if(t> arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(fvalue){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
         }
            return ans;   
    }
}
