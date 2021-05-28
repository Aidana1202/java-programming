package Repl.it;
import java.util.*;
public class FirstAndLastsCharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(int i = 0; i<words.length; i++) {
            char [] wordsArray = words[i].toCharArray();
           // System.out.println(wordsArray.charAt(0));
        }

    }
}
