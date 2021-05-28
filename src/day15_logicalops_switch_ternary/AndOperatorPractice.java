package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "WoodenSpoon";
        if (onSale && freeShipping) {
            System.out.println(itemName + " will be in short time");
        } else {
            System.out.println(" We're sorry for inconvenience");
        }
        if (onSale && freeShipping && itemName.equals("WoodenSpoon")) {
            System.out.println("Add to cart - " + itemName);
        } else {
            System.out.println("Continue to shopping");
        }
        String location = "456 Ocean Dr, Miami, FL 22232";

    }
}
