import java.util.Arrays;

import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.parser.TagElement;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 96)));
        
    }

    static int[] bianrysearch(int[][] matrix,int row,int cStart,int cEnd,int taget){
        while(cStart <= cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid] == taget){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < taget){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][]arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        int rStart=0;
        int rEnd=row-1;
        int cmid=col/2;

        if(row ==1){
            return bianrysearch(arr, 0, 0, col-1, target);
        }

        //run the loop till 2 row are remaining
        while(rStart < (rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;

            if(arr[mid][cmid] == target ){
                return new int[]{mid,cmid};
            }
            if(arr[mid][cmid] < target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }

        //now we have 2 rows
        //check whether the target is the col of 2 row
        if(arr[rStart][cmid] == target){
            return new int[]{rStart,cmid};
        }
        if(arr[rStart+1][cmid] == target){
            return new int[]{rStart,cmid};
        }
 
        //search in 1st half
        if(target <= arr[rStart][cmid-1]){
            return bianrysearch(arr, rStart, 0, cmid-1, target);

        }

        //search in 2nd half 
        if(target >= arr[rStart][cmid+1] && target <= arr[rStart][col-1]){
            return bianrysearch(arr, rStart, cmid+1, col-1, target);

        }

        //search in 3rd half
        if(target <= arr[rStart+1][cmid-1]){
            return bianrysearch(arr, rStart+1, 0, cmid-1, target);

        }else{
            return bianrysearch(arr, rStart+1, cmid+1, cmid-1, target);
        }

        // search in 4th half
    }
}
