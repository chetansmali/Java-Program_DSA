import java.util.Arrays;

public class SumRepiArr {
        public static void main(String[] args) {
            int[] arr={1,2,3,4};
            System.out.println(Arrays.toString(sum(arr)));
        }

        static int[] sum(int[] arr){
            int[] s=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                s[i]=arr[i]+arr[i+1 ];
            }
            return s;
        }
}
