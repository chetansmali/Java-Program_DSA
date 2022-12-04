public class MontainArr {   //Montain array or peack array means its has increasing and decreasing numbers.[1,4,5,7,9,8,6,3,2] 
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,0};
        System.out.println(peackIndex(arr));
    }
//Finding max number or peak numberr from montain array
    static int peackIndex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid] > arr[mid]+1){
                //when your in dec part of array
                //This may be the answer but look at the left
                //this is why end != mid -1
                end=mid;
            }else{
                //when your in asc part of array
                start=mid+1; //bcz we konw that mid+1 ele > mid ele
            }   
        }
        //in the end , sart and end both are pointing to the largest ele
        //s ans e always trying to find the max number in above two checks  
        return start;
    }
}
