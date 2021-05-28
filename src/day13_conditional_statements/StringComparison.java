package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if(city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("Its not LA");
        }
        String weather = "Sunny";
        if (weather.equals("Sunny")) {
            System.out.println("Lets go out");
        } else {
            System.out.println("Lets stay home");
        }
    }
}
