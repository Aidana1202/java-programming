package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCars = toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCars + " cars in Parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println(slicesPerPerson);

        System.out.println("There are " + slicesPerPerson + " slices per person.");
        System.out.println("We orderd " + pizza + " pizza with " + slices +
                " slices, " + people + " people ate " + slicesPerPerson +
                " slices each.");







    }
}
