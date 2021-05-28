package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(2, 3);
        sum(2, 1, 2);
        sum(2, 2.2);
        sum("Aidana", "Hello");
    }
    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }
    //
    public static void sum(int num1, int num2, int num3){
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("Result = " + (num1+num2+num3));
    }
    //

    public static void sum(double num1, double num2) {
        System.out.println("sum(double num1, double num2)");
        System.out.println("Result = " + (num1+num2));
    }
    //
    public static void sum(String str1, String str2) {
        System.out.println("sum(String str1, String str2)");
        System.out.println("Result = " + str1 + " " + str2);
    }
}
