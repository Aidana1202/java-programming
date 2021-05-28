package day46_encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        CheckingAcc checkAcc = new CheckingAcc();
        checkAcc.setAccHolder("Aidana Baimukhambet");
        checkAcc.setAccNumber(1234566789);
        checkAcc.setType("cheking");
        checkAcc.setBalance(123000);
        System.out.println(checkAcc);
    }
}
