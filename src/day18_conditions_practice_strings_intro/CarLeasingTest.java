package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Jaguar";
        String model = "7";
        double price = 0.0;
        if (make.equals("Audi")){
            if (model.equals("Q8")) {
                price = 400;
            } else if (model.equals("Q7")) {
                price = 350;
            }
        } else {
            System.out.println("Invalid make");
            return;
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
    }
}
