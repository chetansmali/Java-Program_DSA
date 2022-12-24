import java.util.Arrays;
import java.util.Scanner;

public class BitSwip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println(Arrays.toString(bitSwip(n,n1)));
    }

    static int[] bitSwip(int a,int b){
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        
        return new int[]{a,b};
    }
}
