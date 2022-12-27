import java.util.Arrays;

public class ArrShuffle {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};//2,3,5,4,1,7
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int l = 0;
        int r = l+n;
        int idx = 0;
        int[] res = new int[nums.length];
        while(r<nums.length){
            res[idx++] = nums[l];
            res[idx++] = nums[r];
            l++;r++;
        }
        return res;
    }
}
