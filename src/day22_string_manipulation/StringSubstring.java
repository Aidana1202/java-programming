package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        System.out.println(word.substring(0 , 4)); // END INDEX IS NOT INCLUDED
        System.out.println(word.substring(0 , 7));
        // PRINT IS
        System.out.println(word.substring(5, 7));
        //PRINT FUN
        System.out.println(word.substring(8 , 11));
        // substring(startIndex) - it will read from start until end
        System.out.println(word.substring(0));
        // PRINT IS FUN
        System.out.println(word.substring(5));

    }
}
