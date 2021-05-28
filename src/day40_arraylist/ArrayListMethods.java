package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());
        if(shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppingList.add("shoes"); shoppingList.add("cheap monitor");
        shoppingList.add("mask"); shoppingList.add("wooden spoon");
        shoppingList.add("scooter"); shoppingList.add("java book");
        shoppingList.add("Tesla");

        System.out.println(shoppingList);
        if(shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to by = " + count);

        ////
        System.out.println("Is shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")) {
            System.out.println("Shoes in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }
        ////
        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);
        ////
        System.out.println("Done with shopping go back to coding");
        shoppingList.clear();
        System.out.println(shoppingList);
    }



}
