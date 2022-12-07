import java.util.Arrays;

//Given an integer array nums of length n,
 //you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 class ConcatArr{
    public static void main(String[] args) {
        int[] nums={0,2,1};
        System.out.println(Arrays.toString(concat(nums)));
    }

    static int[] concat(int[] nums){
        int n=nums.length;
        int[] ans=new int[2*n];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
        }
        int c=0;
        for (int i = n; i < ans.length; i++) {
            ans[i]=nums[c];
            c++;
        }
        return ans;
    }
 }