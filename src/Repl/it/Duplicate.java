package Repl.it;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        System.out.println(word1 + word1.replace(word1 , word2) + word2 + word2.replace(word2 , word1));
    }


}
