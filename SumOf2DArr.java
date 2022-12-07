public class SumOf2DArr {
    public static void main(String[] args) {
        int[][] arr={
            {3,2,1},
            {2,5,3},
            {8,0,1}
        };
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
