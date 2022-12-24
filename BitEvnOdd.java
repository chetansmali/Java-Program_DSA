import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class BitEvnOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(ebit(num));
    }

    static boolean ebit(int n){
        //byte b=(int)n;
        if((n & 1) == 0){
           return true;
        }else{
           return false;
        }
    }
}
