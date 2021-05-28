package day26_loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your multiplication number: ");
        int first = scan.nextInt();
        int second = 0;
        int third;
         if (first < 1 || first > 10) {
             System.out.println("ERROR: invalid input!");
             return;
         }
         for(int num = 1; num <= 10; num++) {

             second++;
             third = first * second;
             System.out.println(first + " x " + second + " = " + third);

         }
    }
}
