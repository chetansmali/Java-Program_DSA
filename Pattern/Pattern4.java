package Pattern;

public class Pattern4 {
    public static void main(String args[]){
        int n = 5;

        for(int i=0;i<n * 2;i++){
            int d = i <= n  ?  n - i : i - n; 
            for(int j=0;j<=d;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


//  * * * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *