import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans= isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int x){
        if(x<=0){
            return false;
        }
        int c=2;
        
        while(c*c<=x){
            if(x%c == 0){
                return false;
            }
            c++;
        }

        if(c*c>x){
            return true;
        }
        return false;

    }
}
