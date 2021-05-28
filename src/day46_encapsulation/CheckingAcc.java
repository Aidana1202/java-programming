package day46_encapsulation;

public class CheckingAcc {
    private double balance;
    private int accNumber;
    private String accHolder;
    private String type;

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public String getAccHolder (){
        return accHolder;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        if(!type.equalsIgnoreCase("cheking") || !type.equalsIgnoreCase("saving")) {
            System.out.println("ERROR");
        }
        return type;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CheckingAcc: " +
                "balance = $" + balance +
                ", accNumber = " + accNumber +
                ", accHolder = '" + accHolder + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}
