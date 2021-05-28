package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(13.2, 13.3));
        System.out.println(add(15, 15));
        double sum = add(100, 300);
        System.out.println(sum);
        System.out.println("100 + 200 = " + add(100,200));
        ///////
        System.out.println(minus(100,80));
        ///////
        System.out.println(multiply(5, 5));
        ///////
        System.out.println(divide(100, 20));

    }
    //
    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    //
    public static double minus(double num1, double num2) {
        System.out.println("Result is: ");
        double sum = num1 - num2;
        return sum;
    }
    //
    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
        }
        //
    public static double divide(double num1, double num2) {
        double sum = num1/num2;
        return sum;
    }
    }

