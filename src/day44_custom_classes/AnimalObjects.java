package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animalObj = new Animal();
        System.out.println(animalObj.type);

        animalObj.eat("grass");
        animalObj.eat();
        animalObj.speak();

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";


    }
}
