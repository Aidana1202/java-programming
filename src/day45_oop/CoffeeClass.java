package day45_oop;

public class CoffeeClass {

    int amount;
    String type;

    @Override
    public String toString() {
        return "CoffeeClass{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill() {
        amount = 100;
    }

    public void drink(int someAmount) {
        if (someAmount < amount) {
            amount -= someAmount;
        } else {
            System.out.println("ERROR");
        }
    }

    public int getAmount() {
       return amount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType(){
        return type;
    }


}
