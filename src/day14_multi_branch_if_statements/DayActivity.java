package day14_multi_branch_if_statements;
import  java.util.Scanner;
public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How's the weather?");
        String weather = scan.nextLine();
        if (weather.equals("sunny")) {
            System.out.println(weather + " - Go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " - clean the car and build the snowman, drink hot chocolate and code java");
        } else if (weather.equals("windy")) {
            System.out.println(weather +" - be ready to loss power");
        } else {
            System.out.println(weather +" - just keep coding java");
        }

    }
}
