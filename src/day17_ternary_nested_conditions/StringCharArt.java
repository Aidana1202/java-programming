package day17_ternary_nested_conditions;

public class StringCharArt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));//j
        System.out.println(word.charAt(1));//a
        System.out.println(word.charAt(2));//v
        System.out.println(word.charAt(3));//a
        // System.out.println(word.charAt(4)); ERROR!!!!!!!
        System.out.println(word + "-" + word.length());
        //
        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char four = company.charAt(3);
        char five = company.charAt(4);
        char six = company.charAt(5);
        char seven = company.charAt(6);
        char eight = company.charAt(7);

        System.out.println(first + " " + second + " " + third + " " + four + " " +
                five + " " + six + " " + seven + " " + eight);
        String withSpaces = first + " " + second + " " + third + " " + four + " " +
                five + " " + six + " " + seven + " " + eight;
        System.out.println("withSpaces = " + withSpaces);







    }
}
