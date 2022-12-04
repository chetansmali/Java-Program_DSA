import java.util.Arrays;

public class MatrixBS {
    public static void main(String[] args) {
        int[][] arr={
            {10,12,22,38},
            {12,15,32,40},
            {16,20,37,50},
            {28,30,40,60}
        };
        int target=37;
        System.out.println(Arrays.toString(Matrixsearch(arr, target)));
    }

    static int[] Matrixsearch(int[][] mtx,int target){
        // int n=mtx.length;
        // System.out.println(n);
        int r=0;
        int c=mtx.length-1;

        while(r<mtx.length && c>=0){
            if(mtx[r][c]==target){
                return new int[]{r,c};
            }
            if(mtx[r][c] < target){
                r++;
            }else{
                c--;
            }
        }

         

        return new int[] {-1,-1};
    }
}
