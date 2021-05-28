package day25_loops;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and End:");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if(start <= end){
        for(int i = start;  i <= end; i++) {
            System.out.print(i + " ");
        } } else if(start > end) {
            System.out.println();
            for(int i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
        }



    }
}
