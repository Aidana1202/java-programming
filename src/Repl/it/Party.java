package Repl.it;
import java.util.*;
public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        String list, quest, addQuest;
        System.out.println("Please enter guest name:");
        quest = input.next();
        list = quest ;
        do{
            System.out.println("Do you want to enter new guest name:");
            addQuest = input.next();
            if(addQuest.equals("yes")) {
                System.out.println("Please enter guest name:");
                quest = input.next();
                list = list +  (", " + quest);
            }


        }while(addQuest.equals("yes"));
        System.out.println("Guest's list: " + list);
    }
}
