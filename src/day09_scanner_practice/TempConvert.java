package day09_scanner_practice;
import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        System.out.println("######### F to C CONVERTER PROGRAM ########");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in F: ");
        double fahrenheit = scan.nextDouble();
        double celcium = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "F in Celcium is: " + celcium);


    }
}
