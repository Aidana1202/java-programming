package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(100,100));
        ///////
        System.out.println(CreditScore.getCreditScore());
        CreditScore.checkEligible(718);
        /////
        double d1 = 23.2;
        double d2 = 23.3;
        double result = Calculator.add(d1, d2);
        System.out.println(result);
    }
}
