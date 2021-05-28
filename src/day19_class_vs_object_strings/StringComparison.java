package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Almaty";
        System.out.println(city.equals("Almaty")); // TRUE
        System.out.println(city.equals("almaty")); // FALSE
        System.out.println(city.equals("Almaty ")); // FALSE

        //EQUALSIGNORECASE() METHOD - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("AlMaty")); // TRUE
        System.out.println(city.equalsIgnoreCase("ALMATY")); // TRUE
        System.out.println(city.equalsIgnoreCase("almaty")); // TRUE
        System.out.println(city.equalsIgnoreCase("Almatty")); // FALSE
        System.out.println(city.equalsIgnoreCase("Al maty")); // FALSE

        if(city.equals("ALMATY")) {
            System.out.println("equals() true");
        } else {
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("ALMATY")) {
            System.out.println("equalsIgnoreCase() TRUE");
        } else {
            System.out.println("equalsIgnoreCase() FALSE");
        }



    }
}
