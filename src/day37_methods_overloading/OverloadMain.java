package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(2, 3);

    }
    public static void main(int num1, int num2) {
        System.out.println("Result = " + (num1+ num2));
    }
}
