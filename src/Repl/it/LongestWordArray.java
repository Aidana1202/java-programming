package Repl.it;
import java.util.*;
public class LongestWordArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String count = "";
        for(int i = 0; i < words.length; i++) {
            if( count.length() <= words[i].length()) {
                count = words[i];
            }

        }
        System.out.println(" " + count);
    }
}
