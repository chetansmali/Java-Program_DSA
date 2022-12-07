import javax.swing.text.html.parser.TagElement;

public class SearchMontain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,0};
        int target=4;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr,int target){
        int peck=peackIndex(arr);
        int FirstTry=BinarySer(arr,target,0,peck);
        if(FirstTry != -1){
             return FirstTry;
        }
        //try to search in second half
        return BinarySer(arr, target, peck+1, arr.length);
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

    static int BinarySer(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start] < arr[end];

        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){   
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end= mid-1;
                }else{
                    start=end+1;
                }
            }else{
                if(target > arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    
}
