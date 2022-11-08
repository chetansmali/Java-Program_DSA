import java.util.Arrays;
import java.util.Scanner;

class Free{
    static int x=100;
    public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int n1=sc.nextInt();
    // // int n2=sc.nextInt();
    // int s;
    // s=sum(n1);
    // System.out.println(s);
    // }


    // static int sum(int a){
    //     int ss=1;
    //    while(a>0){
    //     ss=ss*a;
    //     a--;
    //    }
    //    return ss;
    // System.out.println(x);
    // int x=500;
    // System.out.println(x);
    // fun();

    System.out.println("vararg topic");
    fun(10,20,"motu","shinchan","shiro","himavari");
      fun("hello");
    }

     static void fun(int a,int b,String ... x){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(x));
    }

    static void fun(String x){
        System.out.println(x);
    }
}