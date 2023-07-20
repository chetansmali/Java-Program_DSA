import javax.lang.model.util.ElementScanner14;

public class BinarySearch
{

public static void main(String args[])
{
	int[] arr={-25,-10,-5,-2,0,2,6,9,16,25,369};
	int target=9;
	System.out.println(search(arr,target));
}

static int search(int[] arr,int t)
{
	int start=0;
	int end=arr.length-1;

	while(start <= end)
	{
	int mid=start+(end -start)/2;
	if(t == arr[mid])
	{
		return mid;
	}
	else if(t > arr[mid]){
		start=mid+1;
	}else{
		end=mid-1;
	}

	}//while
return -1;

}//search

}//class