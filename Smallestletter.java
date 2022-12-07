public class Smallestletter {
    public static void main(String[] args) {
        char[] arr={'c','d','f','g'};
        char target='g';
        System.out.println(nextGreatestChar(arr,target));
    }

    //Similar to ceiling number smallest char then target
    static char nextGreatestChar(char[] letter,char t){
             int start=0;
            int end=letter.length-1;
    
            while(start<=end){
                int mid=start+(end - start)/2; //best way to find mid ele => m=s-e/2 exceed the int range
                if(t < letter[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
             }
       // s % arr.length =>return index first value if nothing(last index char) found This is called Wraping around
       return letter[start%letter.length];
    }
}
