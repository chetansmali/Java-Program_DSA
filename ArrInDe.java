public class ArrInDe {
    public static void main(String[] args) {
        int x=0;
        String[] arr={"--X","X++","X++"};

        //IF array is in the integer format use this code
        // int[] arr={x++,++x,--x,x--};
        // for (int i = 0; i < arr.length; i++) {
        //     x=(arr[i]);
        
        // }
        // System.out.println(x);
        
        System.out.println(fu(arr));
    }

    static int fu(String[] arr){
        int x=0;
        for (String ob : arr) {
          x +=ob.charAt(1) == '+' ? 1: -1;            
        }
        return x;
    }

   
}
