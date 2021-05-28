package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "Aidana";
        System.out.println(word);
        System.out.println(word + " - " + word.length());
        //
        int count = word.length();
        System.out.println("count = " + count);
        //
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());
        //
        String password = "abc123";
        if (password.length() >= 6) {
            System.out.println("Valid amazon password");
        } else {
            System.out.println("Password too short!!");
        }
        //

    }
}
