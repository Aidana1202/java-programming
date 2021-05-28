package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Miami";
        if (city.equals("Miami") || city.equals("SanFrancisco")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }
        String teacher = "Nadir";
        if (teacher.equals("Murodill") || teacher.equals("Saim")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }
        if (teacher.equals("Murodill") || teacher.equals("Saim")) {
            System.out.println("It is Java class!!! " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("It is Soft skill class with - " + teacher);
        } else {
            System.out.println("Some class with Gurhan/Akbar ");
        }
        String company = "PayPal";
        double salary = 109_000.0;
        if (company.equals("Google") || salary >= 100_000.0)
        {
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }



    }
}
