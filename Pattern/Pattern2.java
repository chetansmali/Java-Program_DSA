package Pattern;

public class Pattern2 {
    public static void main(String args[]){
        int n = 5;
         for(int r=1;r<=n*2;r++)
         {
            int d= r > n ? n*2 - r : n-r;
            for(int c=1;c<d;c++){
                System.out.print(" *");
            }
            System.out.println();
         }
    }
    
}
