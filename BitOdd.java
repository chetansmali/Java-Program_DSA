public class BitOdd{
     public static void main(String[] args) {
        int n=69;
        boolean odd=isOdd(n);
        if(!odd){
            System.out.println("The nummber is even :" + n);
        }else{
            System.out.println("The nummber is odd :" + n);
        }
    }

    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}