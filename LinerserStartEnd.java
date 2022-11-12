public class LinerserStartEnd {
    public static void main(String argsp[]){
        int[] arr={12,5,4,6,2,7,9,510,4,88};
        int target =2;
        System.out.println(serLin(arr,target,1,5));
    }

    static int serLin(int[] arr, int target,int start,int end){
        int min=arr[0];

        for (int i =start; i <= end; i++) {
            if(arr[i]<min){
                min=arr[i];
            }            
        }
        return min;
    }
}
