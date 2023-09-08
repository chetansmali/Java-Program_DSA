import java.util.Arrays;

class SortFind
{
    public static void main(String[] args) {
        int[] arr={10,5,23,61,75,75,75,6,94,55,1,1,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));   
        int[] NoreArr= new int[arr.length];
        for(int i=1;i<arr.length;i++){
                if(arr[i-1] != arr[i]){
                    NoreArr[i]=arr[i-1];
            }
        } 
        System.out.println(Arrays.toString(NoreArr)); 
     
    }

    static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[j]<a[j-1]){
                    int temp= a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}