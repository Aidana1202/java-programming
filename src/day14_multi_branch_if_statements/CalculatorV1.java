package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {

        System.out.println("Enter 2 numbers");
        double num1 = 8;
        double num2 = 9;
        char operator = '-';
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("error");
        }

    }
}
