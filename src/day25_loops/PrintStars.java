package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 25; stars++) {
            System.out.print(stars + " * ");
        }
        System.out.println();

        String myStars = "";
        for(int n = 1; n <= 5; n++) {
            myStars += "* ";
        }

        System.out.println("myStars = " + myStars);
    }
}
