import javax.sound.sampled.SourceDataLine;

public class Arr2DLiner_min {
    public static void main(String[] args) {
        int[][] arr={
            {24,2,12,13,65,055},
            {84,956,-77},
            {78,1,45,3}
        };
        System.out.println(LinMin(arr));
    }
    static int LinMin(int[][] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j]<min) {
                        min=arr[i][j];
                    }              
            }
        }
        return min;
    }
}
