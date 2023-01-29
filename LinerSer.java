import javax.swing.text.html.parser.TagElement;

public class LinerSer {
    public static void main(String args[]){
        int[] arr={15,5,23,95,6,7,-5,9,2,11};
        int target=6;
        int ans=Liner(arr, target);
        System.out.println("this will return index value : "+ans);
        System.out.println("This will return element :" +Liner2(arr, target) );
        System.out.println("This will return true or flase : " +Lin(arr, target));
    }

    static int Liner(int[] arr,int target){
        //array is empty it will return -1
        if(arr.length==0){
            return -1;
        }

        //it will check one-by-one,if element is found then it will return index value
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        //if no element is found
        return -1;
    }

    //this function will return the element
    static int Liner2(int[] arr, int target ){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if(element==target){
                return  element;
            }
        }
        return -1;
    }

    //this will return the boolean value
    static boolean Lin(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for (int i : arr) {
                if(i== target){
                    return true;
                }
        }
        return false;
    }
}
