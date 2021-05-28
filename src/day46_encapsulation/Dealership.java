package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Mercedes GLE350");
        System.out.println(car1.getModel());

         car1.setYear(2021);
        System.out.println(car1.getYear());

        car1.setMileage(16800);
        System.out.println(car1.getMileage());

        System.out.println(car1);

        Car alphaRomeo = new Car();

        alphaRomeo.setModel("Alpha Romeo");
        alphaRomeo.setYear(2021);
        alphaRomeo.setMileage(000);

        System.out.println(alphaRomeo);
    }


}
