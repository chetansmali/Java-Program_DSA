import java.util.Scanner;

public class BitFindith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        findi(n, i);
    }

    static void findi(int n,int i){
        int mask=n<<i;
        if((n & mask) == 1){
            System.out.println("is 1 present at position"+i);
        }else{
            System.out.println("no 1 is not present");
        }
       
    }
}
