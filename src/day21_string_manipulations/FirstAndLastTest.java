package day21_string_manipulations;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM"; //PALINDROME METHOD
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }
        //
        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");
        }
        //
        String name = "level";
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        if (firstLetter == lastLetter) {
            System.out.println(name + " first and last match");
        } else {
            System.out.println(name + " first and last mismatch");
        }

    }
}
