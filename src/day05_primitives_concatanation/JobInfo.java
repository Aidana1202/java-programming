package day05_primitives_concatanation;

import org.omg.CORBA.ServiceDetail;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "PayPal";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Tomato, JUnit.";
        int salary = 123000;
        byte yearsExp = 3;
        boolean hasBenefits = true;

        System.out.println("Job Title is: " + title);
        System.out.println("Company Name is: " + company);
        System.out.println("Job description: " + jobDescription + "\nSalary is: $" + salary + "\nYears of Exp: " +
                yearsExp + "\nHas benefits? " + hasBenefits);






    }
}
