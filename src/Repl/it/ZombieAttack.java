package Repl.it;
import java.util.Scanner;
public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        if(inhabitants == 0) {
            System.out.println("---- EXTINCT ----");
        } else {
            while(inhabitants != 0) {
                System.out.println("Day " + day + " [" + inhabitants + "]");
                day++;
                inhabitants = inhabitants/2;


            }
            System.out.println("---- EXTINCT ----");
        }

    }
}
