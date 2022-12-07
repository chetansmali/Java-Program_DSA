import javax.print.attribute.standard.NumberUpSupported;

public class EvenNuminDigit {
    public static void main(String[] args) {
        int[] nums={12,7,82,-9,6,-7845,-55};
        System.out.println(findNumber(nums));
        //this is an short cut of finding number of digits
        System.out.println(digit2(1245));
        
    }
    static int findNumber(int[] nums){
        int count=0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofDiigts=digits(num);
        // if(numberofDiigts%2==0){
        //     return true;
        // }
        // return false;
        return numberofDiigts % 2 == 0;
    }

    static int digits(int num){
        int coutn=0;
        if(num < 0){
            num=num*-1;
        }
        if(num ==0 ){
            return -1;
        }
        while(num>0){
            coutn++;
            num/=10;
        }
        return coutn;
    }
    
    // This log10 will give you number of digits.
    static int digit2(int num){
        return (int)(Math.log10(num)+1);
    }


}
