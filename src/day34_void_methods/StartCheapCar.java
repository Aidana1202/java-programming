package day34_void_methods;

public class StartCheapCar {
    public static void main(String[] args) {
        seatInCar();
        starTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    //seatInCar
    public static void seatInCar(){
        System.out.println("1. Open the door and seat in driver seat");
    }
    //startTheCar
    public static void starTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    //shiftToDrive
    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal and shift to 'D");
    }
    //pressGasPedal
    public static void pressGasPedal(){
        System.out.println("4. Hold Steering will with 2 hands and press gas pedal");
    }
}
