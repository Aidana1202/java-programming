package Repl.it;
import java.util.*;
public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];


        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
            if (size < 2) {
                System.out.println("["+num[i]+"]");
                return;
            }
        }
        System.out.print("["+num[0]+", "+num[1]+"]");
    }
}
