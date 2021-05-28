package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("Moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //jeep,lada, yugo, toyota, mazda, ford, moskvich, tesla;

        System.out.println(myCars.toString()); //prints all the cars
        String allCarsInOneString = myCars.toString(); //saves all cars in 1 string variable;

        System.out.println("allCarsInOneString = " + allCarsInOneString);

        //change index 0 to Lamborghini

        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars);

        myCars.set(4, "Honda");
        System.out.println("after set Honda = " + myCars);

        // replace ford to BMW
        System.out.println("index of Ford = " + myCars.indexOf("ford"));
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);
        myCars.set(6, "Zhiguli");
        System.out.println("after set Zhiguli = " + myCars);

        //replace ford with Trabant using single statement
        myCars.set(myCars.indexOf("ford"), "Trabant");
        System.out.println(myCars);

        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "Bugatti");
            System.out.println(myCars);
        } else {
            System.out.println("lada is not found");
        }

        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).equals("Lamborghini")) {
                myCars.set(i, "prius");
            } else if(myCars.get(i).equals("toyota")) {
                myCars.set(i, "lexus");
            } else if(myCars.get(i).equals("Trabant")) {
                myCars.set(i, "audi");
            }

        }
        System.out.println("after loop = " + myCars);



    }
}
