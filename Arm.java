import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt(); 
        // int temp=n;
        // int r,sum=0;
        // while(n>0){
        //     r=n%10;
        //     sum=sum+(r*r*r);
        //     n=n/10;
        // }
        // if(temp==sum){
        //     System.out.println("yes is armstron number "+ sum);
        // }else{
        //     System.out.println("no not armsrtong "+ sum);
        // }
        

        for(int i=100;i<1000;i++)
        {
           if(isarm(i)){
            System.out.print(i + ", ");
           }
        }
        
    }

    static boolean isarm(int n){
        int orgi=n;
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(orgi==sum){
            return true;
        }else{
            return false;
        }

    }
}
