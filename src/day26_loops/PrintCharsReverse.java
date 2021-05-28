package day26_loops;

public class PrintCharsReverse {
    public static void main(String[] args) {
        String word = "java";
        //
        System.out.println(word.length()); // 4
        //
        System.out.print(word.charAt(0));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(2));
        System.out.println(word.charAt(3));
        //
        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + " - " + word.charAt(i));
        }

        //
          // java reverse
        for (int n = word.length() - 1; n >= 0; n--) {
            System.out.print(" " + word.charAt(n));

        }



    }
}
