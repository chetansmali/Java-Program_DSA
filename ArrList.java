import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(500);
        // list.add(600);
        // list.add(800);
        // list.add(200);

        // for (int i = 0; i < 5; i++) {
        //     list.add(sc.nextInt());
        // }

        // System.out.println(list);

        // for (int i = 0; i < 5; i++) {
        //         System.out.println(list.get(i));
        // }

        // ArrayList<String> arr=new ArrayList<>();

        // for (int i = 0; i < 5; i++) {
        //     arr.add(sc.nextLine());
        // }

        // System.out.println("String arrar is");
        // System.out.println(arr);

        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(sc.nextInt());
            }
            
        }
        System.out.println(list);
    }
}
