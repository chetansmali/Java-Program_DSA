import java.util.Arrays;

import javax.swing.text.html.HTML.Tag;

public class Aaa2DLiner_ser {
    public static void main(String[] args) {
        int[][] arr={
            {10,2,15,32,45},
            {2,45,96,63,05},
            {-75,-5,20},
            {2,100}
        };
        int target=63;
        int[] ans=ser(arr, target);
        System.out.println("FOUND at index" + Arrays.toString(ans));
    }

    static int[] ser(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length;col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
