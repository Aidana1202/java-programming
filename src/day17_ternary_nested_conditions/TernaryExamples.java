package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 70;
        String result = (score > 60 ) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("x = " + x);

        score = 100;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);


        String evenOdd = (score % 2==0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);

        String available = "yes, in stock";
        String inStock = available.equals("yes, in stock") ? "Yes, in stock" : "Not available, sorry";
        System.out.println("inStock = " + inStock);

        String iPhone = "11 ProMax";
        int versionIphone = (iPhone.equals("11 ProMax")) ? 11 : 10;
        System.out.println("versionIphone = " + versionIphone);
    }
}
