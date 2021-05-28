package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {
        CoffeeClass myCoffee = new CoffeeClass();
        myCoffee.setType("Espresso");
        System.out.println(myCoffee.getType());
        System.out.println("coffe amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refil = " + myCoffee.getAmount());
        myCoffee.drink(23);
        System.out.println("amount after drinking = " + myCoffee.getAmount());
        System.out.println(myCoffee.toString());
    }
}