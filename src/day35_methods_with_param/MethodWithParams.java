package day35_methods_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(10);
        for (int i = 0; i <= 6; i+=2) {
            displayValue(i);
        }
        //
        int score = 99;
        displayValue(score);
        //
        greetByName("Aidana");
        greetByName("Alex");
        String name = "Aset";
        greetByName(name);
    }
    public static void displayValue(int num) {
        System.out.println("Value is: " + num);
    }
    //
    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
