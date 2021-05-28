package Repl.it;
import java.util.Scanner;
public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        //int twice = word.length() / 2;
        System.out.println(" " + word.charAt(word.length() / 2  + 1) + word.charAt(word.length() / 2 ));
    }



}
