package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "UK";
        if(countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //
        String word = "JAVA";
        String check = (word.equals(word.toUpperCase())) ? "UPPER" : "LOWER";
        System.out.println("check = " + check);
        //




    }
}
