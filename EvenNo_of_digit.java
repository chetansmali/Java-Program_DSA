public class EvenNo_of_digit {
    public static void main(String[] args) {
        int[][] arr={
            {2233,30,1},
            {3,63,2123456},
            {90,523,15}
        };
        System.out.println(itt(arr));
       
    } 
    
    static int itt(int[][] arr){
        int cou=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(digit(arr[i][j])) {
                    cou++;
                }            
            }
        }
        return cou;
    }

    static boolean digit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        // System.out.println(count);
        if(count %2 ==0 ){
            return true;
        }
        return false;
    }
}