package office_hours_03_22;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        String randomNumber = "";//234156

        while (randomNumber.length() != 6){

            int eachRandom = random.nextInt(10); // 0 - 9
            // int eachRandom = random.nextInt(9) + 1; // 1 - 9
            if(!randomNumber.contains(""+eachRandom)){
                randomNumber += eachRandom;
            }

        }

        System.out.println("Random Number: " + randomNumber);
    }

}
