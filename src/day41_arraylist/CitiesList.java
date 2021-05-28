package day41_arraylist;
import java.util.ArrayList;
public class CitiesList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");

        //Add Ashgabat to index 0
        cities.add(0, "Ashgabat");
        //print all values in same line;
        System.out.println(cities);
        //print first and last city;
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(cities.size() - 1));

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        //for loop and print half values in same line CITIES
        for(int i = 0; i < cities.size() / 2; i++) {
            System.out.print(cities.get(i) + " ");

        }
        System.out.println();

        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        //delete item from array list
        //1) remove using index. Delete value at index 3;
        cities.remove(3);
        //2) remove using object/value
        cities.remove("New York");
        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();
        //make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + cities);
        //2) Using is empty
        if(cities.isEmpty()) {
            System.out.println("List is empty");
        }
        //3) check size():
        if(cities.size() == 0) {
            System.out.println("List is empty");
        }




}
}
