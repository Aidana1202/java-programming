package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(0, 33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        System.out.println("numsList removed index 0 = " + numsList);
        numsList.remove(new Integer(4));
        System.out.println("removed number 4 by number = " + numsList);

        System.out.println("-----------------------------------------------------------------");
        //
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "redBull",
                "coke", "pepsi", "mdew", "kambucha", "celsius"));
        int caffeineAmount = 0;
        for (String each : drinksWithCaffeine) {
            if (each.equals("monster") || each.equals("redBull") || each.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(each + "'s Caffeine Amount is = " + caffeineAmount);
            } else if (each.equals("coffee") || each.equals("kambucha")) {
                caffeineAmount = 122;
                System.out.println(each + "'s Caffeine Amount is = " + caffeineAmount);
            } else if (each.equals("tea") || each.equals("coke") || each.equals("pepsi") || each.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(each + "'s Caffeine Amount is = " + caffeineAmount);
            }
        }
        System.out.println("-----------------------------------------------------------------");
        for(String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "redBull": case"celsius":
                   caffeineAmount = 150;
                   System.out.println(drink + "'s Caffeine Amount is = " + caffeineAmount);
                   break;
                case "coffee": case "kambucha":
                    caffeineAmount = 122;
                    System.out.println(drink + "'s Caffeine Amount is = " + caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + "'s Caffeine Amount is = " + caffeineAmount);
                    break;
            }
        }
        //one statement
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        //more than one statements
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("---------");
            System.out.println(drink.toLowerCase());

        });


    }
}