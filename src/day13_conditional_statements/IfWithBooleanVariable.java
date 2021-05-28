package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println(" Go and eat something");
        } else {
            System.out.println("Then code java");
        }
        double price = 150;
        boolean isAffordable = price <= 200;
        if (isAffordable == true) {
            System.out.println("I can afford it! Lets buy!!!");
        } else {
            System.out.println("Too Expensive!!!");
        }
        boolean isRemoteJob = true;
        //if(isRemoteJob != true){
        //if(isRemoteJob == false){
        if (!isRemoteJob) {
            System.out.println("Sorry, Im not interested");
        } else {
            System.out.println("Sure, I am interested, what is the interview process?");
        }


    }
}
