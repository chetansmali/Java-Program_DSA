import java.util.Arrays;

public class LinerSerStr {
    public static void main(String args[]){
        String str="Chetan";
        char target='t';
        System.out.println("This will return the index value : "+strsearch(str, target));
        
        //this toCharArray() covert string into array string.
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println("thsi will return the T & F value: "+search(str, target));
    }

    static int strsearch(String str, char target){
        if(str.length()==0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {    
            if(target==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    //this will use inhenced for loop and toCharArray
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (char ch : str.toCharArray())  {
            if(ch==target){
                return true;
            }
            
        }
        return false;
    }
}
