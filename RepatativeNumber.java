import java.util.Arrays;
public class RepatativeNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,6,6,6,6,7,8};
        int t=6;

        System.out.println(Arrays.toString(rep(arr,t)));
    }
    static int[] rep(int[] arr,int t){
        int[] ans={-1,-1};
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            if(arr[s]==t){
               ans[0]=s;
               break;
            }

            if(arr[e]==t){
                ans[1]=e;
                break;
            }
            s++;
            e--;
        }

        return ans;
    }
}
