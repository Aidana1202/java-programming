package day35_methods_with_param;

public class Counter {
    public static void main(String[] args) {
        count(10);
        //
        int num = 18;
        count(num);
        //
        String word = "Wooden Spoon";
        count(word.length());
        //
        printAge(2003);
    }
    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //
    public static void printAge(int year) {
        int age = 2021-year;
        System.out.println("Birth year: " + year + ". Age: " + age + ".");
    }
}
