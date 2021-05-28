package day44_custom_classes;

public class Animal {
    String type = "some animal";

    // behaviour / method()
    public void  eat() {
        System.out.println("Animal eats whole grain seeds");
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public void speak() {
        System.out.println("Speaking");
    }

}

