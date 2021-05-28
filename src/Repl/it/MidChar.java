package Repl.it;
import java.util.*;
public class MidChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int letterNum = word.length();
        boolean even = letterNum % 2 == 0;
        int halfLetterNum = word.length() / 2;

        if (!even) {
            if(letterNum >= 3) {
                System.out.println(word.charAt(halfLetterNum));
            } else if(letterNum == 1) {
                System.out.println(word + word + word);
            }
        } else {
            if (even) {
                if (letterNum >= 4) {
                    System.out.println("" + word.charAt(halfLetterNum -1) +  word.charAt(halfLetterNum));
                } else if (letterNum == 2) {
                    System.out.println(word + word);
                }




    }

} }}
