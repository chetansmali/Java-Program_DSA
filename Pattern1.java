public class Pattern1 {
    public static void main(String[] args) {
       
        // pat1(5);//row == col
        // pat2(5);
        //pat3(5);
        //pat4(5);
        // pat5(5);
        //pat6(5);
        //pat7(5);
        //pat8(4);
        pat9(4);
    }

    static void pat1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pat4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pat5(int n){
        for (int i = 0; i < n*2; i++) {
            int col=i > n ? n*2-i : i;
            for (int j = 0; j < col; j++) {
                System.out.print("*  ");                
            }
            System.out.println();
        }
    }

    static void pat6(int n){
        for (int r = 0; r < n*2; r++) {
            int col= r > n ? n*2-r : r; 
            int spac=n-col;
            for (int s = 0; s < spac; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c < col; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pat7(int n){
        for (int r = 1; r < n; r++) {
            for (int c = 1; c < n; c++) {
                int p=Math.min(r, c);
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }

    static void pat8(int n){
        int orign =  n;
        n = 2 * n;
        for (int r = 0; r <= n; r++) {
                for (int c = 0; c <= n; c++) {
                    int p=orign - Math.min(Math.min(r, c),Math.min(n-r, n-c));
                    System.out.print(p + " ");
                }
                System.out.println();
        }
    }

    static void pat9(int n){
        for (int r = 1; r <= n; r++) {
            int spc=n-r;
            for (int s = 0; s <= spc; s++) {
                    System.out.print(" ");
            }
            
           int w=;
            for (int c = 1; c <=w  ; c++) {
                int p = c < n ? c : 2*n-c ;
                System.out.print(p + " ");
        }
        System.out.println();
        }
    }
}
