import java.util.Arrays;

import javax.naming.ldap.StartTlsRequest;

public class RowColMatrix {
    public static void main(String[] args) {
    int[][] arr={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
    };
    int target=33;
    System.out.println(Arrays.toString(serach(arr,target)));
    }

    static int[] serach(int[][] arr,int taget){
        int r=0;
        int c=arr.length-1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == taget){
                return new int[]{r,c};
            }

            if(arr[r][c] > taget){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
