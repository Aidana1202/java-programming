package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept": "reject";
        System.out.println("reply = " + reply);

        if (hourlyRate > 45) {
            reply = "accept";
        } else {
            reply = "reject";
        }
        System.out.println("reply = " + reply);

        String todaysClass = "Java";
        String teacher = (todaysClass.equals("Java")) ? "Murodill, Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligible = true;
        String driving = isEligible ? "Have DL, can drive" : "No DL, can to drive";
        System.out.println("Is it eligible to drive = " + driving);
    }
}
