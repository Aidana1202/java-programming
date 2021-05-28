package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "Hello World";

        System.out.println(word.toUpperCase().replace(" ", "").toLowerCase().length());
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "almaty";
        System.out.println("city = " + city);
        //Almaty - a capitalized
        System.out.println( city.substring(0,1).toUpperCase() + city.substring(1));




    }
}
