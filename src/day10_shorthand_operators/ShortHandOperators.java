package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars += 2;
        System.out.println("cars = " + cars);
        cars += 5;
        System.out.println("cars = " + cars);
        cars -= 6;
        System.out.println("cars = " + cars);
        cars -= 1;
        cars = cars - 1;
        System.out.println("cars = " + cars);

        int electric = 13;
        cars += electric;
        System.out.println("electric = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        word += " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = ", but \"Selenium\" is more fun.";
        word += selenium;
        System.out.println("word = " + word);

        word += 1234;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);

        letter +=  3;
        System.out.println("letter = " + letter);

        letter += 1;
        System.out.println("letter = " + letter);

        letter += 2;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parkingFee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);

        parkingFee -= parkingFee;
        System.out.println("weekend parkingFee = " + parkingFee);

        int count = 2;
        count++;
        System.out.println("count = " + count);




    }
}
